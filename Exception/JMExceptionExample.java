/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.management.*;

public class JMExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error en operaciones de gestión JMX
            throw new JMException("Error en operaciones de gestión JMX");
        } catch (JMException e) {
            System.out.println("¡Error: Operaciones de gestión JMX!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
