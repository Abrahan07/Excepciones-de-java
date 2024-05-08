/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class XMLParseExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante el análisis de un documento XML
            throw new SAXParseException("Error de análisis XML", new LocatorImpl());
        } catch (SAXParseException e) {
            System.out.println("¡Error de análisis XML!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

