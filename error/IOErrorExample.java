/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import java.io.*;

public class IOErrorExample {
    public static void main(String[] args) {
        // Intentar leer desde un archivo inexistente (esto lanzará IOError)
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo_inexistente.txt"));
            String line = reader.readLine();
            System.out.println("Contenido del archivo: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("¡Error de entrada/salida!");
            e.printStackTrace();
        }
    }
}

