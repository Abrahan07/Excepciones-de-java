/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

/**
 *
 * @author Lenovo
 */
public class ThreadDeathExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simular una operación que tarda 2 segundos
            } catch (InterruptedException e) {
                System.out.println("¡Hilo interrumpido!");
            }
            System.out.println("Fin del hilo");
        });

        thread.start();

        // Interrumpir el hilo explícitamente (esto lanzará ThreadDeath)
        thread.interrupt();
    }
}
