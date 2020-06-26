# Optimizacion-Codigo-C4

# Optimización del código

Se añadio modularidad al código en las clases template separando la creación de los objetos gráficos y los objetos decoradores dandole orden al proyecto y también se optimizo los recursos de la aplicación con el uso de un servicio que administra los objetos que pueden ser utilizados en diferentes clases.

## Modularización del código

[Modularización](link)

Podemos observar como con la creación de los metodos para crear cada objeto gráfico el proyecto se ve mas ordenado y me permite el manejo de cada metodo reduciendo las lineas de codigo de los otros.

[Manejo metodos](link)

## Creación de la clase Objetos Gráficos

[ObjetosGraficos](link)

Creación de un Botón por medio del servicio, podemos observar la comparación de como creamos el botón antes y depués con el uso del servicio de la clase objetos gráficos

[nuevacreación](link)

Se crea una clase nueva para el servicio de los objetos decoradores:

[optimización de recursos](link)

Para que cualquier clase template pueda obtener los objetos decoradores a traves del servicio necesitamos crear unos métodos get que nos retornen estos objetos

[Metodo get](link)

[Ejemplo de llamada de recursos](link)

Se agrega un orden adicional, con el fin de saber que botones u objetos gráficos estamos creando para facilitar el manejo y entendimiento del codigo 

[orden adicional](link)
