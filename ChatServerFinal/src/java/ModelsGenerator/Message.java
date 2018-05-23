/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelsGenerator;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Dilum De Siva
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Message")
public class Message implements Serializable{
    
    @XmlElement(name="msg_body")
    String msg_body;
    
    @XmlElement(name="owner")
    User owner;
    
    @XmlElement(name="recieved_date")
    Date recieved_date;

    public Message(String msg_Body, User owner) {
        this.msg_body = msg_Body;
        this.owner = owner;
        this.recieved_date = new Date();
    }

    public String getMsgBody() {
        return msg_body;
    }

    public User getOwner() {
        return owner;
    }

    public Date getRecievedDate() {
        return recieved_date;
    }
    
    
    
    
}
