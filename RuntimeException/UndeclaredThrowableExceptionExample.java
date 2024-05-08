/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.reflect.*;

public class UndeclaredThrowableExceptionExample {
    public static void main(String[] args) {
        // Ejemplo de UndeclaredThrowableException
        try {
            Method method = String.class.getMethod("toUpperCase");
            Object result = method.invoke(null); // Esto lanzará UndeclaredThrowableException
        } catch (NoSuchMethodException | IllegalAccessException e) {
            System.out.println("¡Error: Método no encontrado o acceso ilegal!");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("¡Error: Excepción durante la invocación del método!");
            System.out.println("Causa: " + e.getCause());
            e.printStackTrace();
        }
    }
}

