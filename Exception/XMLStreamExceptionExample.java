/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.stream.*;

public class XMLStreamExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante el procesamiento de una secuencia XML
            throw new XMLStreamException("Error de procesamiento de secuencia XML");
        } catch (XMLStreamException e) {
            System.out.println("¡Error de procesamiento de secuencia XML!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

