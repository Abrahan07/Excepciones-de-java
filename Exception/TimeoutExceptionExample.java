/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.concurrent.*;

public class TimeoutExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error debido a un tiempo de espera excedido
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(() -> {
                Thread.sleep(2000); // Simular una operación que excede el tiempo de espera
                return "Resultado";
            });
            future.get(1, TimeUnit.SECONDS); // Esto lanzará TimeoutException
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            System.out.println("¡Error de tiempo de espera!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
