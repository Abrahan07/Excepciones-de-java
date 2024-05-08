/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.nio.*;

public class BufferUnderflowExceptionExample {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(4); // Buffer con capacidad de 4 bytes
            buffer.putInt(123); // Escribir un entero (4 bytes) en un buffer de 4 bytes

            buffer.flip(); // Preparar el buffer para lectura
            int value1 = buffer.getInt(); // Leer un entero (esto es válido)
            int value2 = buffer.getInt(); // Intentar leer otro entero (esto podría lanzar BufferUnderflowException)
        } catch (BufferUnderflowException e) {
            System.out.println("¡Error de subdesbordamiento de buffer!");
            e.printStackTrace();
        }
    }
}

