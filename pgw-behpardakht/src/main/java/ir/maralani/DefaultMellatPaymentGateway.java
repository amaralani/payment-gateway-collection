package ir.maralani;

import ir.maralani.dto.Configuration;
import ir.maralani.dto.Response;
import ir.maralani.dto.inquiry.InquiryRequest;
import ir.maralani.dto.pay.*;
import ir.maralani.dto.refund.PosRefundRequest;
import ir.maralani.dto.refund.RefundRequest;
import ir.maralani.dto.reversal.ReversalRequest;
import ir.maralani.dto.settle.SettleRequest;
import ir.maralani.dto.verify.VerifyRequest;
import ir.maralani.exception.InvalidResponseException;
import ir.maralani.exception.NotImplementedException;
import ir.maralani.exception.VerifyRequestFailedException;
import ws.com.bps.sw.core.interfaces.IPaymentGateway;
import ws.com.bps.sw.pgw.service.PaymentGatewayService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DefaultMellatPaymentGateway implements MellatPaymentGateway {

	private final IPaymentGateway paymentGateway;

	private final String username;
	private final String password;
	private final long terminalId;
	private final Configuration configuration;

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	private final SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");

	public DefaultMellatPaymentGateway(String username, String password, long terminalId) {
		this.username = username;
		this.password = password;
		this.terminalId = terminalId;
		this.configuration = new Configuration();
		this.paymentGateway = new PaymentGatewayService().getPaymentGatewayImplPort();
	}

	public DefaultMellatPaymentGateway(String username, String password, long terminalId,
									   Configuration configuration) {
		this.username = username;
		this.password = password;
		this.terminalId = terminalId;
		this.paymentGateway = new PaymentGatewayService().getPaymentGatewayImplPort();
		this.configuration = configuration;
	}

	@Override
	public Response sendPayRequest(PayRequest payRequest) {
		return convertResponse(paymentGateway.bpPayRequest(terminalId, username, password, payRequest.getOrderId(),
				payRequest.getAmount(), dateFormat.format(payRequest.getDate()),
				timeFormat.format(payRequest.getDate()), payRequest.getAdditionalData(), payRequest.getCallBackUrl(),
				payRequest.getPayerId(), payRequest.getMobile(), configuration.getEncPan(),
				configuration.getPanHiddenMode(), configuration.getCartItem(), configuration.getEnc()));
	}

	@Override
	public Response sendChargeRequest(ChargeRequest chargeRequest) {
		return convertResponse(paymentGateway.bpChargePayRequest(terminalId, username, password,
				chargeRequest.getOrderId(), chargeRequest.getAmount(), dateFormat.format(chargeRequest.getDate()),
				timeFormat.format(chargeRequest.getDate()), chargeRequest.getAdditionalData(),
				chargeRequest.getCallBackUrl(), chargeRequest.getPayerId()));
	}

	@Override
	public Response sendVerifyRequest(VerifyRequest verifyRequest) {
		return convertResponse(paymentGateway.bpVerifyRequest(terminalId, username, password,
				verifyRequest.getOrderId(), verifyRequest.getSaleOrderId(), verifyRequest.getSaleReferenceId()));
	}

	@Override
	public Response sendSettleRequest(SettleRequest settleRequest) {
		return convertResponse(paymentGateway.bpSettleRequest(terminalId, username, password,
				settleRequest.getOrderId(), settleRequest.getSaleOrderId(), settleRequest.getSaleReferenceId()));
	}

	@Override
	public Response settleIfVerified(VerifyRequest verifyRequest) throws VerifyRequestFailedException {
		Response response = sendVerifyRequest(verifyRequest);
		if (response.getResponseCode() != 0) {
			throw new VerifyRequestFailedException(response);
		}

		SettleRequest settleRequest = new SettleRequest();
		settleRequest.setOrderId(verifyRequest.getOrderId());
		settleRequest.setSaleOrderId(verifyRequest.getSaleOrderId());
		settleRequest.setSaleReferenceId(verifyRequest.getSaleReferenceId());

		return sendSettleRequest(settleRequest);
	}

	@Override
	public Response sendInquiryRequest(InquiryRequest inquiryRequest) {
		return convertResponse(paymentGateway.bpInquiryRequest(terminalId, username, password,
				inquiryRequest.getOrderId(), inquiryRequest.getSaleOrderId(), inquiryRequest.getSaleReferenceId()));
	}

	@Override
	public Response sendReversalRequest(ReversalRequest reversalRequest) {
		return convertResponse(paymentGateway.bpReversalRequest(terminalId, username, password,
				reversalRequest.getOrderId(), reversalRequest.getSaleOrderId(), reversalRequest.getSaleReferenceId()));
	}

	@Override
	public Response sendRefundRequest(RefundRequest refundRequest) {
		return convertResponse(paymentGateway.bpPosRefundRequest(username, password,
				refundRequest.getSaleReferenceId(), refundRequest.getRefundAmount()));
	}

	@Override
	public Response sendPOSRefundRequest(PosRefundRequest posRefundRequest) {
		throw new NotImplementedException("POS Refund Reques is not implemented yet.");
	}

	@Override
	public Response sendDynamicPayRequest(DynamicPayRequest dynamicPayRequest) {
		return convertResponse(paymentGateway.bpDynamicPayRequest(terminalId, username, password,
				dynamicPayRequest.getOrderId(), dynamicPayRequest.getAmount(),
				dateFormat.format(dynamicPayRequest.getDate()), timeFormat.format(dynamicPayRequest.getDate()),
				dynamicPayRequest.getAdditionalData(), dynamicPayRequest.getCallBackUrl(),
				dynamicPayRequest.getPayerId(), dynamicPayRequest.getSubServiceId(), dynamicPayRequest.getMobile(),
				configuration.getEncPan(), configuration.getPanHiddenMode(), configuration.getCartItem(),
				configuration.getEnc()));
	}

	@Override
	public Response sendCumulativeDynamicPayRequest(CumulativePayRequest cumulativePayRequest) {
		String additionalData = convertCumulativeAdditionalDataToString(cumulativePayRequest.getAccountData());
		return convertResponse(paymentGateway.bpCumulativeDynamicPayRequest(terminalId, username, password,
				cumulativePayRequest.getOrderId(), cumulativePayRequest.getAmount(),
				dateFormat.format(cumulativePayRequest.getDate()), timeFormat.format(cumulativePayRequest.getDate()),
				additionalData, cumulativePayRequest.getCallBackUrl(), cumulativePayRequest.getMobile(),
				configuration.getEncPan(), configuration.getPanHiddenMode(), configuration.getCartItem(),
				configuration.getEnc()));
	}


	private Response convertResponse(String response) {
		String[] responseParts = response.split(",");
		try {
			return new Response(Integer.parseInt(responseParts[0]), responseParts[1]);
		} catch (Exception e) {
			throw new InvalidResponseException(response);
		}
	}

	private String convertCumulativeAdditionalDataToString(CumulativePayRequestAdditionalDataItem[] items) {
		List<String> parts = new ArrayList<>();
		for (CumulativePayRequestAdditionalDataItem item : items) {
			parts.add(String.join(",", item.getAccountId(), String.valueOf(item.getAmount()), item.getPaymentId()));
		}
		return String.join(";", parts);
	}
}
