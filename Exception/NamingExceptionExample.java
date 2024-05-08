/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.naming.*;

public class NamingExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error en operaciones de acceso al espacio de nombres
            Context context = new InitialContext();
            context.lookup("invalid-name");
        } catch (NamingException e) {
            System.out.println("¡Error: Excepción de acceso al espacio de nombres!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
