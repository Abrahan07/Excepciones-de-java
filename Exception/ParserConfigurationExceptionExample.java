/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.parsers.*;

public class ParserConfigurationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error en la configuración de un parser XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder(); // Esto puede lanzar ParserConfigurationException
        } catch (ParserConfigurationException e) {
            System.out.println("¡Error: Configuración de parser XML!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

