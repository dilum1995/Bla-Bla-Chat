/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesGenerator;

import Controller.Chat;
import ModelsGenerator.Message;
import ModelsGenerator.MsgThread;
import ModelsGenerator.User;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dilum De Siva
 */
@WebService(serviceName = "ChatService")
public class ChatService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addThread")
    public MsgThread addThread(@WebParam(name = "name") String name, @WebParam(name = "user") User user) {
        //TODO write your implementation code here:
        MsgThread mt = Chat.newThread(name, user);
        return mt;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addMessage")
    public Message addMessage(@WebParam(name = "messageBody") String messageBody, @WebParam(name = "sender") User sender, @WebParam(name = "threadId") int threadId) {
        //TODO write your implementation code here:
        Message m = Chat.addMessage(messageBody, sender, threadId);
        return m;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMessages")
    public java.util.List<ModelsGenerator.MsgThread> getMessages(@WebParam(name = "user") User user) {
        //TODO write your implementation code here:
        ArrayList<ModelsGenerator.MsgThread> messages = Chat.getMessages(user);
        return messages;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getThreadMessage")
    public ArrayList<ModelsGenerator.Message> getThreadMessage(@WebParam(name = "threadID") int threadID) {
        //TODO write your implementation code here:
        ArrayList<ModelsGenerator.Message> messages= Chat.getMessage(threadID);
        return messages;
    }
    
    
}
