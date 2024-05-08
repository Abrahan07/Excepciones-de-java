/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.*;

public class ExecutionControlExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            lookup.findClass("java.lang.Runtime"); // Intentar acceder a la clase Runtime
        } catch (IllegalAccessException e) {
            System.out.println("¡Error: Excepción de control de ejecución!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

