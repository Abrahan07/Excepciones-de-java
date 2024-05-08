/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.awt.image.*;

public class RasterFormatExceptionExample {
    public static void main(String[] args) {
        // Crear un raster con dimensiones no válidas
        try {
            WritableRaster raster = Raster.createInterleavedRaster(DataBuffer.TYPE_BYTE, 100, 100, 3, null);
            throw new RasterFormatException("Error en el formato del raster: dimensiones no válidas");
        } catch (RasterFormatException e) {
            System.out.println("¡Error: Formato de raster inválido!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

