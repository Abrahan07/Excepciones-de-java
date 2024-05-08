/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Hola"; // Objeto de tipo String
        try {
            Integer num = (Integer) obj; // Intentar convertir un String en Integer (esto lanzará ClassCastException)
            System.out.println("Número: " + num);
        } catch (ClassCastException e) {
            System.out.println("¡Error de conversión de tipos!");
            e.printStackTrace();
        }
    }
}

