/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.nio.*;

public class BufferOverflowExceptionExample {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(5); // Buffer con capacidad de 5 bytes
            buffer.putInt(12345); // Intentar escribir un entero (4 bytes) en un buffer de 5 bytes (esto podría lanzar BufferOverflowException)
        } catch (BufferOverflowException e) {
            System.out.println("¡Error de desbordamiento de buffer!");
            e.printStackTrace();
        }
    }
}

