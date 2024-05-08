/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

/**
 *
 * @author Lenovo
 */
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
            System.out.println("Edad: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("¡Error! Argumento ilegal: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

