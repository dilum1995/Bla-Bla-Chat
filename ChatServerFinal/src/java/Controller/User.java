/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ExceptionGenerator.UsernameNotFound;
import ExceptionGenerator.UsernamePasswordMismatch;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dilum De Silva
 */
public class User {

    static ArrayList<ModelsGenerator.User> users = new ArrayList<>();

   
    public static ModelsGenerator.User signUp(String nickName, String userName, char[] password) {

        
        ModelsGenerator.User user = getUser(userName);
        
        if (user == null) {
            
            user = new ModelsGenerator.User(nickName, userName, password);
            
            users.add(user);
            
            return user;
        }
        
        return null;
    }

   
    public static ModelsGenerator.User Login(String username, char[] password) throws UsernameNotFound, UsernamePasswordMismatch{
       
        ModelsGenerator.User user = getUser(username);
      
        if (user != null) {
           
            if (Arrays.equals(password, user.getPassword())) {
                
                System.out.println("Valid Password");
                return user;
            }
        }else{
            System.out.println("Usr not found");
            throw new UsernameNotFound("User Name doesn't Exist");
        }
       
        throw new UsernamePasswordMismatch("Username and password doesn't match");
    }

    
    private static ModelsGenerator.User getUser(String username) {
        
        for (ModelsGenerator.User user : users) {
           
            if (user.getUsername().equals(username)) {
                
                return user;
            }
        }
        
        return null;
    }

    
    public static boolean isReal(ModelsGenerator.User user) {
        
        ModelsGenerator.User u = getUser(user.getUsername());
       
        if(u != null){
            
            if(Arrays.equals(u.getPassword(), user.getPassword())) {
                
                return true;
            }
        }
        
        return false;
    }
}
