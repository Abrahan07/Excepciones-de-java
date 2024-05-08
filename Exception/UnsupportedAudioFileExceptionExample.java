/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.sound.sampled.*;

public class UnsupportedAudioFileExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar abrir un archivo de audio no compatible
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File("audio.wav"));
        } catch (UnsupportedAudioFileException | java.io.IOException e) {
            System.out.println("¡Error: Archivo de audio no compatible!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
