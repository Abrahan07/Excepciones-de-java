/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.jdi.connect.*;

public class IllegalConnectorArgumentsExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error por argumentos de conexión inválidos
            throw new IllegalConnectorArgumentsException("Argumentos de conexión inválidos");
        } catch (IllegalConnectorArgumentsException e) {
            System.out.println("¡Error: Argumentos de conexión inválidos!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
