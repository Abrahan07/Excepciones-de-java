/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.net.URI;
import java.nio.file.*;

public class FileSystemNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar acceder a un sistema de archivos que no existe (esto lanzará FileSystemNotFoundException)
            FileSystem fileSystem = FileSystems.getFileSystem(URI.create("file:///nonexistent"));
        } catch (FileSystemNotFoundException e) {
            System.out.println("¡Error! Sistema de archivos no encontrado.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("¡Otro error!");
            e.printStackTrace();
        }
    }
}

