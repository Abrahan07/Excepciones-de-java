/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

/**
 *
 * @author Lenovo
 */
public class IllegalMonitorStateExceptionExample {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        try {
            // Intentar llamar a wait() sin poseer el bloqueo del objeto (esto lanzará IllegalMonitorStateException)
            lock.wait();
        } catch (IllegalMonitorStateException e) {
            System.out.println("¡Error! Operación de sincronización ilegal.");
            e.printStackTrace();
        }
    }
}

