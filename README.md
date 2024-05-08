Excepciones en java


Throwable.Error

-AnnotationFormatError:
Esta excepción se lanza cuando ocurre un error en el formato de una anotación en tiempo de ejecución, generalmente durante la lectura o el procesamiento de anotaciones.
-AssertionError:
Esta excepción se lanza cuando una declaración assert falla. Se utiliza para verificar condiciones que se supone que siempre son verdaderas durante el desarrollo y las pruebas del programa.
-AWTError:
Esta excepción se lanza cuando ocurre un error interno en la Biblioteca Abstract Window Toolkit (AWT), que se utiliza para construir interfaces gráficas de usuario en Java.
-CoderMalfunctionError:
Esta excepción indica un error interno en el mecanismo de codificación o decodificación de caracteres utilizado por las clases relacionadas con la manipulación de texto en Java.
-FactoryConfigurationError:
Esta excepción se lanza cuando ocurre un error en la configuración de una fábrica (por ejemplo, una fábrica de transformadores o una fábrica de esquemas) que se utiliza para crear instancias de ciertos objetos en tiempo de ejecución.
-IOError:
Esta excepción se lanza cuando ocurre un error de E/S (entrada/salida) que no puede ser manejado adecuadamente por el código. Puede indicar problemas graves con operaciones de lectura o escritura de archivos u otros recursos.
-LinkageError:
Esta excepción se lanza cuando ocurre un error de enlace durante la carga o la vinculación de una clase u otro recurso en tiempo de ejecución. Puede ocurrir cuando hay conflictos o incompatibilidades en las dependencias entre clases.
-SchemaFactoryConfigurationError:
Esta excepción se lanza cuando ocurre un error en la configuración de una fábrica de esquemas XML utilizada para crear instancias de objetos Schema.
-ServiceConfigurationError:
Esta excepción se lanza cuando ocurre un error en la configuración de un proveedor de servicios (Service Provider) utilizado en Java para cargar implementaciones de interfaces a través del servicio de carga dinámica.
-ThreadDeath:
Esta excepción se lanza internamente por el sistema cuando se solicita explícitamente la detención de un hilo (thread) utilizando el método Thread.stop() (método desaconsejado).
-TransformerFactoryConfigurationError:
Similar a FactoryConfigurationError, esta excepción se lanza cuando ocurre un error en la configuración de una fábrica de transformadores utilizada para crear instancias de objetos Transformer.
-VirtualMachineError:
Esta es la clase base para todas las excepciones que indican errores internos en la máquina virtual Java (JVM). Ejemplos de subclases incluyen StackOverflowError, OutOfMemoryError, entre otros.


Throwable.RuntimeException

-AnnotationTypeMismatchException:
Esta excepción se lanza cuando se produce un tipo de dato incorrecto al intentar acceder al valor de una anotación en tiempo de ejecución.
-ArithmeticException:
Esta excepción se lanza cuando ocurre un error aritmético, como la división por cero.
-ArrayStoreException:
Esta excepción se lanza cuando se intenta almacenar un elemento de tipo incorrecto en un array de objetos.
-BufferOverflowException:
Esta excepción se lanza cuando ocurre un desbordamiento de buffer debido a que se intenta escribir más datos de los que el buffer puede contener.
-BufferUnderflowException:
Esta excepción se lanza cuando ocurre un subdesbordamiento de buffer debido a que se intenta leer más datos de los que el buffer contiene.
-CannotRedoException:
Esta excepción se lanza cuando se intenta realizar una operación de "re-hacer" (redo) en un sistema que no permite esta acción.
-CannotUndoException:
Esta excepción se lanza cuando se intenta realizar una operación de "deshacer" (undo) en un sistema que no permite esta acción.
- ClassCastException:
Esta excepción se lanza cuando se intenta realizar una conversión de tipo incompatible entre objetos.
-ConcurrentModificationException:
Esta excepción se lanza cuando se detecta una modificación concurrente no compatible con una estructura que no admite modificaciones concurrentes, como un ArrayList modificado mientras se está iterando.
-DateTimeException:
Esta excepción se lanza cuando ocurre un error durante operaciones relacionadas con fechas y horas, como manipulaciones de calendario, conversiones de zona horaria, etc.
-EmptyStackException:
 Esta excepción se lanza cuando se intenta realizar una operación de desapilado (pop) en una pila (stack) vacía.
