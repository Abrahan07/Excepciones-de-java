/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.concurrent.*;

public class RejectedExecutionExceptionExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.shutdown(); // Cerrar el executor

        // Intentar ejecutar una tarea después de cerrar el executor
        try {
            executor.execute(() -> {
                System.out.println("Tarea en executor");
            }); // Esto lanzará RejectedExecutionException
        } catch (RejectedExecutionException e) {
            System.out.println("¡Error: Ejecución rechazada!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

