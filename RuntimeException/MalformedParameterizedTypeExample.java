/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.reflect.*;
import java.util.List;

public class MalformedParameterizedTypeExample {
    public static void main(String[] args) {
        try {
            // Crear un tipo parametrizado incorrecto (simulación)
            Type type = new MalformedParameterizedTypeExample().getClass()
                    .getDeclaredField("invalidField").getGenericType();

            // Intentar obtener argumentos de tipo (type arguments) de manera incorrecta
            if (type instanceof ParameterizedType) {
                // Intentar castear directamente a ParameterizedType
                ParameterizedType parameterizedType = (ParameterizedType) type;

                // Esto lanzará MalformedParameterizedTypeException
                Type[] typeArguments = parameterizedType.getActualTypeArguments();

                System.out.println("Argumentos de tipo del tipo parametrizado: " + typeArguments);
            } else {
                System.out.println("El tipo no es un tipo parametrizado.");
            }
        } catch (NoSuchFieldException e) {
            System.out.println("¡Error: Campo no encontrado!");
            e.printStackTrace();
        } catch (MalformedParameterizedTypeException e) {
            System.out.println("¡Error: Tipo parametrizado malformado!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("¡Error inesperado!");
            e.printStackTrace();
        }
    }

    // Campo con tipo parametrizado incorrecto (solo para simular el ejemplo)
    private List<String> invalidField;  // Esto es un ejemplo incorrecto para demostración
}

