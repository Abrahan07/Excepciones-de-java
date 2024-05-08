/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.jdi.InvocationException;

public class InvocationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante la invocación de un método
            throw new InvocationException("Error al invocar el método");
        } catch (InvocationException e) {
            System.out.println("¡Error: Error durante la invocación!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
