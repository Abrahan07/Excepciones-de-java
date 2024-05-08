/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.sound.sampled.*;

public class LineUnavailableExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar obtener una línea de audio no disponible
            AudioSystem.getLine(new Line.Info(SourceDataLine.class));
        } catch (LineUnavailableException e) {
            System.out.println("¡Error: Línea de audio no disponible!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

