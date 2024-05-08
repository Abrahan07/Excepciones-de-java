/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.module.*;
import java.util.Collection;

public class LayerInstantiationExceptionExample {
    public static void main(String[] args) {
        try {
            // Obtener la capa base del sistema (boot layer)
            ModuleLayer bootLayer = ModuleLayer.boot();

            // Crear una nueva capa vacía sin módulos
            ModuleFinder emptyFinder = ModuleFinder.of();
            Configuration emptyConfiguration = bootLayer.configuration().resolve(emptyFinder, ModuleFinder.of(), (Collection<String>) ModuleFinder.of());
            ModuleLayer newLayer = bootLayer.defineModulesWithOneLoader(emptyConfiguration, ClassLoader.getSystemClassLoader());

            System.out.println("Nueva capa creada correctamente.");
        } catch (LayerInstantiationException e) {
            System.out.println("¡Error al crear la nueva capa!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


