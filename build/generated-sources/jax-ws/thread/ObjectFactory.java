
package thread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the thread package. 
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

    private final static QName _Hello_QNAME = new QName("http://Thread/", "hello");
    private final static QName _AddThreadsResponse_QNAME = new QName("http://Thread/", "addThreadsResponse");
    private final static QName _AddThreads_QNAME = new QName("http://Thread/", "addThreads");
    private final static QName _HelloResponse_QNAME = new QName("http://Thread/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: thread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddThreadsResponse }
     * 
     */
    public AddThreadsResponse createAddThreadsResponse() {
        return new AddThreadsResponse();
    }

    /**
     * Create an instance of {@link AddThreads }
     * 
     */
    public AddThreads createAddThreads() {
        return new AddThreads();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Thread/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Thread/", name = "addThreadsResponse")
    public JAXBElement<AddThreadsResponse> createAddThreadsResponse(AddThreadsResponse value) {
        return new JAXBElement<AddThreadsResponse>(_AddThreadsResponse_QNAME, AddThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Thread/", name = "addThreads")
    public JAXBElement<AddThreads> createAddThreads(AddThreads value) {
        return new JAXBElement<AddThreads>(_AddThreads_QNAME, AddThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Thread/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
