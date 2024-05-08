/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.management.InvalidApplicationException;

public class InvalidApplicationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de aplicación inválida
            throw new InvalidApplicationException("Estado inválido de la aplicación");
        } catch (InvalidApplicationException e) {
            System.out.println("¡Error: Aplicación inválida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
