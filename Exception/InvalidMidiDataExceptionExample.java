/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.sound.midi.*;

public class InvalidMidiDataExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de datos MIDI inválidos
            throw new InvalidMidiDataException("Datos MIDI inválidos");
        } catch (InvalidMidiDataException e) {
            System.out.println("¡Error: Datos MIDI inválidos!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

