package ws.com.bps.sw.core.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-12-03T17:50:20.241+03:30
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://interfaces.core.sw.bps.com/", name = "IPaymentGateway")
@XmlSeeAlso({ObjectFactory.class})
public interface IPaymentGateway {

    @WebMethod
    @RequestWrapper(localName = "bpRefundRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundRequest")
    @ResponseWrapper(localName = "bpRefundRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpRefundRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "saleOrderId", targetNamespace = "")
        long saleOrderId,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        long saleReferenceId,
        @WebParam(name = "refundAmount", targetNamespace = "")
        long refundAmount
    );

    @WebMethod
    @RequestWrapper(localName = "bpSaleReferenceIdRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpSaleReferenceIdRequest")
    @ResponseWrapper(localName = "bpSaleReferenceIdRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpSaleReferenceIdRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpSaleReferenceIdRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "saleOrderId", targetNamespace = "")
        long saleOrderId
    );

    @WebMethod
    @RequestWrapper(localName = "bpDynamicPayRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpDynamicPayRequest")
    @ResponseWrapper(localName = "bpDynamicPayRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpDynamicPayRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpDynamicPayRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "amount", targetNamespace = "")
        long amount,
        @WebParam(name = "localDate", targetNamespace = "")
        String localDate,
        @WebParam(name = "localTime", targetNamespace = "")
        String localTime,
        @WebParam(name = "additionalData", targetNamespace = "")
        String additionalData,
        @WebParam(name = "callBackUrl", targetNamespace = "")
        String callBackUrl,
        @WebParam(name = "payerId", targetNamespace = "")
        String payerId,
        @WebParam(name = "subServiceId", targetNamespace = "")
        long subServiceId,
        @WebParam(name = "mobileNo", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "encPan", targetNamespace = "")
        String encPan,
        @WebParam(name = "panHiddenMode", targetNamespace = "")
        String panHiddenMode,
        @WebParam(name = "cartItem", targetNamespace = "")
        String cartItem,
        @WebParam(name = "enc", targetNamespace = "")
        String enc
    );

    @WebMethod
    @RequestWrapper(localName = "bpInquiryRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpInquiryRequest")
    @ResponseWrapper(localName = "bpInquiryRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpInquiryRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpInquiryRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "saleOrderId", targetNamespace = "")
        long saleOrderId,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        long saleReferenceId
    );

    @WebMethod
    @RequestWrapper(localName = "bpSettleRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpSettleRequest")
    @ResponseWrapper(localName = "bpSettleRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpSettleRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpSettleRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "saleOrderId", targetNamespace = "")
        long saleOrderId,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        long saleReferenceId
    );

    @WebMethod
    @RequestWrapper(localName = "bpChargePayRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpChargePayRequest")
    @ResponseWrapper(localName = "bpChargePayRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpChargePayRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpChargePayRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "amount", targetNamespace = "")
        long amount,
        @WebParam(name = "localDate", targetNamespace = "")
        String localDate,
        @WebParam(name = "localTime", targetNamespace = "")
        String localTime,
        @WebParam(name = "additionalData", targetNamespace = "")
        String additionalData,
        @WebParam(name = "callBackUrl", targetNamespace = "")
        String callBackUrl,
        @WebParam(name = "payerId", targetNamespace = "")
        String payerId
    );

    @WebMethod
    @RequestWrapper(localName = "bpCumulativeDynamicPayRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpCumulativeDynamicPayRequest")
    @ResponseWrapper(localName = "bpCumulativeDynamicPayRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpCumulativeDynamicPayRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpCumulativeDynamicPayRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "amount", targetNamespace = "")
        long amount,
        @WebParam(name = "localDate", targetNamespace = "")
        String localDate,
        @WebParam(name = "localTime", targetNamespace = "")
        String localTime,
        @WebParam(name = "additionalData", targetNamespace = "")
        String additionalData,
        @WebParam(name = "callBackUrl", targetNamespace = "")
        String callBackUrl,
        @WebParam(name = "mobileNo", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "encPan", targetNamespace = "")
        String encPan,
        @WebParam(name = "panHiddenMode", targetNamespace = "")
        String panHiddenMode,
        @WebParam(name = "cartItem", targetNamespace = "")
        String cartItem,
        @WebParam(name = "enc", targetNamespace = "")
        String enc
    );

