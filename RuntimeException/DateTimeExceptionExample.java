/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.time.*;

public class DateTimeExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar crear una fecha inválida (esto lanzará DateTimeException)
            LocalDate date = LocalDate.of(2022, 2, 30); // 30 de febrero (fecha inválida)
            System.out.println("Fecha: " + date);
        } catch (DateTimeException e) {
            System.out.println("¡Error de fecha y hora!");
            e.printStackTrace();
        }
    }
}

