/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.datatransfer.*;

public class UnsupportedFlavorExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar obtener un tipo de datos no compatible
            Transferable transferable = new StringSelection("Texto de ejemplo");
            transferable.getTransferData(DataFlavor.imageFlavor); // Esto lanzará UnsupportedFlavorException
        } catch (UnsupportedFlavorException e) {
            System.out.println("¡Error: Tipo de datos no compatible!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

