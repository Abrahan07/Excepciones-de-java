/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.text.*;

public class ParseExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al analizar una fecha inválida
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.parse("2022-13-45"); // Fecha inválida
        } catch (ParseException e) {
            System.out.println("¡Error: Fecha no válida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

