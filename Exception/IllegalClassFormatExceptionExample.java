/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.instrument.*;

public class IllegalClassFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de detección de un formato de clase inválido
            throw new IllegalClassFormatException("Formato de clase inválido detectado");
        } catch (IllegalClassFormatException e) {
            System.out.println("¡Error: Formato de clase inválido!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

