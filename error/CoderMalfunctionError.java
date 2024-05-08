/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import java.nio.CharBuffer;
import java.nio.charset.*;

public class CoderMalfunctionError {
    public static void main(String[] args) throws CharacterCodingException {
        Charset charset = Charset.forName("ISO-8859-1");
        CharsetEncoder encoder = charset.newEncoder();

        // Intentar codificar un carácter inválido (esto lanzará CoderMalfunctionError)
        encoder.encode(CharBuffer.wrap("\uFFFF"));
    }
}

