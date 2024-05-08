/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.awt.print.*;

public class PrinterExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante la impresión
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.print(); // Esto puede lanzar PrinterException si la impresión falla
        } catch (PrinterException e) {
            System.out.println("¡Error: Error de impresión!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
