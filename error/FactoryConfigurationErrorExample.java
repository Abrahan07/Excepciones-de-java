/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import javax.xml.parsers.*;

public class FactoryConfigurationErrorExample  {
    public static void main(String[] args) {
        // Intentar obtener un DocumentBuilder (esto lanzará FactoryConfigurationError)
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println("¡Error de configuración del parser!");
            e.printStackTrace();
        } catch (FactoryConfigurationError e) {
            System.out.println("¡Error de configuración de la fábrica!");
            e.printStackTrace();
        }
    }
}
