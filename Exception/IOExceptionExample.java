/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error de E/S al intentar leer un archivo inexistente
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent-file.txt"));
            String line = reader.readLine();
        } catch (IOException e) {
            System.out.println("¡Error de E/S!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

