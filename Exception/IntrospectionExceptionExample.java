/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.beans.*;

public class IntrospectionExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error durante la introspección de un JavaBean
            BeanInfo beanInfo = Introspector.getBeanInfo(Object.class); // Intentar obtener información de un JavaBean
        } catch (IntrospectionException e) {
            System.out.println("¡Error: Excepción de introspección en JavaBeans!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

