/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.datatype.*;

public class DatatypeConfigurationExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar configurar un tipo de datos XML incorrectamente
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            datatypeFactory.newDuration("P1Y"); // Esto lanzará DatatypeConfigurationException
        } catch (DatatypeConfigurationException e) {
            System.out.println("¡Error: Configuración incorrecta de tipo de datos XML!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

