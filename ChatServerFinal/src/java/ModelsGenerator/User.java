/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelsGenerator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Dilum De Siva
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="User")
public class User implements Serializable{
    
    // Instance Varibles -------------------------------------------------------
    
    @XmlElement(name="username")
    String username; // Username of the user
    @XmlElement(name="nickname")
    String nickname; // Nickname of the user
    @XmlElement(name="password")
    char[] password; // Password of the user

    // Constructors ------------------------------------------------------------
    
    /**
     * 
     * @param username Username than need to be set
     * @param nickname nickname that need to be set
     * @param password password that need to be set
     */
    public User(String username, String nickname, char[] password) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
    }

    public User() {
    }
    

    // Getters -----------------------------------------------------------------
    
    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public char[] getPassword() {
        return password;
    }

}
