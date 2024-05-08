/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

public class TypeNotPresentExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar acceder a un tipo de clase que no está presente
            Class<?> missingClass = Class.forName("com.example.MissingClass");
        } catch (TypeNotPresentException e) {
            System.out.println("¡Error: Tipo de clase no presente!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("¡Error: Clase no encontrada!");
            e.printStackTrace();
        }
    }
}

