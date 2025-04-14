/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

//import business.security.AuthenticationService;

/**
 *
 * @author micae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new gui.FormSignin().setVisible(true);
        /**AuthenticationService prueba = new AuthenticationService();
        long userId = prueba.signin("admin", "#123456$");
        if(userId!=-1)
        {
            System.out.println("Autenticacion exitosa. ID del usuario");
        }
        else
        {
            System.out.println("Credenciales incorrectas");
        } */
    }
    
}
