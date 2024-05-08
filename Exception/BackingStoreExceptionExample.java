/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.util.prefs.*;

public class BackingStoreExceptionExample {
    public static void main(String[] args) {
        try {
            Preferences preferences = Preferences.userRoot();
            preferences.sync(); // Esto lanzará BackingStoreException si ocurre un error de almacenamiento
        } catch (BackingStoreException e) {
            System.out.println("¡Error: Excepción de almacenamiento de preferencias!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
