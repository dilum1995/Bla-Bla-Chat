
package WebService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WebService package. 
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

    private final static QName _UsernamePasswordMismatch_QNAME = new QName("http://ServicesGenerator/", "UsernamePasswordMismatch");
    private final static QName _SignIn_QNAME = new QName("http://ServicesGenerator/", "signIn");
    private final static QName _SignInResponse_QNAME = new QName("http://ServicesGenerator/", "signInResponse");
    private final static QName _SignUpResponse_QNAME = new QName("http://ServicesGenerator/", "signUpResponse");
    private final static QName _UsernameNotFound_QNAME = new QName("http://ServicesGenerator/", "UsernameNotFound");
    private final static QName _SignUp_QNAME = new QName("http://ServicesGenerator/", "signUp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsernamePasswordMismatch }
     * 
     */
    public UsernamePasswordMismatch createUsernamePasswordMismatch() {
        return new UsernamePasswordMismatch();
    }

    /**
     * Create an instance of {@link SignIn }
     * 
     */
    public SignIn createSignIn() {
        return new SignIn();
    }

    /**
     * Create an instance of {@link SignInResponse }
     * 
     */
    public SignInResponse createSignInResponse() {
        return new SignInResponse();
    }

    /**
     * Create an instance of {@link SignUpResponse }
     * 
     */
    public SignUpResponse createSignUpResponse() {
        return new SignUpResponse();
    }

    /**
     * Create an instance of {@link SignUp }
     * 
     */
    public SignUp createSignUp() {
        return new SignUp();
    }

    /**
     * Create an instance of {@link UsernameNotFound }
     * 
     */
    public UsernameNotFound createUsernameNotFound() {
        return new UsernameNotFound();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsernamePasswordMismatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "UsernamePasswordMismatch")
    public JAXBElement<UsernamePasswordMismatch> createUsernamePasswordMismatch(UsernamePasswordMismatch value) {
        return new JAXBElement<UsernamePasswordMismatch>(_UsernamePasswordMismatch_QNAME, UsernamePasswordMismatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "signIn")
    public JAXBElement<SignIn> createSignIn(SignIn value) {
        return new JAXBElement<SignIn>(_SignIn_QNAME, SignIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "signInResponse")
    public JAXBElement<SignInResponse> createSignInResponse(SignInResponse value) {
        return new JAXBElement<SignInResponse>(_SignInResponse_QNAME, SignInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "signUpResponse")
    public JAXBElement<SignUpResponse> createSignUpResponse(SignUpResponse value) {
        return new JAXBElement<SignUpResponse>(_SignUpResponse_QNAME, SignUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsernameNotFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "UsernameNotFound")
    public JAXBElement<UsernameNotFound> createUsernameNotFound(UsernameNotFound value) {
        return new JAXBElement<UsernameNotFound>(_UsernameNotFound_QNAME, UsernameNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "signUp")
    public JAXBElement<SignUp> createSignUp(SignUp value) {
        return new JAXBElement<SignUp>(_SignUp_QNAME, SignUp.class, null, value);
    }

}
