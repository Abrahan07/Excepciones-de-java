/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

public class CloneNotSupportedExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar clonar un objeto que no es clonable
            Object obj = new Object();
            Object clone = obj.clone(); // Esto lanzará CloneNotSupportedException
        } catch (CloneNotSupportedException e) {
            System.out.println("¡Error: Clonación no soportada!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

