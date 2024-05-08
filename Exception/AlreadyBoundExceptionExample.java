/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.rmi.*;

public class AlreadyBoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de enlace duplicado
            throw new AlreadyBoundException("Nombre ya enlazado en el registro");
        } catch (AlreadyBoundException e) {
            System.out.println("¡Error: Enlace duplicado!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

