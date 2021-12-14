package ir.maralani;

import ir.maralani.dto.Response;
import ir.maralani.dto.inquiry.InquiryRequest;
import ir.maralani.dto.pay.ChargeRequest;
import ir.maralani.dto.pay.CumulativePayRequest;
import ir.maralani.dto.pay.DynamicPayRequest;
import ir.maralani.dto.pay.PayRequest;
import ir.maralani.dto.refund.PosRefundRequest;
import ir.maralani.dto.refund.RefundRequest;
import ir.maralani.dto.reversal.ReversalRequest;
import ir.maralani.dto.settle.SettleRequest;
import ir.maralani.dto.verify.VerifyRequest;
import ir.maralani.exception.VerifyRequestFailedException;

public interface MellatPaymentGateway {

	/**
	 * Create payment request.
	 *
	 * @param payRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendPayRequest(PayRequest payRequest);

	/**
	 * Create charge request.
	 *
	 * @param chargeRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendChargeRequest(ChargeRequest chargeRequest);

	/**
	 * Verify a request.
	 * This method is used to check if the user has truly paid in the gateway page or the callback is manual.
	 * <p>
	 * To reverse a verified transaction call {@link #sendReversalRequest(ReversalRequest)}.
	 *
	 * @param verifyRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendVerifyRequest(VerifyRequest verifyRequest);

	/**
	 * Settle the transaction.
	 * If {@link #sendVerifyRequest(VerifyRequest)} is successful <strong>This method must be called to receive the
	 * money.</strong>
	 * <p>
	 * To refund a settled transaction call {@link #sendRefundRequest(RefundRequest)}.
	 *
	 * @param settleRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendSettleRequest(SettleRequest settleRequest);

	/**
	 * Calls {@link #sendVerifyRequest(VerifyRequest)} and {@link #sendSettleRequest(SettleRequest)} together.
	 * If you are sure there will be no problem after verifying the request you may use this.
	 * <p>
	 * To refund a settled transaction call {@link #sendRefundRequest(RefundRequest)}.
	 *
	 * @param verifyRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 * Response is the result of settlement not verify.
	 * @throws VerifyRequestFailedException If verify request fails.
	 */
	Response settleIfVerified(VerifyRequest verifyRequest) throws VerifyRequestFailedException;

	/**
	 * Check the status of a transaction.
	 *
	 * @param inquiryRequest Holds all necessary values to call Behpardakht service.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendInquiryRequest(InquiryRequest inquiryRequest);

	/**
	 * Reverse a verified transaction. This method asks the bank to return the funds to the customer after calling
	 * verify. Settled transactions can not be reversed by this method.
	 * <p>
	 * <strong>This method can be called no longer than 3 hours after calling {
	 * {@link #sendVerifyRequest(VerifyRequest)}}.
	 * </strong>
	 *
	 * @param reversalRequest Holds all necessary values to call Behpardakht service.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendReversalRequest(ReversalRequest reversalRequest);

	/**
	 * Refund a settled transaction. This method asks the bank to return the funds to the customer after calling
	 * settle.
	 *
	 * @param refundRequest Holds all necessary values to call Behpardakht service.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendRefundRequest(RefundRequest refundRequest);

	/**
	 * Refund a POS transaction. This method asks the bank to return the funds to the customer after a POS transaction.
	 * This method is not implemented yet.
	 *
	 * @param posRefundRequest Holds all necessary values to call Behpardakht service.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendPOSRefundRequest(PosRefundRequest posRefundRequest);

	/**
	 * Create a dynamic payment request. Dynamic payment requests support a sub-service id (code shenase hesab varizi).
	 *
	 * @param dynamicPayRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendDynamicPayRequest(DynamicPayRequest dynamicPayRequest);

	/**
	 * Create a cumulative dynamic payment request. Cumulative payment requests support have multiple account
	 * information in their requests.
	 *
	 * @param cumulativePayRequest Holds all the necessary values to call Behpardakht services.
	 * @return A {@link Response} with a response code and a reference id. Response code {@code 0} means success.
	 */
	Response sendCumulativeDynamicPayRequest(CumulativePayRequest cumulativePayRequest);


}
