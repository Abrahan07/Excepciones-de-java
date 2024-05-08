/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.transaction.xa.*;

public class XAExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante una operación de transacción distribuida
            XAException xaException = new XAException("Error en la transacción distribuida");
            throw xaException;
        } catch (XAException e) {
            System.out.println("¡Error: Excepción XA!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

