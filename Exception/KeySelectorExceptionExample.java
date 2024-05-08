/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.xml.crypto.*;

public class KeySelectorExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al seleccionar una clave para validar una firma XML
            throw new KeySelectorException("Error al seleccionar la clave para validar la firma");
        } catch (KeySelectorException e) {
            System.out.println("¡Error: Selección de clave!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