    @WebMethod
    @RequestWrapper(localName = "bpPayRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpPayRequest")
    @ResponseWrapper(localName = "bpPayRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpPayRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpPayRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "amount", targetNamespace = "")
        long amount,
        @WebParam(name = "localDate", targetNamespace = "")
        String localDate,
        @WebParam(name = "localTime", targetNamespace = "")
        String localTime,
        @WebParam(name = "additionalData", targetNamespace = "")
        String additionalData,
        @WebParam(name = "callBackUrl", targetNamespace = "")
        String callBackUrl,
        @WebParam(name = "payerId", targetNamespace = "")
        String payerId,
        @WebParam(name = "mobileNo", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "encPan", targetNamespace = "")
        String encPan,
        @WebParam(name = "panHiddenMode", targetNamespace = "")
        String panHiddenMode,
        @WebParam(name = "cartItem", targetNamespace = "")
        String cartItem,
        @WebParam(name = "enc", targetNamespace = "")
        String enc
    );

    @WebMethod
    @RequestWrapper(localName = "bpRefundInquiryRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundInquiryRequest")
    @ResponseWrapper(localName = "bpRefundInquiryRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundInquiryRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpRefundInquiryRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "refundOrderId", targetNamespace = "")
        long refundOrderId,
        @WebParam(name = "refundReferenceId", targetNamespace = "")
        long refundReferenceId
    );

    @WebMethod
    @RequestWrapper(localName = "bpReversalRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpReversalRequest")
    @ResponseWrapper(localName = "bpReversalRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpReversalRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpReversalRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "saleOrderId", targetNamespace = "")
        long saleOrderId,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        long saleReferenceId
    );

    @WebMethod
    @RequestWrapper(localName = "bpPosRefundRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpPosRefundRequest")
    @ResponseWrapper(localName = "bpPosRefundRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpPosRefundRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpPosRefundRequest(

        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        long saleReferenceId,
        @WebParam(name = "refundAmount", targetNamespace = "")
        long refundAmount
    );

    @WebMethod
    @RequestWrapper(localName = "bpRefundToPANRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundToPANRequest")
    @ResponseWrapper(localName = "bpRefundToPANRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundToPANRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpRefundToPANRequest(

        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "pan", targetNamespace = "")
        Long pan,
        @WebParam(name = "amount", targetNamespace = "")
        long amount,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        Long saleReferenceId,
        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "mobileNo", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "orderId", targetNamespace = "")
        String orderId
    );

    @WebMethod
    @RequestWrapper(localName = "bpVerifyRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpVerifyRequest")
    @ResponseWrapper(localName = "bpVerifyRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpVerifyRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpVerifyRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "saleOrderId", targetNamespace = "")
        long saleOrderId,
        @WebParam(name = "saleReferenceId", targetNamespace = "")
        long saleReferenceId
    );

    @WebMethod
    @RequestWrapper(localName = "bpRefundVerifyRequest", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundVerifyRequest")
    @ResponseWrapper(localName = "bpRefundVerifyRequestResponse", targetNamespace = "http://interfaces.core.sw.bps.com/", className = "com.bps.sw.core.interfaces.BpRefundVerifyRequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String bpRefundVerifyRequest(

        @WebParam(name = "terminalId", targetNamespace = "")
        long terminalId,
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "")
        String userPassword,
        @WebParam(name = "orderId", targetNamespace = "")
        long orderId,
        @WebParam(name = "refundOrderId", targetNamespace = "")
        long refundOrderId,
        @WebParam(name = "refundReferenceId", targetNamespace = "")
        long refundReferenceId
    );
}