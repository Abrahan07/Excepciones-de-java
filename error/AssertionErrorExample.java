/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

public class AssertionErrorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Assertion para verificar que x sea menor que y (esto fallará)
        assert x > y : "x no es menor que y";

        System.out.println("Fin del programa");
    }
}

