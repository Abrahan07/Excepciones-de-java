/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class TransformerExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante la transformación XML
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            Source source = new StreamSource("input.xml");
            Result result = new StreamResult("output.txt");
            transformer.transform(source, result); // Esto puede lanzar TransformerException
        } catch (TransformerException e) {
            System.out.println("¡Error de transformación XML!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

