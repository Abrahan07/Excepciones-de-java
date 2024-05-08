/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class DataFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar descomprimir datos con un formato incorrecto
            byte[] compressedData = "invalid".getBytes();
            Inflater inflater = new Inflater();
            inflater.setInput(compressedData);
            byte[] decompressedData = new byte[100];
            inflater.inflate(decompressedData); // Esto lanzará DataFormatException
        } catch (DataFormatException e) {
            System.out.println("¡Error: Formato de datos incorrecto para descompresión!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
