
package com.demo.webservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.webservice.service package. 
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

    private final static QName _Login_QNAME = new QName("http://service.webservice.demo.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://service.webservice.demo.com/", "loginResponse");
    private final static QName _Show_QNAME = new QName("http://service.webservice.demo.com/", "show");
    private final static QName _ShowResponse_QNAME = new QName("http://service.webservice.demo.com/", "showResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Show }
     * 
     */
    public Show createShow() {
        return new Show();
    }

    /**
     * Create an instance of {@link ShowResponse }
     * 
     */
    public ShowResponse createShowResponse() {
        return new ShowResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.demo.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.demo.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Show }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.demo.com/", name = "show")
    public JAXBElement<Show> createShow(Show value) {
        return new JAXBElement<Show>(_Show_QNAME, Show.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.demo.com/", name = "showResponse")
    public JAXBElement<ShowResponse> createShowResponse(ShowResponse value) {
        return new JAXBElement<ShowResponse>(_ShowResponse_QNAME, ShowResponse.class, null, value);
    }

}
