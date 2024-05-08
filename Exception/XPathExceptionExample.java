/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.xpath.*;

public class XPathExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante la evaluación de una expresión XPath
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expr = xpath.compile("//path/to/node[");
            expr.evaluate(null, XPathConstants.NODE); // Esto lanzará XPathException
        } catch (XPathExpressionException e) {
            System.out.println("¡Error de XPath!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

