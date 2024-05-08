/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.*;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        try {
            for (String item : list) {
                if (item.equals("Dos")) {
                    // Intentar modificar la lista durante la iteración (esto lanzará ConcurrentModificationException)
                    list.remove(item);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("¡Error de modificación concurrente!");
            e.printStackTrace();
        }
    }
}

