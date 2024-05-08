/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.jdi.InvalidTypeException;

public class InvalidTypeExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error con un tipo de dato inválido
            throw new InvalidTypeException("Tipo de dato inválido");
        } catch (InvalidTypeException e) {
            System.out.println("¡Error: Tipo de dato inválido!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

