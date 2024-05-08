/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.io.*;

public class SecurityExceptionExample {
    public static void main(String[] args) {
        // Intentar acceder a un archivo que no tiene permisos de lectura
        try {
            File file = new File("/root/secret.txt");
            FileInputStream fis = new FileInputStream(file); // Esto lanzará SecurityException
        } catch (SecurityException | FileNotFoundException e) {
            System.out.println("¡Error: Acceso denegado debido a la seguridad!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

