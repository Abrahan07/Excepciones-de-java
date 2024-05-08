/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.jdi.*;

public class IncompatibleThreadStateExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de estado incompatible de una hebra
            ThreadReference thread = null; // Supongamos que se obtiene de algún lugar
            thread.resume(); // Esto lanzará IncompatibleThreadStateException
        } catch (IncompatibleThreadStateException e) {
            System.out.println("¡Error: Estado incompatible de la hebra!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

