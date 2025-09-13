# Proyecto Cliente-Servidor Básico en Java
# Hecho por: **Alejandro Prieto**

---

## Descripción

Este proyecto implementa un ejemplo simple de comunicación cliente-servidor utilizando sockets en Java.

* El **Servidor** abre un puerto (5000) y espera la conexión de un cliente.
* El **Cliente** se conecta al servidor y envía un mensaje.
* El servidor recibe el mensaje y lo muestra por consola.

Es un punto de partida para entender la comunicación básica con sockets TCP.

---

## Estructura del proyecto

```
p2p/
├── pom.xml
├── README.MD
└── src/
    ├── main/
    │   ├── java/
    │   │   └── eci/edu/arsw/
    │   │       ├── Cliente.java
    │   │       └── Servidor.java
    │   └── resources/
    └── test/
        └── java/
```

---

## Cómo probar el proyecto

1. **Compilar y ejecutar el servidor**

   * Navegar a la carpeta del proyecto en la terminal.
   * Ejecutar:

     ```bash
     mvn compile
     mvn exec:java -Dexec.mainClass="eci.edu.arsw.Servidor"
     ```
   * El servidor quedará a la espera de conexiones.

2. **Ejecutar el cliente**

   * Abrir otra terminal en la misma carpeta del proyecto.
   * Ejecutar:

     ```bash
     mvn exec:java -Dexec.mainClass="eci.edu.arsw.Cliente"
     ```
   * El cliente enviará el mensaje al servidor y se cerrará.

3. **Verificar salida del servidor**

   * En la terminal donde se ejecutó el servidor, se debería ver:

     ```
     Servidor iniciado y esperando conexión...
     Cliente conectado.
     Mensaje recibido del cliente: Hola servidor, este es el cliente!
     ```

4. **Cerrar servidor**

   * El servidor se cerrará automáticamente tras recibir el mensaje y cerrar la conexión.
