/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import org.w3c.dom.ranges.RangeException;

public class RangeExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;

        // Acceder a un índice fuera del rango válido del array
        try {
            int value = array[index]; // Esto lanzará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RangeException("Índice fuera de rango: " + index);
        }
    }
}

