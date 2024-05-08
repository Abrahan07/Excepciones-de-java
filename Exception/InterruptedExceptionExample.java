/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de interrupción de una hebra
            Thread.sleep(1000); // Intentar dormir la hebra por 1000 milisegundos
        } catch (InterruptedException e) {
            System.out.println("¡Error: Hebra interrumpida durante la espera!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

