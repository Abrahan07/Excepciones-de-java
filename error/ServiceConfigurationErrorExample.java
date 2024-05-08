/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error;

import java.sql.*;
import java.util.*;

public class ServiceConfigurationErrorExample {
    public static void main(String[] args) {
        try {
            // Obtener una lista de los controladores JDBC disponibles
            Enumeration<Driver> drivers = DriverManager.getDrivers();

            // Iterar sobre la lista de controladores
            while (drivers.hasMoreElements()) {
                Driver driver = drivers.nextElement();
                System.out.println("Controlador encontrado: " + driver.getClass().getName());
            }
        } catch (ServiceConfigurationError e) {
            System.out.println("¡Error de configuración del servicio!");
            e.printStackTrace();
        }
    }
}


