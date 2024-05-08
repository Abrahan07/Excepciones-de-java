/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.crypto.dsig.*;

public class XMLSignatureExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante el procesamiento de una firma XML
            throw new XMLSignatureException("Error en la firma XML");
        } catch (XMLSignatureException e) {
            System.out.println("¡Error de firma XML!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

