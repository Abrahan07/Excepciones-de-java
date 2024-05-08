/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.annotation.*;
import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class InvalidTargetObjectTypeExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error con un tipo de objeto de destino no válido para una anotación
            throw new InvalidTargetObjectTypeException("Tipo de objeto de destino no válido para la anotación");
        } catch (InvalidTargetObjectTypeException e) {
            System.out.println("¡Error: Tipo de objeto de destino no válido para la anotación!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
