/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import javax.xml.transform.*;

public class TransformerFactoryConfigurationErrorExample {
    public static void main(String[] args) {
        // Intentar obtener un TransformerFactory (esto lanzará TransformerFactoryConfigurationError)
        TransformerFactory factory = TransformerFactory.newInstance();

        try {
            factory.newTransformer(); // Intentar crear un transformador (esto lanzará TransformerFactoryConfigurationError)
        } catch (TransformerConfigurationException e) {
            System.out.println("¡Error de configuración del transformador!");
            e.printStackTrace();
        } catch (TransformerFactoryConfigurationError e) {
            System.out.println("¡Error de configuración de la fábrica de transformadores!");
            e.printStackTrace();
        }
    }
}


