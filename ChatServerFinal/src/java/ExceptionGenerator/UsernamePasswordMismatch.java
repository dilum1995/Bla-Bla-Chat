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
public class UsernamePasswordMismatch extends Exception{

    public UsernamePasswordMismatch() {
    }

    public UsernamePasswordMismatch(String message) {
        super(message);
    }
    
}
