
package chatapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the chatapplication package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://chatapplication/", "LoginResponse");
    private final static QName _A_QNAME = new QName("http://chatapplication/", "a");
    private final static QName _AResponse_QNAME = new QName("http://chatapplication/", "aResponse");
    private final static QName _Login_QNAME = new QName("http://chatapplication/", "Login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: chatapplication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link A }
     * 
     */
    public A createA() {
        return new A();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AResponse }
     * 
     */
    public AResponse createAResponse() {
        return new AResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://chatapplication/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://chatapplication/", name = "a")
    public JAXBElement<A> createA(A value) {
        return new JAXBElement<A>(_A_QNAME, A.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://chatapplication/", name = "aResponse")
    public JAXBElement<AResponse> createAResponse(AResponse value) {
        return new JAXBElement<AResponse>(_AResponse_QNAME, AResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://chatapplication/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
