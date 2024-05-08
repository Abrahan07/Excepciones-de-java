/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.security.*;

public class GeneralSecurityExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error general de seguridad
            throw new GeneralSecurityException("Error de seguridad general");
        } catch (GeneralSecurityException e) {
            System.out.println("¡Error: Excepción de seguridad general!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
