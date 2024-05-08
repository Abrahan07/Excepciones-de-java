/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.*;

public class NoSuchElementExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        // Acceder a un elemento que no existe en la lista
        try {
            System.out.println(list.get(3)); // Esto lanzará NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("¡Error: No se encontró el elemento!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

