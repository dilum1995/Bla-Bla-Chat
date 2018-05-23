
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

    private final static QName _AddThread_QNAME = new QName("http://ServicesGenerator/", "addThread");
    private final static QName _GetThreadMessage_QNAME = new QName("http://ServicesGenerator/", "getThreadMessage");
    private final static QName _GetThreadMessageResponse_QNAME = new QName("http://ServicesGenerator/", "getThreadMessageResponse");
    private final static QName _AddThreadResponse_QNAME = new QName("http://ServicesGenerator/", "addThreadResponse");
    private final static QName _AddMessage_QNAME = new QName("http://ServicesGenerator/", "addMessage");
    private final static QName _AddMessageResponse_QNAME = new QName("http://ServicesGenerator/", "addMessageResponse");
    private final static QName _GetMessages_QNAME = new QName("http://ServicesGenerator/", "getMessages");
    private final static QName _GetMessagesResponse_QNAME = new QName("http://ServicesGenerator/", "getMessagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddThread }
     * 
     */
    public AddThread createAddThread() {
        return new AddThread();
    }

    /**
     * Create an instance of {@link GetThreadMessage }
     * 
     */
    public GetThreadMessage createGetThreadMessage() {
        return new GetThreadMessage();
    }

    /**
     * Create an instance of {@link GetThreadMessageResponse }
     * 
     */
    public GetThreadMessageResponse createGetThreadMessageResponse() {
        return new GetThreadMessageResponse();
    }

    /**
     * Create an instance of {@link AddThreadResponse }
     * 
     */
    public AddThreadResponse createAddThreadResponse() {
        return new AddThreadResponse();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessages }
     * 
     */
    public GetMessages createGetMessages() {
        return new GetMessages();
    }

    /**
     * Create an instance of {@link GetMessagesResponse }
     * 
     */
    public GetMessagesResponse createGetMessagesResponse() {
        return new GetMessagesResponse();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link MessageThread }
     * 
     */
    public MessageThread createMessageThread() {
        return new MessageThread();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "addThread")
    public JAXBElement<AddThread> createAddThread(AddThread value) {
        return new JAXBElement<AddThread>(_AddThread_QNAME, AddThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "getThreadMessage")
    public JAXBElement<GetThreadMessage> createGetThreadMessage(GetThreadMessage value) {
        return new JAXBElement<GetThreadMessage>(_GetThreadMessage_QNAME, GetThreadMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "getThreadMessageResponse")
    public JAXBElement<GetThreadMessageResponse> createGetThreadMessageResponse(GetThreadMessageResponse value) {
        return new JAXBElement<GetThreadMessageResponse>(_GetThreadMessageResponse_QNAME, GetThreadMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "addThreadResponse")
    public JAXBElement<AddThreadResponse> createAddThreadResponse(AddThreadResponse value) {
        return new JAXBElement<AddThreadResponse>(_AddThreadResponse_QNAME, AddThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "addMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "getMessages")
    public JAXBElement<GetMessages> createGetMessages(GetMessages value) {
        return new JAXBElement<GetMessages>(_GetMessages_QNAME, GetMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicesGenerator/", name = "getMessagesResponse")
    public JAXBElement<GetMessagesResponse> createGetMessagesResponse(GetMessagesResponse value) {
        return new JAXBElement<GetMessagesResponse>(_GetMessagesResponse_QNAME, GetMessagesResponse.class, null, value);
    }

}
