/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicesGenerator;

import Controller.User;
import ExceptionGenerator.UsernameNotFound;
import ExceptionGenerator.UsernamePasswordMismatch;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dilum De Siva
 */
@WebService(serviceName = "UserService")
public class UserService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signUp")
    public ModelsGenerator.User signUp(@WebParam(name = "username") String username, @WebParam(name = "nickname") String nickname, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        char[] password_c = password.toCharArray();
        ModelsGenerator.User u = User.signUp(nickname, username, password_c);
        return u;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signIn")
    public ModelsGenerator.User signIn(@WebParam(name = "username") String username, @WebParam(name = "password") String password) throws UsernameNotFound, UsernamePasswordMismatch{
        //TODO write your implementation code here:
        char[] password_c = password.toCharArray();
        ModelsGenerator.User u = User.Login(username, password_c);
        return u;
    }

    
    
}
