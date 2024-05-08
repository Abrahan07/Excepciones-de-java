/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar cargar una clase que no existe
            Class.forName("com.example.NonexistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("¡Error: Clase no encontrada!");
            e.printStackTrace();
        }
    }
}
