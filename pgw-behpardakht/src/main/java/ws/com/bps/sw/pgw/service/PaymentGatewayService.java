package ws.com.bps.sw.pgw.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import ws.com.bps.sw.core.interfaces.IPaymentGateway;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-12-03T17:50:20.261+03:30
 * Generated source version: 3.4.5
 *
 */
@WebServiceClient(name = "PaymentGatewayImplService",
                  wsdlLocation = "https://bpm.shaparak.ir/pgwchannel/services/pgw?wsdl",
                  targetNamespace = "http://service.pgw.sw.bps.com/")
public class PaymentGatewayService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.pgw.sw.bps.com/", "PaymentGatewayImplService");
    public final static QName PaymentGatewayImplPort = new QName("http://service.pgw.sw.bps.com/", "PaymentGatewayImplPort");
    static {
        URL url = null;
        try {
            url = new URL("https://bpm.shaparak.ir/pgwchannel/services/pgw?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PaymentGatewayService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://bpm.shaparak.ir/pgwchannel/services/pgw?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PaymentGatewayService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns IPaymentGateway
     */
    @WebEndpoint(name = "PaymentGatewayImplPort")
    public IPaymentGateway getPaymentGatewayImplPort() {
        return super.getPort(PaymentGatewayImplPort, IPaymentGateway.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPaymentGateway
     */
    @WebEndpoint(name = "PaymentGatewayImplPort")
    public IPaymentGateway getPaymentGatewayImplPort(WebServiceFeature... features) {
        return super.getPort(PaymentGatewayImplPort, IPaymentGateway.class, features);
    }

}
