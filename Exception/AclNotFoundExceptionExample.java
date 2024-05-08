/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.security.acl.AclNotFoundException;

public class AclNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de acceso a una ACL que no existe
            throw new AclNotFoundException("ACL no encontrada");
        } catch (AclNotFoundException e) {
            System.out.println("¡Error: ACL no encontrada!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

