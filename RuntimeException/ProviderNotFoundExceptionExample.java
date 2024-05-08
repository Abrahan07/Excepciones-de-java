/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.nio.file.ProviderNotFoundException;
import java.security.*;

public class ProviderNotFoundExceptionExample {
    public static void main(String[] args) {
        // Intentar obtener un proveedor de seguridad que no existe
        try {
            Provider provider = Security.getProvider("NonExistentProvider");
            if (provider == null) {
                throw new ProviderNotFoundException("Proveedor de seguridad no encontrado: NonExistentProvider");
            }
        } catch (ProviderNotFoundException e) {
            System.out.println("¡Error: Proveedor de seguridad no encontrado!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
