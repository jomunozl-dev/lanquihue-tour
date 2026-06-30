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

# >>>> VER Video demostrativo <<<<
[![Ver video](https://drive.google.com/file/d/1Ko1Ce7SkPMOj2b5sassEA_aIhh8jDwFL/view?usp=sharing)](https://drive.google.com/file/d/1d2iCKEdkbSs2UAc3GL9fUJ0lHI5iwMtw/view?usp=sharing)

### Estructura de carpetas
src/<br>
└── main/<br>
&nbsp;&nbsp;&nbsp;&nbsp;├── java/<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── model/<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── Tour.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── data/<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── GestorDatos.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;├── service/<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── TourService.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;└── ui/<br>
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Main.java<br>
└── resources/<br>
&nbsp;&nbsp;&nbsp;&nbsp;└── tours.txt

### Archivo de datos

El archivo tours.txt contiene 5 registros con información de tours turísticos. Cada línea está estructurada con los siguientes campos separados por punto y coma (;):

nombre;destino;tipo;precio

Ejemplo:

LagoTodosLosSantos;PuertoVaras;Maritimo;15000

### Instrucciones para ejecutar

> Clonar el repositorio desde GitHub:
 >> git clone https://github.com/jomunozl-dev/lanquihue-tour

> Abrir el proyecto en IntelliJ IDEA o NetBeans.
> Verificar que la carpeta resources contenga el archivo tours.txt.
> Ejecutar la clase:
 >> src/main/java/ui/Main.java <br>
 <br>
 <br>
 <br>
 <br>
	
