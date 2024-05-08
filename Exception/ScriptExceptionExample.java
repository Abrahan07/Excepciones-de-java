/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.script.*;

public class ScriptExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error durante la ejecución de un script
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            engine.eval("invalid script code"); // Esto lanzará ScriptException
        } catch (ScriptException e) {
            System.out.println("¡Error de script!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
