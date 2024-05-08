/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import javax.xml.validation.*;

public class SchemaFactoryConfigurationErrorExample {
    public static void main(String[] args) {
        // Intentar obtener un SchemaFactory (esto lanzará SchemaFactoryConfigurationError)
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

        try {
            factory.newSchema(); // Intentar crear un esquema (esto lanzará SchemaFactoryConfigurationError)
        } catch (Exception e) {
            System.out.println("¡Error de configuración de la fábrica de esquemas!");
            e.printStackTrace();
        }
    }
}