-EnumConstantNotPresentException:
 Esta excepción se lanza cuando se intenta acceder a una constante enum que no está definida en tiempo de ejecución.
- EventException:
 Esta excepción se utiliza en el contexto del modelo de eventos de Java (por ejemplo, en el manejo de eventos de interfaz de usuario) para indicar errores relacionados con eventos.
-FileSystemAlreadyExistsException:
 Esta excepción se lanza cuando se intenta crear un sistema de archivos (FileSystem) que ya existe.
-FileSystemNotFoundException:
 Esta excepción se lanza cuando se intenta acceder a un sistema de archivos (FileSystem) que no se encuentra.
- IllegalArgumentException:
 Esta excepción se lanza para indicar que un método ha recibido un argumento ilegal o inapropiado.
-IllegalMonitorStateException:
 Esta excepción se lanza cuando un hilo intenta realizar una operación de sincronización (por ejemplo, wait, notify, notifyAll) en un objeto sin poseer el bloqueo de ese objeto.
- IllegalStateException:
 Esta excepción se lanza para indicar que el estado actual de un objeto no es adecuado para la operación solicitada.
- IllformedLocaleException:
 Esta excepción se lanza cuando se produce un error al analizar o procesar un identificador de localización (locale) que no está bien formado.
-InaccessibleObjectException:
 Esta excepción se lanza cuando se intenta acceder a un objeto (por ejemplo, mediante reflexión) que no es accesible desde el contexto actual.
-InvalidModuleException:
La excepción InvalidModuleException es una excepción que puede lanzarse en el contexto del sistema de módulos de Java (Java Platform Module System - JPMS) cuando ocurre un error relacionado con la definición o configuración de un módulo.
-InvalidRequestStateException:
Esta excepción se lanza cuando se detecta un estado inválido en una solicitud o petición en el contexto de una aplicación.
-JarSignerException:
La JarSignerException se lanza cuando ocurre un error durante el proceso de firma digital de un archivo JAR. Esto puede ocurrir por varias razones, como problemas con el certificado digital, errores en la configuración de la firma, o problemas de acceso o permisos relacionados con el almacén de claves (keystore).
-JMRuntimeException :
se lanza cuando ocurren condiciones excepcionales durante la interacción con los servicios de JMX, como problemas de configuración, errores de conexión, o problemas con la operación de gestión y monitorización de recursos.
-MalformedParameterizedTypeException :
se lanza cuando se detecta un problema con un tipo de parámetro parametrizado, como un tipo genérico incorrectamente definido o una estructura de tipo parametrizado que no cumple con las reglas de la programación genérica en Java.
-LayerInstantiationException:
se lanza cuando ocurren errores durante la creación o instanciación de una nueva capa en el sistema de módulos de Java. Por ejemplo, si no se puede crear una capa debido a problemas de configuración o de acceso, se puede lanzar una LayerInstantiationException para informar sobre el problema.
-JSException :
puede ser lanzada cuando ocurren errores durante la evaluación o ejecución de scripts JavaScript desde Java. Por ejemplo, si hay un error de sintaxis en el script JavaScript o si ocurre una excepción durante la ejecución del código JavaScript, se puede lanzar una JSException para informar al código Java que está integrando el script.
-MalformedParametersException: 
es una excepción que se lanza durante la reflexión cuando se detecta un problema con los parámetros de un método o constructor. Esta excepción indica que los parámetros de un método están malformados o no cumplen con las expectativas de la reflexión.
-MirroredTypesException :
es una excepción lanzada por el procesamiento de anotaciones cuando se intenta acceder a los tipos reflejados (mirrored types) de una anotación y ocurre un error.
-MissingResourceException:
es una excepción lanzada cuando no se puede encontrar un recurso (como una propiedad o un archivo de recursos) durante la búsqueda en un ResourceBundle.
-NashornException:
es una excepción lanzada en el contexto del motor JavaScript Nashorn en Java. Esta excepción puede ocurrir durante la evaluación o ejecución de scripts JavaScript utilizando Nashorn.
-NegativeArraySizeException:
 es una excepción lanzada cuando se intenta crear un array con un tamaño negativo en Java. Esto ocurre cuando se pasa un valor negativo como argumento al crear un nuevo array utilizando new.
