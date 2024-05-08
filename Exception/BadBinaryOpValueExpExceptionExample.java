/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.management.*;

public class BadBinaryOpValueExpExceptionExample {
    public static void main(String[] args) {
        try {
            ValueExp leftExp = new AttributeValueExp("attribute1");
            ValueExp rightExp = new AttributeValueExp("attribute2");
            ValueExp exp = new BinaryOpValueExp(ValueExp.EXIST, leftExp, rightExp);
            throw new BadBinaryOpValueExpException(exp);
        } catch (BadBinaryOpValueExpException e) {
            System.out.println("¡Error: Evaluación de expresión binaria incorrecta!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

