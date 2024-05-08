/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.tools.attach.AgentInitializationException;
import java.lang.instrument.*;

public class AgentInitializationExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de inicialización de agente de instrumentación
            throw new AgentInitializationException("Error durante la inicialización del agente");
        } catch (AgentInitializationException e) {
            System.out.println("¡Error: Inicialización del agente fallida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

