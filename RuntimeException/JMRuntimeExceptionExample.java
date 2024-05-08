/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RuntimeException;


import java.lang.management.ManagementFactory;
import javax.management.*;

public class JMRuntimeExceptionExample {
    public static void main(String[] args) throws ReflectionException {
        try {
            // Simulación: Intentar acceder a un servicio de JMX no disponible
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            ObjectName nonExistingObjectName = new ObjectName("com.example:type=NonExisting");
            mBeanServer.getAttribute(nonExistingObjectName, "SomeAttribute"); // Esto lanzará JMRuntimeException
        } catch (JMRuntimeException | MalformedObjectNameException | AttributeNotFoundException | MBeanException | InstanceNotFoundException e) {
            System.out.println("¡Error al interactuar con el servicio de JMX!");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

