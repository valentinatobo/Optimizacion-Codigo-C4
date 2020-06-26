/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import App.client.login.LoginTemplate;
import App.client.vistaTemplate.VistaPrincipalTemplate;

/**
 *
 * @author Admin
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginTemplate vista = new LoginTemplate();
        vista.setName("Login");
        //VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
        
    }
    
}
