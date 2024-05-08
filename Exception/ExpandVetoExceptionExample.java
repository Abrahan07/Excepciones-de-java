/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.beans.*;
import javax.swing.tree.ExpandVetoException;

public class ExpandVetoExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de veto de expansión por un escucha de eventos
            throw new ExpandVetoException("Veto de expansión");
        } catch (ExpandVetoException e) {
            System.out.println("¡Error: Veto de expansión!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

