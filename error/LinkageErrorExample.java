/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

/**
 *
 * @author Lenovo
 */
public class LinkageErrorExample {
    public static void main(String[] args) {
        // Intentar cargar una clase que no existe (esto lanzará LinkageError)
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("¡Error! Clase no encontrada.");
            e.printStackTrace();
        } catch (LinkageError e) {
            System.out.println("¡Error de enlace!");
            e.printStackTrace();
        }
    }
}

