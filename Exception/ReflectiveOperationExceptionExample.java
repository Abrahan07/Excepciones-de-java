/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.reflect.*;

public class ReflectiveOperationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar invocar un método inexistente mediante reflexión
            Class<?> clazz = String.class;
            Method method = clazz.getMethod("nonExistentMethod");
            method.invoke(null); // Esto lanzará ReflectiveOperationException
        } catch (ReflectiveOperationException e) {
            System.out.println("¡Error: Operación de reflexión fallida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

