/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.net.*;

public class URIReferenceExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al manipular una referencia URI inválida
            URI uri = new URI("http://www.example.com?query=invalid|uri");
        } catch (URISyntaxException e) {
            System.out.println("¡Error: Referencia URI inválida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