-NoSuchElementException:
 es una excepción que indica que no se puede encontrar un elemento solicitado en una estructura de datos, como una colección o un iterador. Por lo general, se lanza cuando se intenta acceder a un elemento que no existe.
-NullPointerException:
es una excepción común en Java que indica un intento de acceder a un objeto o invocar un método en una referencia de objeto que es null, es decir, no apunta a ninguna instancia válida de un objeto.
-ProviderException
es una excepción lanzada por el proveedor de servicios de seguridad en Java cuando ocurre un error en la configuración o el funcionamiento del proveedor.
-ProviderNotFoundException:
es una excepción lanzada cuando no se puede encontrar un proveedor de servicios específico en el contexto de seguridad en Java, por ejemplo, al buscar un proveedor de cifrado o un proveedor de seguridad.
-RangeException :
es una excepción que puede lanzarse cuando ocurre un error relacionado con rangos o límites en una operación, como operaciones en estructuras de datos o en el contexto de ciertas APIs.
-RasterFormatException:
es una excepción lanzada cuando ocurre un error en el formato o la estructura de un raster, que es una matriz bidimensional utilizada para representar imágenes.
-RejectedExecutionException:
es una excepción lanzada por un ExecutorService cuando no puede aceptar una tarea para ejecución debido a que el servicio ha sido cerrado o ha alcanzado su límite de capacidad.
-SecurityException:
es una excepción lanzada cuando ocurre un error de seguridad, como un intento de acceder a un recurso protegido o realizar una operación no permitida por las políticas de seguridad.
-SPIResolutionException:
es una excepción lanzada cuando ocurre un error durante la resolución de un servicio proveído por el proveedor de servicios (Service Provider Interface - SPI) en Java.
-TypeNotPresentException:
 es una excepción lanzada cuando se intenta acceder a un tipo de clase que no está presente en tiempo de ejecución, por ejemplo, debido a la ausencia de una dependencia o clase requerida.
-UncheckedIOException:
es una excepción que envuelve una IOException en un contexto donde las excepciones verificadas no están permitidas, como en expresiones lambda, streams u otras operaciones que no admiten excepciones verificadas.
-UndeclaredThrowableException:
es una excepción lanzada cuando un método invocado a través de reflexión o proxies genera una excepción comprobada que no está declarada en la lista de excepciones del método.
-UnknownEntityException:
es una excepción lanzada cuando se encuentra una entidad desconocida o no válida en un contexto específico, como un contexto de análisis o procesamiento de datos.



Throwable.Exception

