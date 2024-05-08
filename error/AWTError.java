/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import java.awt.*;

public class AWTError {
    public static void main(String[] args) {
        // Intentar crear un objeto Frame (esto lanzará AWTError)
        Frame frame = new Frame("Ejemplo AWTError");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

