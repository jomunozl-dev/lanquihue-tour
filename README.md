# 🏞️ Llanquihue tour APP
### ★Nombre del proyecto
LlanquihueTourApp

### ★Descripcion
Aplicación desarrollada en Java para representar y gestionar los distintos servicios turísticos ofrecidos por la agencia **Llanquihue Tour**.

El sistema permite modelar diferentes tipos de servicios turísticos mediante una jerarquía de clases orientada a objetos, incorporando conceptos fundamentales de Programación Orientada a Objetos (POO), como herencia simple, polimorfismo, sobrescritura de métodos y colecciones genéricas.

La aplicación está organizada de forma modular mediante paquetes funcionales, aplicando principios de diseño como:<br>

- Encapsulamiento.<br>
- Herencia.<br>
- Polimorfismo.<br>
- Sobrescritura de métodos.<br>
- Reutilización de código.<br>
- Separación de responsabilidades.<br>

En esta versión del proyecto, los servicios turísticos son almacenados en una colección genérica de tipo `List<ServicioTuristico>`, permitiendo gestionar diferentes tipos de servicios mediante referencias a la superclase y ejecutar comportamientos específicos mediante métodos sobrescritos.<br>

La jerarquía implementada representa los siguientes servicios turísticos:

- Rutas gastronómicas.<br>
- Paseos lacustres.<br>
- Excursiones culturales.<br>

### ★Estructura de carpetas
src/<br>
└── main/<br>
&nbsp;&nbsp;&nbsp;&nbsp;└── java/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── model/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── Registrable.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── RecursoAgencia.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── GuiaTuristico.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── Vehiculo.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── ColaboradorExterno.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── data/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── GestorEntidades.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── ui/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Main.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── VentanaPrincipal.java<br>


### ★Jerarquia de clases
Registrable(Interface)<br>RecursoAgencia(Superclase)<br> ├── Vehiculo(Subclase)<br> ├── Guia Turistico(Subclase)<br> └── Colaborador Externo(Subclase)<br>
- La interfaz `Registrable` define el comportamiento común mediante el método `mostrarResumen()`.
- La clase `RecursoAgencia` contiene atributos compartidos por las entidades del sistema y permite reutilizar código mediante herencia.
- Las clases `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno` heredan de `RecursoAgencia` e implementan la interfaz `Registrable`, sobrescribiendo el método `mostrarResumen()` para entregar información 
específica según el tipo de entidad.

## Paquete UI
El paquete `ui` contiene las clases encargadas de la interacción con el usuario mediante una interfaz gráfica básica desarrollada con `JOptionPane`.
Dentro de este paquete se encuentran:

#### - Main.java
Clase principal del sistema encargada de iniciar la ejecución de la aplicación.
Su responsabilidad es crear una instancia de `VentanaPrincipal` e iniciar la interfaz gráfica.

#### - VentanaPrincipal.java

Clase encargada de gestionar la interacción con el usuario.
Permite:
- Registrar nuevas entidades del sistema.
- Solicitar datos mediante cuadros de diálogo.
- Crear objetos de tipo `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno`.
- Enviar los objetos creados al `GestorEntidades`.
- Mostrar la información almacenada mediante el método `mostrarResumen()`.

La clase utiliza la colección administrada por `GestorEntidades` y aplica polimorfismo al recorrer objetos mediante referencias de tipo `Registrable`.
Además, utiliza el operador `instanceof` para identificar el tipo concreto de cada objeto durante la ejecución y aplicar una lógica diferenciada según la entidad registrada.

##### Uso del operador instanceof

El sistema utiliza el operador `instanceof` para identificar el tipo específico de cada objeto almacenado dentro de la colección.
Como la lista utiliza referencias del tipo común `Registrable`, todos los objetos pueden ser recorridos de manera uniforme. Sin embargo, mediante `instanceof` es posible determinar durante la ejecución si el objeto corresponde a una clase específica, como `GuiaTuristico`, `Vehiculo` o `ColaboradorExterno`.

Ejemplo:<br>
if(entidad instanceof GuiaTuristico){<br>
    // Lógica para guías turísticos<br>
}<br>
else if(entidad instanceof Vehiculo){<br>
    // Lógica para vehículos<br>
}<br>
else if(entidad instanceof ColaboradorExterno){<br>
    // Lógica para colaboradores externos<br>
}<br>

### ★Instrucciones para ejecutar

➢Clonar el repositorio desde GitHub:<br>
&nbsp;&nbsp;git clone https://github.com/jomunozl-dev/lanquihue-tour<br>
<br>
➢Abrir el proyecto en IntelliJ IDEA o NetBeans.<br>
➢Verificar que la estructura del proyecto contenga los paquetes:<br>
&nbsp;&nbsp;&nbsp;&nbsp;•&nbsp;&nbsp;model<br>
&nbsp;&nbsp;&nbsp;&nbsp;•&nbsp;&nbsp;data<br>
&nbsp;&nbsp;&nbsp;&nbsp;•&nbsp;&nbsp;ui<br>
<br>
➢Ejecutar la clase principal:<br>
&nbsp;&nbsp;&nbsp;&nbsp;•&nbsp;&nbsp;src/main/java/ui/Main.java<br>
<br>
➢La clase `Main` inicializa el sistema mediante `GestorServicios`, carga los servicios turísticos y muestra la información utilizando el método sobrescrito `mostrarInformacion()`.
 <br>
 <br>
 <br>
 <br>
