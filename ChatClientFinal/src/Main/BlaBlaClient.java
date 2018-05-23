/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dilum De Siva
 */
public class BlaBlaClient {

    final static JFrame mainFrame = new JFrame();
    public static WebService.User currentUser = null;
    public static ArrayList<WebService.MessageThread> allThreads = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginScreen LoginScreen = new LoginScreen();
        Dimension dimension = LoginScreen.getPreferredSize();
        mainFrame.setSize(dimension);
        mainFrame.setContentPane(LoginScreen);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public static void changeWindow(JPanel newPanel){
        mainFrame.setContentPane(newPanel);
        mainFrame.revalidate();
    }
    
     public static void changeWindow(JPanel newPanel,Thread t){
        t.stop();
        mainFrame.setContentPane(newPanel);
        mainFrame.revalidate();
    }
    
}
