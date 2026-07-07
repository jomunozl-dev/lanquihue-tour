# 🏞️ Llanquihue tour APP
### ★Nombre del proyecto
LlanquihueTourApp

### ★Descripcion
Aplicación desarrollada en Java para representar y gestionar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

El sistema permite modelar diferentes tipos de servicios turísticos mediante una jerarquía de clases, incorporando herencia simple, polimorfismo y colecciones genéricas para gestionar dinámicamente los servicios desde una única colección.

La aplicación está organizada de forma modular mediante paquetes funcionales, aplicando principios fundamentales de Programación Orientada a Objetos (POO), tales como: <br>
<br>
•Encapsulamiento.<br>
•Herencia.<br>
•Polimorfismo.<br>
•Sobrescritura de métodos.<br>
•Reutilización de código.<br>
•Separación de responsabilidades.<br>
<br>
En esta versión del proyecto, los servicios turísticos se almacenan en una colección de tipo List<ServicioTuristico>, permitiendo recorrerlos de forma polimórfica mediante referencias a la superclase e invocar el método mostrarInformacion() sobrescrito por cada subclase.

La jerarquía implementada representa los siguientes servicios turísticos:<br>

✦Rutas gastronómicas.<br>
✦Paseos lacustres.<br>
✦Excursiones culturales.<br>

### ★Estructura de carpetas
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

### ★Jerarquia de clases
ServicioTuristico(Superclase)<br> ├── RutaGastronomica(Subclase)<br> ├── PaseoLacustre(Subclase)<br> └── ExcursionCultural(Subclase)<br>
<br>
Todas las subclases heredan los atributos y comportamientos comunes definidos en ServicioTuristico y sobrescriben el método mostrarInformacion() para mostrar información específica de cada tipo de servicio.

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
	
