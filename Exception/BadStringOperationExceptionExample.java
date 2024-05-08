/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.management.BadStringOperationException;

public class BadStringOperationExceptionExample {
    public static void main(String[] args) {
        try {
            String operation = "invalidOperation";
            throw new BadStringOperationException(operation);
        } catch (BadStringOperationException e) {
            System.out.println("¡Error: Operación de cadena inválida!");
            System.out.println("Operación: " + e.getOperation());
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

