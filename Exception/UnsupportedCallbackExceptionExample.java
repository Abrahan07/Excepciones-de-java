/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.security.auth.callback.*;

public class UnsupportedCallbackExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar utilizar un callback no compatible
            Callback unsupportedCallback = new PasswordCallback("Contraseña:", false);
            throw new UnsupportedCallbackException(unsupportedCallback);
        } catch (UnsupportedCallbackException e) {
            System.out.println("¡Error: Callback no compatible!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

