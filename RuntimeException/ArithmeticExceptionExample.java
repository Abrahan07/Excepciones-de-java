/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

/**
 *
 * @author Lenovo
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = dividend / divisor; // Intentar dividir por cero (esto lanzará ArithmeticException)
            System.out.println("Resultado de la división: " + result);
        } catch (ArithmeticException e) {
            System.out.println("¡Error aritmético!");
            e.printStackTrace();
        }
    }
}

