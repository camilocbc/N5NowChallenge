# Proyecto de Automatizacion Netflix

Pruebas de regresion funcional sobre el sitio web de netflix principalmente intentos fallidos de inicio de sesion.


## Pre-requisitos

* JDK Java  1.8 o superior.
* Apache Maven 3.+.
* IDE de Preferencia.
* Browser Chrome

## Instalación

1. Clonar el proyecto, desde el repositorio en github [Ruta Repositorio]().
2. Situarse en la carpeta del proyecto.
3. Abrir el proyecto desde el IDE.
4. Ejecutar la instalacion de las dependencias de MAVEN con el comando `mvn install` o ejecutando el archivo pom.xml.


## Estructura del proyecto

```
src
└── test
    ├── java
    │   ├── Definitions
    │   |   └── Hooks.java
    │   |   └── LoginDefinitions.java
    │   |   └── OmnicanalidadDefinitions.java
    │   |   └── ReportsDefinitions.java
    │   |   └── SMSDefinitions.java
    │   |   └── WhatsAppDefinitions.java
    │   └── PageObjects
    │   |   └── LoginPageObject.java
    │   |   └── OmnicanalidadPageObject.java
    │   |   └── ReportesOmniPageObject.java
    │   |   └── SMSPageObject.java
    │   |   └── WhatsAppPageObject.java
    │   └── Runners
    │   |   └── MainRunner.java
    │   └── Utilities
    │   |   └── BaseUtil.java
    │   |   └── Credentials.java
    └── resources
    │   ├── features
    │   |   └── Netflix.features
    │   ├── reportes
    │   |   └── cucumber.json
    │   |   └── cucumber.html
    │   ├── webdriver
    │   |   └── windows
    |   │       └── chromedriver.exe
.
```

## Descripcion de carpetas:

| Ruta                                | Descripcion                                                                                                          |
|-------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| test\resources\features\\\*.feature | Carpeta con todos los **archivos features** los cuales contienen los **Escenarios de prueba**                        |
| test\java\PageObjects\\\*Page.java  | Carpeta con todos los **PageObjects** que contienen los metodos y los localizadores de la interface de la pagina web |
| test\java\...\Definitios\\\*SD.java | Carpeta con todos los **steps** los cuales contienen los metodos de PageObject de manera mas organizada.             |
| test\resources\webdriver            | Carpeta con los drives de Windons y Linux para la ejecucion en local.                                                |
| test\resources\reportes             | Carpeta con los reportes general de la ejecucion en diferentes formatos.                                             |

# Configuraciones Importantes

Ingresar a el archivo `credentials.properties` e ingreso las credenciales de Netflix.

```
web.page.url = https://www.netflix.com
```
## Ejecución del Proyecto

1. Para ejecutar el proyecto tenemos las siguientes maneras:

### Lineas de Comando
Un caso
```shell

mvn test -Dcucumber.filter.tags="@tagDeCucumber"

```
Varios casos
```shell

mvn test -Dcucumber.filter.tags="@tagDeCucumber or @tagDeOtroEscenario"

```

### Desde el IDE

Nos dirigimos a la clase de java MainRunner, luego en CucumberOptions en la opcion de *tags* digitamos el tag o los tag del proyecto de la siguiente forma:

```
 tags = "@TagDeCucumber",
```

