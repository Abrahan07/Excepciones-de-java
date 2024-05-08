/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.management.*;

public class BadAttributeValueExpExceptionExample {
    public static void main(String[] args) {
        try {
            ValueExp exp = new AttributeValueExp("nonexistentAttribute");
            throw new BadAttributeValueExpException(exp);
        } catch (BadAttributeValueExpException e) {
            System.out.println("¡Error: Evaluación de expresión de valor incorrecto!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
