/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import com.sun.jdi.request.InvalidRequestStateException;

/**
 *
 * @author Lenovo
 */
public class InvalidRequestStateExceptionExample {
    // Método simulado para procesar una solicitud
    public static void processRequest(String state) throws InvalidRequestStateException {
        // Verificar si el estado de la solicitud es válido
        if (!"valid".equals(state)) {
            throw new InvalidRequestStateException("Estado de solicitud inválido: " + state);
        }
        
        // Simulación: Procesar la solicitud (aquí podrías implementar la lógica real de procesamiento)
        System.out.println("Procesando la solicitud...");
    }

    public static void main(String[] args) {
        try {
            String requestState = "invalid"; // Estado de solicitud inválido
            processRequest(requestState);
            System.out.println("Solicitud procesada correctamente.");
        } catch (InvalidRequestStateException e) {
            System.out.println("¡Error al procesar la solicitud!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

