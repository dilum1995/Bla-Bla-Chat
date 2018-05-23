/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelsGenerator;

import java.io.Serializable;
import java.util.ArrayList;
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
@XmlType(name="MessageThread")
public class MsgThread implements Serializable{
    
    // Static Varibles ---------------------------------------------------------
    
    static int tot_threads = 0;
    
    // Instance Varibles -------------------------------------------------------
    @XmlElement(name="thread_id")
    private int thread_id;
    
    @XmlElement(name="thread_name")
    private String thread_name;
    
    @XmlElement(name="thread_owner")
    private User thread_owner;
    
    @XmlElement(name="thread_lastEditedBy")
    private User thread_lastEditedBy;
    
    @XmlElement(name="thread_lastEdit")
    private Date thread_lastEdit;
    
    @XmlElement(name="allMessages")
    private ArrayList<Message> allMessages = new ArrayList<>();

    // Constructors ------------------------------------------------------------
    
    public MsgThread(String thread_name, User thread_owner) {
        tot_threads ++;
        this.thread_name = thread_name;
        this.thread_owner = thread_owner;
        this.thread_id = tot_threads;
        this.thread_lastEdit = new Date();
        this.thread_lastEditedBy = thread_owner;
    }
    
    // Getters -----------------------------------------------------------------
    
    public int getThreadID() {
        return thread_id;
    }

    public String getThreadName() {
        return thread_name;
    }

    public User getThreadOwner() {
        return thread_owner;
    }

    public User getLastEditedBy() {
        return thread_lastEditedBy;
    }

    public Date getLastEdit() {
        return thread_lastEdit;
    }

    public ArrayList<Message> getAllMessages() {
        return allMessages;
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Adds an Message to the thread an update the last edited by and last 
     * edited date
     * @param message Message that needs to be added
     * @param sender User who sends the message
     */
    public void addMessage (Message message,User sender){
        allMessages.add(message);
        this.thread_lastEditedBy = sender;
        this.thread_lastEdit = new Date();
    }
    
    
}
