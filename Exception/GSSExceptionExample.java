/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import org.ietf.jgss.*;

public class GSSExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error en operaciones GSS-API
            throw new GSSException(GSSException.FAILURE, -1, "Error en operación GSS-API");
        } catch (GSSException e) {
            System.out.println("¡Error: Excepción GSS-API!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

