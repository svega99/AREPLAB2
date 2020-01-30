# Laboratorio 2

Programa que calcula la media y desviación estandar de una lista de numeros que lee por medio de una pagina web.

## Empezando

Pasos para necesarios para correr el programa 

### Prerrequisitos

#### Java
 Java es necesario para correr el programa, para comprobar si esta instalado desde la linea de comandos:

```
>java -version

java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

#### Maven
El programa corre con maven, para comprobar si esta instalado desde la linea de comandos:

```
>mvn -v

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T14:00:29-05:00)
Maven home: C:\Program Files\apache-maven-3.6.1\bin\..
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_181\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git
Para descargar el programa se necesita git, para comprobar si esta instalado desde la linea de comandos:

```
> git --version

git version 2.21.0.windows.1
```

#### Heroku
La pagina web esta alojada en heroku, para comprobar si esta instalado desde la linea de comandos:

```
> heroku -v

heroku/7.37.0 win32-x64 node-v12.13.0

```

### Instalación

Para instalar el repositorio se instala en la ruta deseada desde git de esta forma

```
> git clone https://github.com/svega99/AREPLAB2.git

```
Para compilar el proyecto desde maven:

```
> mvn package
```
## Ejecutando el programa

Link a heroku del programa: 
[![Heroku](https://camo.githubusercontent.com/be46aee4f8d55e322c3e7db60ea23a4deb5427c9/68747470733a2f2f6865726f6b752d62616467652e6865726f6b756170702e636f6d2f3f6170703d6865726f6b752d6261646765)](https://ancient-taiga-60700.herokuapp.com/inputdata)

Si quiere ejecutar el programa desde local se puede poner le la linea de comandos desde la ruta del proyecto:

```
> mvn clean install
...
> heroku local web

```

En la página se encuentra un formulario que pedira los numeros separados por comas, si no se hace de esta manera el calculo no se hará de manera correcta. Al darle click botón "Submit" se redirigirá a una página con la respuesta. 


## Corriendo los tests

Para correr los tests:

```
> mvn test
...
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.escuelaing.app.CalculatorTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s - in edu.escuelaing.app.CalculatorTest
[INFO] Running edu.escuelaing.app.LinkedListTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in edu.escuelaing.app.LinkedListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.922 s
[INFO] Finished at: 2020-01-30T10:49:33-05:00
[INFO] ------------------------------------------------------------------------
```

El programa usa dos clases de test. ```LinkedListTest``` prueba el funcionamiento de la LinkedList y ```CalculatorTest``` prueba que la media y la desviación estandar se calculen de la forma adecuada.

## Diseño

[DISEÑO.pdf](DISEÑO.pdf)

## Authors

* **Santiago Vega Romero**  - [svega99](https://github.com/svega99)

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details
