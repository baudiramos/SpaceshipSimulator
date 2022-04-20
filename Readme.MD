## Simulador de nave espacial

## ¿En que se basa este proyecto?

Este proyecto contendrá la siguiente clase SpaceShip que a su vez contiene los siguientes atributos:

* Nombre
* Matrícula Galáctica
* Aceleración
* Velocidad X
* Velocidad Y
* Coordenada X
* Coordenada Y
* Dirección X
* Dirección Y

Este proyecto va a simular naves espaciales...

### Método speedUp

> Calculará la nueva velocidad y posición de la nave dependiendo de la aceleración aplicada a la velocidad actual.

### Sobrecarga del método toString()

> Devolverá una representación AsciiArt de la clase SpaceShip

# Directorio Docs

## ¿Qué incluye el directorio docs?

* Documento markdown: SpaceShip.md

> En este documento se explicará el funcionamiento de la clase SpaceShip() y estará enlazado desde este documento README.md

 > [Guía de la clase SpaceShip](/docs/SpaceShip.md)

### Método brake()

> Este método hace que la nave frene aplicando la misma aceleración pero en sentido contrario

### Método emergencyStop()

> Este método hace que la velocidad de la nave pase a 0 inmediatamente

## Clase cargo()

> Extende del método emergencyStop(), en la que se incluye un nuevo atributo que indica la capacidad máxima de carga de la nave

### Método load()

> Este método añade un container a la bodega de la nave de tipo Cargo en caso de que aun quede espacio, si no mostrará un error de que no cabe un container

### Método unload()

> Este método elimina un container de la bodega de carga si hay alguno almacenado allí, en caso contrario mostrará un mensaje de error que no puede descargarse por que no hay containers almacenados en la bodega

# Cargo.md

> Se explica el funcionamiento de la clase Cargo()

[comment]: <> (> [Guía del método Cargo&#40;&#41;]&#40;"www.google.es"&#41;)

# Interfaz:

> Este proyecto contiene una interfaz que realiza las siguientes acciones:


* Crear una nave
* mostrar asciiArt
* Acelear nave
* Frenar nave
* Parar nave
* Salir del menú

> Proyecto realizado por: Baudilio José Ramos Guanche |  © 2022
