/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UncheckedIOExceptionExample {
    public static void main(String[] args) {
        // Ejemplo de uso de UncheckedIOException
        try {
            Files.lines(Paths.get("nonexistent-file.txt"))
                    .forEach(System.out::println); // Esto lanzará UncheckedIOException
        } catch (UncheckedIOException e) {
            System.out.println("¡Error: IOException no verificada!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("¡Error: IOException!");
            e.printStackTrace();
        }
    }
}

