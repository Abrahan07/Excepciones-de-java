/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.security.cert.CertificateException;

public class CertificateExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de error de certificado inválido
            throw new CertificateException("Error en la gestión de certificados");
        } catch (CertificateException e) {
            System.out.println("¡Error: Excepción relacionada con certificados!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

