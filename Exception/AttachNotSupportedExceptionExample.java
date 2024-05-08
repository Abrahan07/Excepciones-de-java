/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.tools.attach.*;

public class AttachNotSupportedExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de no soporte para adjuntar a una JVM
            throw new AttachNotSupportedException("No se admite la operación de adjuntar a la JVM");
        } catch (AttachNotSupportedException e) {
            System.out.println("¡Error: Operación de adjuntar no soportada!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

