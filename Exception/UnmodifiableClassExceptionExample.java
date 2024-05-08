/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.instrument.*;

public class UnmodifiableClassExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar modificar una clase no modificable
            throw new UnmodifiableClassException("Clase no modificable");
        } catch (UnmodifiableClassException e) {
            System.out.println("¡Error: Clase no modificable!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

