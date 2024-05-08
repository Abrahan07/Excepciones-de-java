/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error de tiempo de ejecución (división por cero)
            int result = 10 / 0; // Esto lanzará ArithmeticException, una subclase de RuntimeException
        } catch (RuntimeException e) {
            System.out.println("¡Error de tiempo de ejecución!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

