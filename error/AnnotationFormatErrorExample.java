/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;
import java.lang.annotation.*;

// Definición de una anotación con un atributo faltante en la declaración
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value(); // Atributo sin valor por defecto
}

// Clase que utiliza la anotación con error de formato
public class AnnotationFormatErrorExample {

    // Método anotado con la anotación que tiene un atributo sin valor por defecto
    @MyAnnotation(value = "Hello") // Proporcionamos un valor para 'value'
    public void myMethod() {
        System.out.println("Método anotado ejecutado");
    }

    public static void main(String[] args) {
        AnnotationFormatErrorExample example = new AnnotationFormatErrorExample();

        // Obtener la anotación del método (esto lanzará AnnotationFormatError si falta el valor)
        MyAnnotation annotation = example.getClass().getDeclaredMethod("myMethod").getAnnotation(MyAnnotation.class);
        
        // Acceder al valor de la anotación
        System.out.println("Valor de la anotación: " + annotation.value());
    }
}