-AbsentInformationException es una excepción lanzada durante operaciones de depuración cuando la información solicitada sobre un método (como información de depuración, variables locales, etc.) no está disponible.
-AclNotFoundException es una excepción lanzada durante operaciones relacionadas con el control de acceso (ACL) cuando no se puede encontrar una lista de control de acceso (ACL) especificada.
-ActivationException es una excepción lanzada durante operaciones relacionadas con la activación de objetos remotos en Java RMI (Remote Method Invocation).
-AgentInitializationException es una excepción lanzada durante la inicialización de un agente de instrumentación en Java, por ejemplo, cuando ocurre un error al cargar o inicializar un agente de instrumentación.
-AgentLoadException es una excepción lanzada durante la carga de un agente de instrumentación en Java, por ejemplo, cuando ocurre un error al cargar un agente de instrumentación.
-AlreadyBoundException es una excepción lanzada durante operaciones relacionadas con enlaces, como en el contexto de java.rmi.registry.Registry, cuando se intenta volver a enlazar un nombre que ya está enlazado en el registro.
-AttachNotSupportedException es una excepción lanzada durante operaciones relacionadas con la conexión a procesos JVM (Java Virtual Machine) utilizando Java Virtual Machine Tool Interface (JVMTI) Attach Mechanism.
-AWTException es una excepción lanzada durante operaciones relacionadas con la Abstract Window Toolkit (AWT) en Java, como operaciones de interfaz gráfica de usuario (GUI).
-BackingStoreException es una excepción lanzada durante operaciones relacionadas con el almacenamiento de preferencias de usuario utilizando java.util.prefs.Preferences.
-BadAttributeValueExpException es una excepción lanzada durante operaciones relacionadas con la evaluación de expresiones en el contexto de MBeanServer en Java Management Extensions (JMX).
-BadBinaryOpValueExpException es una excepción lanzada durante operaciones relacionadas con la evaluación de expresiones binarias en el contexto de MBeanServer en Java Management Extensions (JMX).
-BadLocationException es una excepción lanzada durante operaciones relacionadas con la manipulación de texto en componentes de Swing, como javax.swing.text.Document, cuando se especifica una ubicación (posición de índice) inválida.
-BadStringOperationException es una excepción lanzada durante operaciones relacionadas con la evaluación de expresiones de cadena en el contexto de MBeanServer en Java Management Extensions (JMX).
-BrokenBarrierException es una excepción lanzada durante operaciones relacionadas con barreras (CyclicBarrier o CountDownLatch) en concurrencia, cuando una o más hebras esperando en la barrera son interrumpidas o cuando la barrera se reinicia antes de que se complete.
-CardException es una excepción lanzada durante operaciones relacionadas con tarjetas inteligentes (smart cards) en Java Card API, cuando ocurre un error en la gestión o comunicación con una tarjeta inteligente.
-CertificateException es una excepción lanzada durante operaciones relacionadas con certificados en Java, por ejemplo, cuando ocurre un error en la gestión o verificación de certificados digitales.
-ClassNotLoadedException (suponiendo que te refieres a ClassNotFoundException) es una excepción lanzada cuando se intenta cargar una clase en tiempo de ejecución pero la clase especificada no se puede encontrar en el classpath.
-CloneNotSupportedException es una excepción lanzada cuando se intenta clonar un objeto que no implementa la interfaz Cloneable. La implementación de Cloneable es necesaria para indicar que un objeto puede ser clonado.
-DataFormatException es una excepción lanzada durante operaciones de descompresión de datos cuando los datos comprimidos no están en el formato esperado.
-DatatypeConfigurationException es una excepción lanzada durante operaciones relacionadas con la configuración de tipos de datos XML (como fechas, horas, etc.) en Java Architecture for XML Binding (JAXB).
-ExecutionControl.ExecutionControlException es una excepción lanzada durante operaciones relacionadas con el control de ejecución en Java, como cuando se detectan violaciones de políticas de seguridad de ejecución.
-ExecutionException es una excepción lanzada durante operaciones relacionadas con la ejecución de tareas concurrentes utilizando java.util.concurrent.Future.
-ExpandVetoException es una excepción lanzada durante operaciones relacionadas con eventos de expansión que pueden ser cancelados por un escucha de eventos.
-FontFormatException es una excepción lanzada durante operaciones relacionadas con el manejo de fuentes de texto, como cuando se produce un error al cargar o procesar una fuente de texto.
-GeneralSecurityException es una excepción lanzada durante operaciones relacionadas con la seguridad en Java, como errores generales en operaciones criptográficas o de seguridad.
-GSSException es una excepción lanzada durante operaciones relacionadas con el Generic Security Services API (GSS-API), que se utiliza para establecer la autenticación y la seguridad en aplicaciones distribuidas.
-IllegalClassFormatException es una excepción lanzada durante operaciones relacionadas con la manipulación de clases en Java Instrumentation API, cuando se detecta un formato de clase inválido.
-IllegalConnectorArgumentsException es una excepción lanzada durante operaciones relacionadas con la conexión de depuración remota (remote debugging) en Java Debugging Connector Architecture (JDWP), cuando se proporcionan argumentos de conexión inválidos.
-IncompatibleThreadStateException es una excepción lanzada durante operaciones relacionadas con el estado incompatible de una hebra (thread) en Java Platform Debugger Architecture (JPDA).
-InterruptedException es una excepción lanzada cuando una hebra (thread) está en estado de espera (waiting, sleeping, o en estado de bloqueo) y se interrumpe.
-IntrospectionException es una excepción lanzada durante operaciones de introspección en JavaBeans, cuando ocurre un error al analizar o acceder a la información de los atributos de un JavaBean.
-InvalidApplicationException es una excepción lanzada durante operaciones relacionadas con aplicaciones en el contexto de Java EE (Enterprise Edition), cuando se detecta un estado o uso inválido de la aplicación.
-InvalidMidiDataException es una excepción lanzada durante operaciones relacionadas con datos MIDI (Musical Instrument Digital Interface) en Java Sound API, cuando se produce un error en el formato o contenido de los datos MIDI.
-InvalidPreferencesFormatException es una excepción lanzada durante operaciones relacionadas con el manejo de preferencias en Java, cuando se produce un error en el formato de las preferencias almacenadas.
-InvalidTargetObjectTypeException es una excepción lanzada durante operaciones relacionadas con anotaciones en Java, cuando el tipo de objeto de destino no es válido o no es compatible con una anotación específica.
-InvalidTypeException es una excepción que podría referirse a diferentes contextos dependiendo del framework o biblioteca en uso. En general, esta excepción podría ser lanzada cuando se produce un error relacionado con un tipo de dato inválido o no esperado.
-InvocationException es una excepción lanzada durante operaciones de invocación, por ejemplo, cuando ocurre un error al invocar un método o una operación en un objeto.
-IOException es una excepción lanzada durante operaciones de entrada/salida (I/O) en Java, cuando ocurre un error relacionado con la lectura, escritura o manipulación de archivos u otros flujos de datos.
-JMException es una excepción lanzada durante operaciones relacionadas con la gestión y monitorización de Java Management Extensions (JMX), cuando ocurre un error en la administración de recursos y aplicaciones gestionadas.
-JShellException es una excepción lanzada durante operaciones relacionadas con el uso de JShell, la herramienta de línea de comandos de Java para evaluar expresiones y ejecutar código dinámicamente.
-KeySelectorException es una excepción lanzada durante operaciones relacionadas con la selección de claves en XML Signature API, cuando ocurre un error al seleccionar una clave durante la validación de firmas XML.
-LineUnavailableException es una excepción lanzada durante operaciones relacionadas con la gestión de líneas de audio en Java Sound API, cuando se produce un error al intentar obtener una línea de audio que no está disponible.
-MidiUnavailableException es una excepción lanzada durante operaciones relacionadas con la gestión de dispositivos MIDI en Java Sound API, cuando se produce un error al intentar acceder a un dispositivo MIDI que no está disponible.
-NamingException es una excepción lanzada durante operaciones relacionadas con el acceso y la manipulación de nombres en el espacio de nombres (namespace) de Java Naming and Directory Interface (JNDI), cuando ocurre un error en la búsqueda o manipulación de objetos en el espacio de nombres.
-NotOwnerException es una excepción lanzada durante operaciones relacionadas con el acceso y control de permisos de seguridad en Java Management Extensions (JMX), cuando se produce un error debido a que un usuario no es propietario del recurso.
-NotOwnerException es una excepción lanzada durante operaciones relacionadas con el acceso y control de permisos de seguridad en Java Management Extensions (JMX), cuando se produce un error debido a que un usuario no es propietario del recurso.
-NotOwnerException es una excepción lanzada durante operaciones relacionadas con el acceso y control de permisos de seguridad en Java Management Extensions (JMX), cuando se produce un error debido a que un usuario no es propietario del recurso.
-PrinterException es una excepción lanzada durante operaciones relacionadas con la impresión en Java, cuando se produce un error durante la impresión de documentos.
-ReflectiveOperationException es una excepción lanzada durante operaciones relacionadas con la reflexión en Java, cuando ocurre un error durante la invocación de métodos a través de la API de reflexión.
-RuntimeException es la clase base para todas las excepciones de tiempo de ejecución en Java. Se lanza durante operaciones relacionadas con errores detectados en tiempo de ejecución que no requieren ser declarados en la firma del método.
-SAXException es una excepción lanzada durante operaciones de análisis XML usando SAX (Simple API for XML), cuando se produce un error durante el procesamiento de un documento XML.
-ScriptException es una excepción lanzada durante operaciones relacionadas con el procesamiento de scripts en Java, cuando se produce un error durante la ejecución de un script.
-ServerNotActiveException es una excepción lanzada durante operaciones relacionadas con información de activación en Java RMI, cuando se intenta acceder a información sobre la máquina remota pero el servidor no está activo.
-SQLException es una excepción lanzada durante operaciones relacionadas con bases de datos en Java JDBC, cuando se produce un error de SQL.
-TimeoutException es una excepción lanzada durante operaciones relacionadas con temporizadores o límites de tiempo en Java, cuando se produce un error debido a que una operación no se completó dentro del tiempo especificado.
-TransformerException es una excepción lanzada durante operaciones relacionadas con transformaciones XML en Java, cuando se produce un error durante la transformación de un documento XML.
-UnmodifiableClassException es una excepción lanzada durante operaciones relacionadas con la modificación de clases en tiempo de ejecución en Java, cuando se intenta modificar una clase que no se puede modificar.
-UnsupportedAudioFileException es una excepción lanzada durante operaciones relacionadas con archivos de audio en Java Sound API, cuando se intenta abrir un archivo de audio que no es compatible con el formato o el tipo esperado.
-UnsupportedCallbackException es una excepción lanzada durante operaciones relacionadas con callbacks en Java Authentication and Authorization Service (JAAS), cuando se produce un error debido a que un callback no es compatible.
-UnsupportedFlavorException es una excepción lanzada durante operaciones relacionadas con el manejo de datos en el sistema de transferencia de datos de Java AWT y Swing, cuando se intenta acceder a un tipo de datos no compatible (sabor) en el portapapeles o en operaciones de transferencia de datos.
-URIReferenceException es una excepción lanzada durante operaciones relacionadas con el manejo de referencias URI en Java, cuando ocurre un error al manipular o resolver una referencia URI.
-URISyntaxException es una excepción lanzada durante operaciones relacionadas con la manipulación de URI en Java, cuando ocurre un error debido a una sintaxis URI incorrecta o no válida.
-XAException es una excepción lanzada durante operaciones relacionadas con transacciones distribuidas en Java, cuando se produce un error durante la administración de transacciones distribuidas utilizando la API XA (eXtended Architecture).
-XMLParseException es una excepción lanzada durante operaciones relacionadas con el análisis de documentos XML en Java, cuando ocurre un error durante el análisis de un documento XML.
-XMLSignatureException es una excepción lanzada durante operaciones relacionadas con firmas XML en Java, cuando ocurre un error durante el procesamiento de firmas XML.
-XMLStreamException es una excepción lanzada durante operaciones relacionadas con el procesamiento de secuencias XML en Java, cuando ocurre un error durante el procesamiento de una secuencia XML.
-XPathException es una excepción lanzada durante operaciones relacionadas con consultas XPath en Java, cuando ocurre un error durante la evaluación de una expresión XPath.

