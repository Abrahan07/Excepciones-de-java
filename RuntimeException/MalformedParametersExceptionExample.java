/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.MalformedParametersException;

public class MalformedParametersExceptionExample {
    public void processUserData(String name, int age) {
        // Obtener el método "processUserData" utilizando reflexión
        try {
            Method method = MalformedParametersExceptionExample.class.getMethod("processUserData", String.class, int.class);

            // Obtener los parámetros del método
            Parameter[] parameters = method.getParameters();

            // Simular un parámetro malformado (fuera de índice)
            int invalidIndex = 2;
            if (invalidIndex < parameters.length) {
                Parameter parameter = parameters[invalidIndex];
                System.out.println("Nombre del parámetro: " + parameter.getName());
            } else {
                throw new MalformedParametersException("Índice de parámetro inválido: " + invalidIndex);
            }
        } catch (NoSuchMethodException | MalformedParametersException e) {
            System.out.println("¡Error: Método o parámetro malformado!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MalformedParametersExceptionExample().processUserData("John", 30);
    }
}

