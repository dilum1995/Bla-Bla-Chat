
package WebService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://ServicesGenerator/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns WebService.User
     * @throws UsernameNotFound_Exception
     * @throws UsernamePasswordMismatch_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "signIn", targetNamespace = "http://ServicesGenerator/", className = "WebService.SignIn")
    @ResponseWrapper(localName = "signInResponse", targetNamespace = "http://ServicesGenerator/", className = "WebService.SignInResponse")
    @Action(input = "http://ServicesGenerator/UserService/signInRequest", output = "http://ServicesGenerator/UserService/signInResponse", fault = {
        @FaultAction(className = UsernameNotFound_Exception.class, value = "http://ServicesGenerator/UserService/signIn/Fault/UsernameNotFound"),
        @FaultAction(className = UsernamePasswordMismatch_Exception.class, value = "http://ServicesGenerator/UserService/signIn/Fault/UsernamePasswordMismatch")
    })
    public User signIn(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws UsernameNotFound_Exception, UsernamePasswordMismatch_Exception
    ;

    /**
     * 
     * @param password
     * @param nickname
     * @param username
     * @return
     *     returns WebService.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "signUp", targetNamespace = "http://ServicesGenerator/", className = "WebService.SignUp")
    @ResponseWrapper(localName = "signUpResponse", targetNamespace = "http://ServicesGenerator/", className = "WebService.SignUpResponse")
    @Action(input = "http://ServicesGenerator/UserService/signUpRequest", output = "http://ServicesGenerator/UserService/signUpResponse")
    public User signUp(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "nickname", targetNamespace = "")
        String nickname,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
