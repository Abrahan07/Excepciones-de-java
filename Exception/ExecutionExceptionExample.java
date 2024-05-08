/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.concurrent.*;

public class ExecutionExceptionExample {
    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> {
                throw new RuntimeException("Excepción lanzada desde tarea");
            });
            future.get(); // Esto lanzará ExecutionException
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("¡Error: Excepción durante la ejecución de la tarea!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
