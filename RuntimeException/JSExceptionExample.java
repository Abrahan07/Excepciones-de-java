/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import javax.script.*;

public class JSExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un gestor de scripts
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");

            // Ejecutar un script JavaScript que contiene un error de sintaxis
            String script = "console.log('Hola mundo')";
            engine.eval(script); // Esto lanzará JSException debido a un error de sintaxis

            System.out.println("Script JavaScript ejecutado correctamente.");
        } catch (ScriptException e) {
            System.out.println("¡Error al ejecutar el script JavaScript!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

