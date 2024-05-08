/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.*;

public class EmptyStackExceptionExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        try {
            // Intentar realizar una operación de desapilado en una pila vacía (esto lanzará EmptyStackException)
            String item = stack.pop();
            System.out.println("Elemento desapilado: " + item);
        } catch (EmptyStackException e) {
            System.out.println("¡Error! La pila está vacía.");
            e.printStackTrace();
        }
    }
}

