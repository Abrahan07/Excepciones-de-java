/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.smartcardio.*;

public class CardExceptionExample {
    public static void main(String[] args) {
        try {
            TerminalFactory terminalFactory = TerminalFactory.getDefault();
            CardTerminal cardTerminal = terminalFactory.terminals().list().get(0);
            Card card = cardTerminal.connect("T=0"); // Intentar conectar con una tarjeta
        } catch (CardException e) {
            System.out.println("¡Error: Excepción relacionada con la tarjeta inteligente!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

