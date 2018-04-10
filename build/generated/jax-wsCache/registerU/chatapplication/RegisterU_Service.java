
package chatapplication;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "registerU", targetNamespace = "http://chatapplication/", wsdlLocation = "http://localhost:8080/WebApplication/registerU?wsdl")
public class RegisterU_Service
    extends Service
{

    private final static URL REGISTERU_WSDL_LOCATION;
    private final static WebServiceException REGISTERU_EXCEPTION;
    private final static QName REGISTERU_QNAME = new QName("http://chatapplication/", "registerU");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebApplication/registerU?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTERU_WSDL_LOCATION = url;
        REGISTERU_EXCEPTION = e;
    }

    public RegisterU_Service() {
        super(__getWsdlLocation(), REGISTERU_QNAME);
    }

    public RegisterU_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTERU_QNAME, features);
    }

    public RegisterU_Service(URL wsdlLocation) {
        super(wsdlLocation, REGISTERU_QNAME);
    }

    public RegisterU_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTERU_QNAME, features);
    }

    public RegisterU_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegisterU_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegisterU
     */
    @WebEndpoint(name = "registerUPort")
    public RegisterU getRegisterUPort() {
        return super.getPort(new QName("http://chatapplication/", "registerUPort"), RegisterU.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegisterU
     */
    @WebEndpoint(name = "registerUPort")
    public RegisterU getRegisterUPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://chatapplication/", "registerUPort"), RegisterU.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTERU_EXCEPTION!= null) {
            throw REGISTERU_EXCEPTION;
        }
        return REGISTERU_WSDL_LOCATION;
    }

}