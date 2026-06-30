# Llanquihue tour APP
### Nombre del proyecto
LlanquihueTourApp

### Descripcion
Aplicación desarrollada en Java para representar y gestionar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.
El sistema permite modelar de forma jerárquica diferentes tipos de servicios turísticos mediante herencia simple, reutilizando atributos comunes y especializando características propias de cada categoría.

La aplicación está organizada de manera modular mediante paquetes funcionales, aplicando principios fundamentales de Programación Orientada a Objetos (POO), como: <br>
<br>
•Encapsulamiento<br>
•Herencia<br>
•Sobrescritura de métodos<br>
•Reutilización de código<br>
•Separación de responsabilidades<br>
<br>
En esta versión del proyecto, se implementa una jerarquía de clases para representar:<br>
<br>
•Rutas gastronómicas<br>
•Paseos lacustres<br>
•Excursiones culturales<br>

### Estructura de carpetas
src/<br>
└── main/<br>
&nbsp;&nbsp;&nbsp;&nbsp;└── java/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── model/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── ServicioTuristico.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── RutaGastronomica.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── PaseoLacustre.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── ExcursionCultural.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── data/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── GestorServicios.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── ui/<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Main.java<br>

### Jerarquia de clases
ServicioTuristico(Superclase)<br> ├── RutaGastronomica(Subclase)<br> ├── PaseoLacustre(Subclase)<br> └── ExcursionCultural(Subclase)<br>

### Instrucciones para ejecutar

Clonar el repositorio desde GitHub:<br>
&nbsp;&nbsp;git clone https://github.com/jomunozl-dev/lanquihue-tour<br>
Abrir el proyecto en IntelliJ IDEA o NetBeans.<br>
Verificar que la estructura del proyecto contenga los paquetes:<br>
&nbsp;&nbsp;&nbsp;&nbsp;•model<br>
&nbsp;&nbsp;&nbsp;&nbsp;•data<br>
&nbsp;&nbsp;&nbsp;&nbsp;•ui<br>
Ejecutar la clase principal:<br>
&nbsp;&nbsp;src/main/java/ui/Main.java<br>
<br>
La clase Main instancia la clase GestorServicios y ejecuta el método mostrarServicios(), encargado de crear los servicios turísticos de prueba y mostrar su información en consola.
 <br>
 <br>
 <br>
 <br>
	
