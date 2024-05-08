/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AWTExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de AWT durante la creación de un objeto Robot
            Robot robot = new Robot();
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Esto lanzará AWTException
        } catch (AWTException e) {
            System.out.println("¡Error: Excepción relacionada con AWT!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

