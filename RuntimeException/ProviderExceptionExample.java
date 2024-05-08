/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.security.*;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class ProviderExceptionExample {
    public static void main(String[] args) throws NoSuchPaddingException {
        // Obtener el proveedor de seguridad por defecto
        Provider provider = Security.getProvider("SUN");

        // Intentar obtener un servicio que no está disponible en el proveedor
        try {
            Cipher cipher = Cipher.getInstance("AES", provider); // Esto lanzará ProviderException
        } catch (ProviderException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.out.println("¡Error: Excepción del proveedor de seguridad!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

