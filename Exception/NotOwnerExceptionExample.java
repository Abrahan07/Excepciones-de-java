/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.lang.management.ManagementFactory;
import javax.management.*;

public class NotOwnerExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de un error debido a permisos de seguridad
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            ObjectName objectName = new ObjectName("com.example:type=MyMBean");
            mBeanServer.unregisterMBean(objectName); // Esto lanzará NotOwnerException
        } catch ( MalformedObjectNameException | MBeanRegistrationException | InstanceNotFoundException e) {
            System.out.println("¡Error: No propietario del recurso!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

