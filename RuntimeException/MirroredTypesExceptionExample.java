/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;

import java.lang.annotation.*;
import javax.lang.model.type.MirroredTypesException;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    Class<?> value();
}

public class MirroredTypesExceptionExample {
    @MyAnnotation(String.class)
    public class MyClass {}

    public static void main(String[] args) {
        // Acceder a los tipos reflejados de la anotación MyAnnotation
        try {
            Class<?> mirroredType = MirroredTypesExceptionExample.MyClass.class
                    .getAnnotation(MyAnnotation.class).value();
            System.out.println("Tipo reflejado de la anotación: " + mirroredType.getName());
        } catch (MirroredTypesException e) {
            System.out.println("¡Error: No se puede acceder a los tipos reflejados de la anotación!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

