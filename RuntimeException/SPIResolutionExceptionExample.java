/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.ServiceLoader;
import jdk.jshell.spi.SPIResolutionException;

public class SPIResolutionExceptionExample {
    public static void main(String[] args) {
        // Intentar cargar un servicio que no está disponible
        try {
            ServiceLoader.load(Class.forName("com.example.MyService"));
        } catch (SPIResolutionException e) {
            System.out.println("¡Error: Resolución SPI fallida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("¡Error: Clase no encontrada!");
            e.printStackTrace();
        }
    }
}

