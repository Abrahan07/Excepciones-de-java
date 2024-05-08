/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.net.*;

public class URISyntaxExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al crear una URI con una sintaxis incorrecta
            URI uri = new URI("http://www.example.com path with spaces");
        } catch (URISyntaxException e) {
            System.out.println("¡Error: Sintaxis URI incorrecta!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

