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
<br>

- La interfaz `Registrable` define el comportamiento común mediante el método `mostrarResumen()`.
- La clase `RecursoAgencia` contiene atributos compartidos por las entidades del sistema y permite reutilizar código mediante herencia.
- Las clases `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno` heredan de `RecursoAgencia` e implementan la interfaz `Registrable`, sobrescribiendo el método `mostrarResumen()` para entregar información 
específica según el tipo de entidad.

### ★Cambios incorporados<br>
Respecto a la versión anterior del proyecto, se realizaron las siguientes mejoras:<br>
<br>
•Se incorporó el método mostrarInformacion() en la superclase ServicioTuristico.<br>
•Las subclases RutaGastronomica, PaseoLacustre y ExcursionCultural sobrescriben el método mostrarInformacion() mediante la anotación @Override.<br>
•Se reemplazó la creación de objetos individuales por una colección genérica List<ServicioTuristico>.<br>
•Se implementó una colección polimórfica que almacena objetos de distintas subclases.<br>
•Se recorren los servicios mediante un ciclo for-each, aplicando polimorfismo sin utilizar instanceof.<br>
•Se reorganizó la clase GestorServicios para centralizar la carga y visualización de los servicios turísticos.<br>

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
➢La clase Main crea una instancia de GestorServicios, carga los servicios turísticos de prueba en una colección List<ServicioTuristico> mediante el método cargarServicios() y posteriormente ejecuta mostrarServicios(), que recorre la colección aplicando polimorfismo para mostrar la información específica de cada servicio.
 <br>
 <br>
 <br>
 <br>
	
