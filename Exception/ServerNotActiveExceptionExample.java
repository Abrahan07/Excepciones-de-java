/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.rmi.server.*;

public class ServerNotActiveExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error al intentar obtener información de la máquina remota
            String clientHost = RemoteServer.getClientHost(); // Esto lanzará ServerNotActiveException
        } catch (ServerNotActiveException e) {
            System.out.println("¡Error: Servidor no activo!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

