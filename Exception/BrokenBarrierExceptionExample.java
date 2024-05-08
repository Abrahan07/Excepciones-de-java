/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.concurrent.*;

public class BrokenBarrierExceptionExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        // Intentar romper la barrera antes de que todas las hebras lleguen
        Runnable runnable = () -> {
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println("¡Error: Barrera rota!");
                e.printStackTrace();
            }
        };

        // Crear hebras
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        // Iniciar las hebras
        thread1.start();
        thread2.start();
        thread3.start();

        // Interrumpir una hebra para simular una ruptura de la barrera
        thread2.interrupt();
    }
}

