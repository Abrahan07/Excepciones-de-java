/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.util.*;

public class IllformedLocaleExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar crear un Locale con un identificador mal formado (esto lanzará IllformedLocaleException)
            Locale locale = new Locale("es", "INVALID"); // "INVALID" no es un identificador de subtipo válido
        } catch (IllformedLocaleException e) {
            System.out.println("¡Error! Identificador de localización mal formado.");
            e.printStackTrace();
        }
    }
}

