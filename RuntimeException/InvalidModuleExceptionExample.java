/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import com.sun.jdi.InvalidModuleException;

public class InvalidModuleExceptionExample {
    // Método para cargar un módulo (simulación)
    public static void loadModule(String moduleName) throws InvalidModuleException {
        // Simulación: Verificar si el nombre del módulo es válido
        if (moduleName == null || moduleName.isEmpty()) {
            throw new InvalidModuleException("Nombre de módulo inválido: " + moduleName);
        }

        // Simulación: Intentar cargar el módulo (aquí podrías realizar operaciones reales de carga de módulos)
        System.out.println("Cargando módulo: " + moduleName);
        // En este ejemplo simple, no se carga ningún módulo real, solo se imprime un mensaje
    }

    public static void main(String[] args) {
        // Intentar cargar un módulo con un nombre inválido (simulación)
        try {
            String moduleName = ""; // Nombre de módulo inválido
            loadModule(moduleName);
            System.out.println("Módulo cargado correctamente.");
        } catch (InvalidModuleException e) {
            System.out.println("¡Error al cargar el módulo!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

