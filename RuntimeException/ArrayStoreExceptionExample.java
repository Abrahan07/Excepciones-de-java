/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

/**
 *
 * @author Lenovo
 */
public class ArrayStoreExceptionExample {
    public static void main(String[] args) {
        Object[] objects = new String[5]; // Array de objetos de tipo String

        try {
            objects[0] = 123; // Intentar almacenar un entero en un array de Strings (esto lanzará ArrayStoreException)
        } catch (ArrayStoreException e) {
            System.out.println("¡Error! Tipo incompatible para almacenar en el array.");
            e.printStackTrace();
        }
    }
}

