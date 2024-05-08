/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import jdk.jshell.*;

public class JShellExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error en operaciones de JShell
            JShell jShell = JShell.create();
            jShell.eval("invalid syntax"); // Esto lanzará JShellException
        } catch (JShellException e) {
            System.out.println("¡Error en JShell!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

