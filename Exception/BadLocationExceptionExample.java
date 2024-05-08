/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.swing.text.BadLocationException;

public class BadLocationExceptionExample {
    public static void main(String[] args) {
        try {
            String text = "Hello, world!";
            int invalidIndex = 15; // Intentar acceder a un índice fuera del rango
            char character = text.charAt(invalidIndex); // Esto lanzará BadLocationException
        } catch (BadLocationException e) {
            System.out.println("¡Error: Ubicación de índice incorrecta!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

