/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.*;

public class MissingResourceExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar cargar un ResourceBundle que no existe
            ResourceBundle bundle = ResourceBundle.getBundle("messages");

            // Intentar obtener una propiedad que no existe
            String greeting = bundle.getString("greeting");
            System.out.println("Saludo: " + greeting);
        } catch (MissingResourceException e) {
            System.out.println("¡Error: Recurso faltante!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

