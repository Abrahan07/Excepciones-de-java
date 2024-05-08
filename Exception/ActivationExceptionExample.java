/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.rmi.activation.ActivationException;

public class ActivationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de activación remota
            throw new ActivationException("Error durante la activación remota");
        } catch (ActivationException e) {
            System.out.println("¡Error: Activación remota fallida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

