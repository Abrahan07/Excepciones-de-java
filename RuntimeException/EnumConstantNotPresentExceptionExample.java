/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

/**
 *
 * @author Lenovo
 */
public class EnumConstantNotPresentExceptionExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        try {
            // Intentar acceder a una constante enum que no está definida (esto lanzará EnumConstantNotPresentException)
            Day day = Day.valueOf("THURSDAY"); // "THURSDAY" no está definido en el enum Day
            System.out.println("Día: " + day);
        } catch (EnumConstantNotPresentException e) {
            System.out.println("¡Error! Constante enum no encontrada.");
            e.printStackTrace();
        }
    }
}

