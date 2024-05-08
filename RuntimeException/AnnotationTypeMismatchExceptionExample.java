/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.annotation.*;

// Definición de una anotación con un tipo de dato incorrecto para el atributo
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    int value(); // El tipo de dato de este atributo debe ser int
}

// Clase que utiliza la anotación con un tipo de dato incorrecto
public class AnnotationTypeMismatchExceptionExample {

    // Método anotado con la anotación que tiene un atributo con tipo de dato incorrecto
    @MyAnnotation(value = "Hello") // Se proporciona un String en lugar de un int
    public void myMethod() {
        System.out.println("Método anotado ejecutado");
    }

    public static void main(String[] args) {
        AnnotationTypeMismatchExceptionExample example = new AnnotationTypeMismatchExceptionExample();

        try {
            // Obtener la anotación del método y acceder al atributo
            MyAnnotation annotation = example.getClass().getDeclaredMethod("myMethod").getAnnotation(MyAnnotation.class);
            int value = annotation.value(); // Esto lanzará AnnotationTypeMismatchException
            System.out.println("Valor de la anotación: " + value);
        } catch (AnnotationTypeMismatchException e) {
            System.out.println("¡Error de tipo de dato en la anotación!");
            e.printStackTrace();
        } catch (NoSuchMethodException | NullPointerException e) {
            System.out.println("¡Método o anotación no encontrada!");
            e.printStackTrace();
        }
    }
}

