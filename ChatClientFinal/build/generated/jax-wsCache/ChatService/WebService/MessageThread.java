
package WebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageThread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageThread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thread_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thread_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thread_owner" type="{http://ServicesGenerator/}User" minOccurs="0"/>
 *         &lt;element name="thread_lastEditedBy" type="{http://ServicesGenerator/}User" minOccurs="0"/>
 *         &lt;element name="thread_lastEdit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="allMessages" type="{http://ServicesGenerator/}Message" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageThread", propOrder = {
    "threadId",
    "threadName",
    "threadOwner",
    "threadLastEditedBy",
    "threadLastEdit",
    "allMessages"
})
public class MessageThread {

    @XmlElement(name = "thread_id")
    protected int threadId;
    @XmlElement(name = "thread_name")
    protected String threadName;
    @XmlElement(name = "thread_owner")
    protected User threadOwner;
    @XmlElement(name = "thread_lastEditedBy")
    protected User threadLastEditedBy;
    @XmlElement(name = "thread_lastEdit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar threadLastEdit;
    protected List<Message> allMessages;

    /**
     * Gets the value of the threadId property.
     * 
     */
    public int getThreadId() {
        return threadId;
    }

    /**
     * Sets the value of the threadId property.
     * 
     */
    public void setThreadId(int value) {
        this.threadId = value;
    }

    /**
     * Gets the value of the threadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * Sets the value of the threadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadName(String value) {
        this.threadName = value;
    }

    /**
     * Gets the value of the threadOwner property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getThreadOwner() {
        return threadOwner;
    }

    /**
     * Sets the value of the threadOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setThreadOwner(User value) {
        this.threadOwner = value;
    }

    /**
     * Gets the value of the threadLastEditedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getThreadLastEditedBy() {
        return threadLastEditedBy;
    }

    /**
     * Sets the value of the threadLastEditedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setThreadLastEditedBy(User value) {
        this.threadLastEditedBy = value;
    }

    /**
     * Gets the value of the threadLastEdit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThreadLastEdit() {
        return threadLastEdit;
    }

    /**
     * Sets the value of the threadLastEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThreadLastEdit(XMLGregorianCalendar value) {
        this.threadLastEdit = value;
    }

    /**
     * Gets the value of the allMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getAllMessages() {
        if (allMessages == null) {
            allMessages = new ArrayList<Message>();
        }
        return this.allMessages;
    }

}
