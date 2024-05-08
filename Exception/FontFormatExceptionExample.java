/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.*;
import java.io.*;

public class FontFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar cargar una fuente de texto inválida
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File("invalidFont.ttf"));
        } catch (FontFormatException | IOException e) {
            System.out.println("¡Error: Formato de fuente de texto incorrecto!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

