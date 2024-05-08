/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.jdi.AbsentInformationException;

public class AbsentInformationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de acceso a información de depuración no disponible
            throw new AbsentInformationException("Información de depuración no disponible");
        } catch (AbsentInformationException e) {
            System.out.println("¡Error: Información de depuración no disponible!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

