/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        // Intentar acceder a un método en una referencia nula
        try {
            int length = str.length(); // Esto lanzará NullPointerException
        } catch (NullPointerException e) {
            System.out.println("¡Error: Referencia nula encontrada!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

