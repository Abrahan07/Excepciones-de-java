/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.prefs.*;

public class InvalidPreferencesFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error en el formato de preferencias
            throw new InvalidPreferencesFormatException("Formato de preferencias inválido");
        } catch (InvalidPreferencesFormatException e) {
            System.out.println("¡Error: Formato de preferencias inválido!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
