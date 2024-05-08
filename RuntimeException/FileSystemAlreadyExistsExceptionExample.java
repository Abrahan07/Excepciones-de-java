/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.nio.file.*;

public class FileSystemAlreadyExistsExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar crear un sistema de archivos que ya existe (esto lanzará FileSystemAlreadyExistsException)
            FileSystems.newFileSystem(Paths.get("my-archive.zip"), null);
        } catch (FileSystemAlreadyExistsException e) {
            System.out.println("¡Error! El sistema de archivos ya existe.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("¡Otro error!");
            e.printStackTrace();
        }
    }
}

