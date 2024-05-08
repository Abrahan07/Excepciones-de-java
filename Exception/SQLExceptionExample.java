/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error de SQL al conectar con una base de datos
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
        } catch (SQLException e) {
            System.out.println("¡Error SQL!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

