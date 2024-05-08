/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import com.sun.tools.attach.AgentLoadException;
import java.lang.instrument.*;

public class AgentLoadExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de carga de agente de instrumentación
            throw new AgentLoadException("Error durante la carga del agente");
        } catch (AgentLoadException e) {
            System.out.println("¡Error: Carga del agente fallida!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

