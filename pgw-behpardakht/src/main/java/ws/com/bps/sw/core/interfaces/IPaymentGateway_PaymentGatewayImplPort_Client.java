
package ws.com.bps.sw.core.interfaces;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import ws.com.bps.sw.pgw.service.PaymentGatewayService;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-12-03T17:50:20.082+03:30
 * Generated source version: 3.4.5
 */
public final class IPaymentGateway_PaymentGatewayImplPort_Client {


	private IPaymentGateway_PaymentGatewayImplPort_Client() {
	}

	public static void main(String args[]) throws Exception {

		PaymentGatewayService ss = new PaymentGatewayService();
		IPaymentGateway port = ss.getPaymentGatewayImplPort();

		{
			System.out.println("Invoking bpRefundRequest...");
			long _bpRefundRequest_terminalId = 0;
			String _bpRefundRequest_userName = "";
			String _bpRefundRequest_userPassword = "";
			long _bpRefundRequest_orderId = 0;
			long _bpRefundRequest_saleOrderId = 0;
			long _bpRefundRequest_saleReferenceId = 0;
			long _bpRefundRequest_refundAmount = 0;
			String _bpRefundRequest__return = port.bpRefundRequest(_bpRefundRequest_terminalId, _bpRefundRequest_userName, _bpRefundRequest_userPassword, _bpRefundRequest_orderId, _bpRefundRequest_saleOrderId, _bpRefundRequest_saleReferenceId, _bpRefundRequest_refundAmount);
			System.out.println("bpRefundRequest.result=" + _bpRefundRequest__return);


		}
		{
			System.out.println("Invoking bpSaleReferenceIdRequest...");
			long _bpSaleReferenceIdRequest_terminalId = 0;
			String _bpSaleReferenceIdRequest_userName = "";
			String _bpSaleReferenceIdRequest_userPassword = "";
			long _bpSaleReferenceIdRequest_orderId = 0;
			long _bpSaleReferenceIdRequest_saleOrderId = 0;
			String _bpSaleReferenceIdRequest__return = port.bpSaleReferenceIdRequest(_bpSaleReferenceIdRequest_terminalId, _bpSaleReferenceIdRequest_userName, _bpSaleReferenceIdRequest_userPassword, _bpSaleReferenceIdRequest_orderId, _bpSaleReferenceIdRequest_saleOrderId);
			System.out.println("bpSaleReferenceIdRequest.result=" + _bpSaleReferenceIdRequest__return);


		}
		{
			System.out.println("Invoking bpDynamicPayRequest...");
			long _bpDynamicPayRequest_terminalId = 0;
			String _bpDynamicPayRequest_userName = "";
			String _bpDynamicPayRequest_userPassword = "";
			long _bpDynamicPayRequest_orderId = 0;
			long _bpDynamicPayRequest_amount = 0;
			String _bpDynamicPayRequest_localDate = "";
			String _bpDynamicPayRequest_localTime = "";
			String _bpDynamicPayRequest_additionalData = "";
			String _bpDynamicPayRequest_callBackUrl = "";
			String _bpDynamicPayRequest_payerId = "";
			long _bpDynamicPayRequest_subServiceId = 0;
			String _bpDynamicPayRequest_mobileNo = "";
			String _bpDynamicPayRequest_encPan = "";
			String _bpDynamicPayRequest_panHiddenMode = "";
			String _bpDynamicPayRequest_cartItem = "";
			String _bpDynamicPayRequest_enc = "";
			String _bpDynamicPayRequest__return = port.bpDynamicPayRequest(_bpDynamicPayRequest_terminalId, _bpDynamicPayRequest_userName, _bpDynamicPayRequest_userPassword, _bpDynamicPayRequest_orderId, _bpDynamicPayRequest_amount, _bpDynamicPayRequest_localDate, _bpDynamicPayRequest_localTime, _bpDynamicPayRequest_additionalData, _bpDynamicPayRequest_callBackUrl, _bpDynamicPayRequest_payerId, _bpDynamicPayRequest_subServiceId, _bpDynamicPayRequest_mobileNo, _bpDynamicPayRequest_encPan, _bpDynamicPayRequest_panHiddenMode, _bpDynamicPayRequest_cartItem, _bpDynamicPayRequest_enc);
			System.out.println("bpDynamicPayRequest.result=" + _bpDynamicPayRequest__return);


		}
		{
			System.out.println("Invoking bpInquiryRequest...");
			long _bpInquiryRequest_terminalId = 0;
			String _bpInquiryRequest_userName = "";
			String _bpInquiryRequest_userPassword = "";
			long _bpInquiryRequest_orderId = 0;
			long _bpInquiryRequest_saleOrderId = 0;
			long _bpInquiryRequest_saleReferenceId = 0;
			String _bpInquiryRequest__return = port.bpInquiryRequest(_bpInquiryRequest_terminalId, _bpInquiryRequest_userName, _bpInquiryRequest_userPassword, _bpInquiryRequest_orderId, _bpInquiryRequest_saleOrderId, _bpInquiryRequest_saleReferenceId);
			System.out.println("bpInquiryRequest.result=" + _bpInquiryRequest__return);


		}
		{
			System.out.println("Invoking bpSettleRequest...");
			long _bpSettleRequest_terminalId = 0;
			String _bpSettleRequest_userName = "";
			String _bpSettleRequest_userPassword = "";
			long _bpSettleRequest_orderId = 0;
			long _bpSettleRequest_saleOrderId = 0;
			long _bpSettleRequest_saleReferenceId = 0;
			String _bpSettleRequest__return = port.bpSettleRequest(_bpSettleRequest_terminalId, _bpSettleRequest_userName, _bpSettleRequest_userPassword, _bpSettleRequest_orderId, _bpSettleRequest_saleOrderId, _bpSettleRequest_saleReferenceId);
			System.out.println("bpSettleRequest.result=" + _bpSettleRequest__return);


		}
		{
			System.out.println("Invoking bpChargePayRequest...");
			long _bpChargePayRequest_terminalId = 0;
			String _bpChargePayRequest_userName = "";
			String _bpChargePayRequest_userPassword = "";
			long _bpChargePayRequest_orderId = 0;
			long _bpChargePayRequest_amount = 0;
			String _bpChargePayRequest_localDate = "";
			String _bpChargePayRequest_localTime = "";
			String _bpChargePayRequest_additionalData = "";
			String _bpChargePayRequest_callBackUrl = "";
			String _bpChargePayRequest_payerId = "";
			String _bpChargePayRequest__return = port.bpChargePayRequest(_bpChargePayRequest_terminalId, _bpChargePayRequest_userName, _bpChargePayRequest_userPassword, _bpChargePayRequest_orderId, _bpChargePayRequest_amount, _bpChargePayRequest_localDate, _bpChargePayRequest_localTime, _bpChargePayRequest_additionalData, _bpChargePayRequest_callBackUrl, _bpChargePayRequest_payerId);
			System.out.println("bpChargePayRequest.result=" + _bpChargePayRequest__return);


		}
		{
			System.out.println("Invoking bpCumulativeDynamicPayRequest...");
			long _bpCumulativeDynamicPayRequest_terminalId = 0;
			String _bpCumulativeDynamicPayRequest_userName = "";
			String _bpCumulativeDynamicPayRequest_userPassword = "";
			long _bpCumulativeDynamicPayRequest_orderId = 0;
			long _bpCumulativeDynamicPayRequest_amount = 0;
			String _bpCumulativeDynamicPayRequest_localDate = "";
			String _bpCumulativeDynamicPayRequest_localTime = "";
			String _bpCumulativeDynamicPayRequest_additionalData = "";
			String _bpCumulativeDynamicPayRequest_callBackUrl = "";
			String _bpCumulativeDynamicPayRequest_mobileNo = "";
			String _bpCumulativeDynamicPayRequest_encPan = "";
			String _bpCumulativeDynamicPayRequest_panHiddenMode = "";
			String _bpCumulativeDynamicPayRequest_cartItem = "";
			String _bpCumulativeDynamicPayRequest_enc = "";
			String _bpCumulativeDynamicPayRequest__return = port.bpCumulativeDynamicPayRequest(_bpCumulativeDynamicPayRequest_terminalId, _bpCumulativeDynamicPayRequest_userName, _bpCumulativeDynamicPayRequest_userPassword, _bpCumulativeDynamicPayRequest_orderId, _bpCumulativeDynamicPayRequest_amount, _bpCumulativeDynamicPayRequest_localDate, _bpCumulativeDynamicPayRequest_localTime, _bpCumulativeDynamicPayRequest_additionalData, _bpCumulativeDynamicPayRequest_callBackUrl, _bpCumulativeDynamicPayRequest_mobileNo, _bpCumulativeDynamicPayRequest_encPan, _bpCumulativeDynamicPayRequest_panHiddenMode, _bpCumulativeDynamicPayRequest_cartItem, _bpCumulativeDynamicPayRequest_enc);
			System.out.println("bpCumulativeDynamicPayRequest.result=" + _bpCumulativeDynamicPayRequest__return);


		}
		{
			System.out.println("Invoking bpPayRequest...");
			long _bpPayRequest_terminalId = 0;
			String _bpPayRequest_userName = "";
			String _bpPayRequest_userPassword = "";
			long _bpPayRequest_orderId = 0;
			long _bpPayRequest_amount = 0;
			String _bpPayRequest_localDate = "";
			String _bpPayRequest_localTime = "";
			String _bpPayRequest_additionalData = "";
			String _bpPayRequest_callBackUrl = "";
			String _bpPayRequest_payerId = "";
			String _bpPayRequest_mobileNo = "";
			String _bpPayRequest_encPan = "";
			String _bpPayRequest_panHiddenMode = "";
			String _bpPayRequest_cartItem = "";
			String _bpPayRequest_enc = "";
			String _bpPayRequest__return = port.bpPayRequest(_bpPayRequest_terminalId, _bpPayRequest_userName, _bpPayRequest_userPassword, _bpPayRequest_orderId, _bpPayRequest_amount, _bpPayRequest_localDate, _bpPayRequest_localTime, _bpPayRequest_additionalData, _bpPayRequest_callBackUrl, _bpPayRequest_payerId, _bpPayRequest_mobileNo, _bpPayRequest_encPan, _bpPayRequest_panHiddenMode, _bpPayRequest_cartItem, _bpPayRequest_enc);
			System.out.println("bpPayRequest.result=" + _bpPayRequest__return);


		}
		{
			System.out.println("Invoking bpRefundInquiryRequest...");
			long _bpRefundInquiryRequest_terminalId = 0;
			String _bpRefundInquiryRequest_userName = "";
			String _bpRefundInquiryRequest_userPassword = "";
			long _bpRefundInquiryRequest_orderId = 0;
			long _bpRefundInquiryRequest_refundOrderId = 0;
			long _bpRefundInquiryRequest_refundReferenceId = 0;
			String _bpRefundInquiryRequest__return = port.bpRefundInquiryRequest(_bpRefundInquiryRequest_terminalId, _bpRefundInquiryRequest_userName, _bpRefundInquiryRequest_userPassword, _bpRefundInquiryRequest_orderId, _bpRefundInquiryRequest_refundOrderId, _bpRefundInquiryRequest_refundReferenceId);
			System.out.println("bpRefundInquiryRequest.result=" + _bpRefundInquiryRequest__return);


		}
		{
			System.out.println("Invoking bpReversalRequest...");
			long _bpReversalRequest_terminalId = 0;
			String _bpReversalRequest_userName = "";
			String _bpReversalRequest_userPassword = "";
			long _bpReversalRequest_orderId = 0;
			long _bpReversalRequest_saleOrderId = 0;
			long _bpReversalRequest_saleReferenceId = 0;
			String _bpReversalRequest__return = port.bpReversalRequest(_bpReversalRequest_terminalId, _bpReversalRequest_userName, _bpReversalRequest_userPassword, _bpReversalRequest_orderId, _bpReversalRequest_saleOrderId, _bpReversalRequest_saleReferenceId);
			System.out.println("bpReversalRequest.result=" + _bpReversalRequest__return);


		}
		{
			System.out.println("Invoking bpPosRefundRequest...");
			String _bpPosRefundRequest_user = "";
			String _bpPosRefundRequest_password = "";
			long _bpPosRefundRequest_saleReferenceId = 0;
			long _bpPosRefundRequest_refundAmount = 0;
			String _bpPosRefundRequest__return = port.bpPosRefundRequest(_bpPosRefundRequest_user, _bpPosRefundRequest_password, _bpPosRefundRequest_saleReferenceId, _bpPosRefundRequest_refundAmount);
			System.out.println("bpPosRefundRequest.result=" + _bpPosRefundRequest__return);


		}
		{
			System.out.println("Invoking bpRefundToPANRequest...");
			String _bpRefundToPANRequest_user = "";
			String _bpRefundToPANRequest_password = "";
			Long _bpRefundToPANRequest_pan = null;
			long _bpRefundToPANRequest_amount = 0;
			Long _bpRefundToPANRequest_saleReferenceId = null;
			long _bpRefundToPANRequest_terminalId = 0;
			String _bpRefundToPANRequest_mobileNo = "";
			String _bpRefundToPANRequest_orderId = "";
			String _bpRefundToPANRequest__return = port.bpRefundToPANRequest(_bpRefundToPANRequest_user, _bpRefundToPANRequest_password, _bpRefundToPANRequest_pan, _bpRefundToPANRequest_amount, _bpRefundToPANRequest_saleReferenceId, _bpRefundToPANRequest_terminalId, _bpRefundToPANRequest_mobileNo, _bpRefundToPANRequest_orderId);
			System.out.println("bpRefundToPANRequest.result=" + _bpRefundToPANRequest__return);


		}
		{
			System.out.println("Invoking bpVerifyRequest...");
			long _bpVerifyRequest_terminalId = 0;
			String _bpVerifyRequest_userName = "";
			String _bpVerifyRequest_userPassword = "";
			long _bpVerifyRequest_orderId = 0;
			long _bpVerifyRequest_saleOrderId = 0;
			long _bpVerifyRequest_saleReferenceId = 0;
			String _bpVerifyRequest__return = port.bpVerifyRequest(_bpVerifyRequest_terminalId, _bpVerifyRequest_userName, _bpVerifyRequest_userPassword, _bpVerifyRequest_orderId, _bpVerifyRequest_saleOrderId, _bpVerifyRequest_saleReferenceId);
			System.out.println("bpVerifyRequest.result=" + _bpVerifyRequest__return);


		}
		{
			System.out.println("Invoking bpRefundVerifyRequest...");
			long _bpRefundVerifyRequest_terminalId = 0;
			String _bpRefundVerifyRequest_userName = "";
			String _bpRefundVerifyRequest_userPassword = "";
			long _bpRefundVerifyRequest_orderId = 0;
			long _bpRefundVerifyRequest_refundOrderId = 0;
			long _bpRefundVerifyRequest_refundReferenceId = 0;
			String _bpRefundVerifyRequest__return = port.bpRefundVerifyRequest(_bpRefundVerifyRequest_terminalId, _bpRefundVerifyRequest_userName, _bpRefundVerifyRequest_userPassword, _bpRefundVerifyRequest_orderId, _bpRefundVerifyRequest_refundOrderId, _bpRefundVerifyRequest_refundReferenceId);
			System.out.println("bpRefundVerifyRequest.result=" + _bpRefundVerifyRequest__return);


		}

		System.exit(0);
	}

}
