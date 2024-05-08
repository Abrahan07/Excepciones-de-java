/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.io.*;

public class JarSigningExample {
    public static void main(String[] args) {
        String jarFilePath = "path/to/your/file.jar";
        String keystorePath = "path/to/your/keystore.jks";
        String alias = "your_alias";
        String storepass = "your_store_password";

        try {
            // Ejecutar el comando jarsigner para firmar el archivo JAR
            Process process = Runtime.getRuntime().exec("jarsigner -keystore " + keystorePath +
                    " -storepass " + storepass + " " + jarFilePath + " " + alias);

            // Capturar la salida del proceso (puede ser opcional dependiendo de la necesidad)
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Esperar a que el proceso termine y obtener el código de salida
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("¡Archivo JAR firmado correctamente!");
            } else {
                System.out.println("Error al firmar el archivo JAR. Verifica los detalles de la excepción.");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al ejecutar el comando jarsigner: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción al firmar el archivo JAR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

