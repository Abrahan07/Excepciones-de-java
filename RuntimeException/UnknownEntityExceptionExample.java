/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import javax.lang.model.UnknownEntityException;

public class UnknownEntityExceptionExample {
    public static void main(String[] args) {
        try {
            String entityType = "unknown";
            throw new UnknownEntityException("Entidad desconocida: " + entityType);
        } catch (UnknownEntityException e) {
            System.out.println("¡Error: Entidad desconocida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


