/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class NegativeArraySizeExceptionExample {
    public static void main(String[] args) {
        try {
            int negativeSize = -1;
            int[] array = new int[negativeSize]; // Esto lanzará NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("¡Error: Tamaño de array negativo!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
