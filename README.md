# Sistema CRUD de Productos Periféricos

## Descripción

Este proyecto es un **sistema CRUD** (Crear, Leer, Actualizar, Eliminar) que permite gestionar productos periféricos de forma sencilla y efectiva. Utiliza **Spring Boot** como framework de desarrollo, **JPA** para la gestión de la persistencia de datos, **Thymeleaf** para el renderizado de la interfaz de usuario, y **MySQL** como sistema de gestión de bases de datos.

### Funcionalidades

- **Agregar Productos**: Interfaz para introducir nuevos productos en la base de datos, facilitando la gestión de inventario.
- **Editar Productos**: Posibilidad de modificar la información de productos existentes, asegurando que los datos estén siempre actualizados.
- **Eliminar Productos**: Funcionalidad para eliminar productos de la base de datos de manera eficiente.
- **Listar Productos**: Vista de todos los productos disponibles en un formato de tabla, con opciones de búsqueda y filtrado.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para el desarrollo del backend.
- **Spring Boot**: Framework que simplifica el desarrollo de aplicaciones Java.
- **JPA (Java Persistence API)**: Utilizado para gestionar la persistencia de datos.
- **Thymeleaf**: Motor de plantillas para renderizar las vistas en el frontend.
- **MySQL**: Sistema de gestión de bases de datos relacional utilizado para almacenar la información.

## Requisitos Previos

- Java JDK (versión 11 o superior)
- Maven (para gestionar las dependencias)
- MySQL (para la gestión de la base de datos)

## Instalación

1. **Clona el repositorio**:
   ```bash
   [git clone https://github.com/heanz-1/GestorDePerifericos]

Configura la base de datos:

Crea una base de datos en MySQL llamada GamingWorld.
Configura el archivo application.properties (o application.yml) con tus credenciales de la base de datos.
Compila y ejecuta el proyecto:

Abre Spring Boot Tools.
Importa el proyecto clonado como un proyecto existente.
Ejecuta la clase principal (contiene el método main) para iniciar la aplicación.
Accede a la aplicación:

Abre tu navegador y ve a http://localhost:8080.
