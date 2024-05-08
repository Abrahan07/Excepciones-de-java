/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.sound.midi.*;

public class MidiUnavailableExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar acceder a un dispositivo MIDI no disponible
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
        } catch (MidiUnavailableException e) {
            System.out.println("¡Error: Dispositivo MIDI no disponible!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

