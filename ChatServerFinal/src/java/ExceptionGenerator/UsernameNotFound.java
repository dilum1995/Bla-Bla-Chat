/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionGenerator;

/**
 *
 * @author Dilum De Siva
 */
public class UsernameNotFound extends Exception{

    public UsernameNotFound() {
    }

    public UsernameNotFound(String message) {
        super(message);
    }
    
    
}
