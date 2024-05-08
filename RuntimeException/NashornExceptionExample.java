/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import javax.script.*;

public class NashornExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un gestor de scripts para Nashorn
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("nashorn");

            // Evaluar un script JavaScript que contiene un error
            String script = "console.log('Hola mundo');"; // Error de sintaxis: falta punto y coma
            engine.eval(script); // Esto lanzará una NashornException
        } catch (ScriptException e) {
            System.out.println("¡Error: Excepción en Nashorn!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

