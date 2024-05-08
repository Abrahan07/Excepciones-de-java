/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

public class VirtualMachineErrorExample {
    public static void main(String[] args) {
        // Crear un gran arreglo para provocar OutOfMemoryError (subclase de VirtualMachineError)
        try {
            int[] array = new int[Integer.MAX_VALUE]; // Esto lanzará OutOfMemoryError
        } catch (OutOfMemoryError e) {
            System.out.println("¡Error de memoria!");
            e.printStackTrace();
        }
    }
}

