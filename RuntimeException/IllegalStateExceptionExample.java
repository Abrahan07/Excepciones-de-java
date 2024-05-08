/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

/**
 *
 * @author Lenovo
 */
public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        try {
            // Intentar invocar un método en un StringBuilder cuando su estado no es adecuado (esto lanzará IllegalStateException)
            builder.append("Hello").setLength(-1);
        } catch (IllegalStateException e) {
            System.out.println("¡Error! Estado ilegal del objeto StringBuilder.");
            e.printStackTrace();
        }
    }
}

