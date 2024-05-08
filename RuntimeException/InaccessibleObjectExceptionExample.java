/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.reflect.*;

public class InaccessibleObjectExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar acceder a un método privado de una clase utilizando reflexión (esto lanzará InaccessibleObjectException)
            Method method = String.class.getDeclaredMethod("isEmpty");
            method.setAccessible(true); // Permitir acceso al método privado
            boolean isEmpty = (boolean) method.invoke("Hello");
            System.out.println("¿Está vacía? " + isEmpty);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("¡Error! Objeto inaccesible.");
            e.printStackTrace();
        }
    }
}

