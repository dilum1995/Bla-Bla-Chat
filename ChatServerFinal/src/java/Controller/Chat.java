/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ModelsGenerator.MsgThread;
import ModelsGenerator.Message;
import java.util.ArrayList;

/**
 *
 * @author Dilum De Silva
 */
public class Chat  {
    
    //Array list which contain all the threads
    static ArrayList<ModelsGenerator.MsgThread> allThreads = new ArrayList<>();
   
    public static MsgThread newThread (String thread_name,ModelsGenerator.User owner){
        // to create new message thread and add it the array list
        MsgThread message_thread = new MsgThread(thread_name, owner);
        allThreads.add(message_thread);
        
        return message_thread;
    }
    
   
    private static MsgThread getThread (int thread_id){
        //loop through all the threads in the arraylist
        for(MsgThread message_thread : allThreads){
            
            if(message_thread.getThreadID() == thread_id){
                
                return message_thread;
            }
        }
        
        return null;
    }
    
  
    public static Message addMessage (String message_body,ModelsGenerator.User owner,int thread_id){
        
        Message msg = new Message(message_body, owner);
        
        MsgThread message_thread = getThread(thread_id);
        
        if(message_thread !=null){
            
            message_thread.addMessage(msg, owner);
            
            return msg;
        }
       
        return null;
    }
    
  
    public static ArrayList<MsgThread> getMessages(ModelsGenerator.User user){
       
        boolean permitted = User.isReal(user);
        
        if(permitted){
            
            return allThreads;
        }
        else{
            
            return null;
                    
        }
    }
    
 
    public static ArrayList<Message> getMessage (int thread_id){
        
        ModelsGenerator.MsgThread message_thread = getThread(thread_id);
        
        if(message_thread !=null){
            
            return message_thread.getAllMessages();
        }
        
        return null;
    }
    
}
