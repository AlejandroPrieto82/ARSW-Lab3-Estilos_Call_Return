# Proyecto REST Básico con Spring Boot

**Hecho por: Alejandro Prieto**

---

## Descripción

Este proyecto es una API REST sencilla desarrollada con Spring Boot que permite manejar mensajes a través de peticiones HTTP.
Cuenta con las operaciones básicas:

* Obtener todos los mensajes (`GET /api/mensajes`)
* Obtener un mensaje por ID (`GET /api/mensajes/{id}`)
* Crear un nuevo mensaje (`POST /api/mensajes`)

Los mensajes se almacenan en memoria usando un repositorio simulado con una lista.

---

## Estructura del proyecto

```
rest/
├── pom.xml
├── README.MD
└── src/
    ├── main/
    │   ├── java/
    │   │   └── eci/edu/arsw/
    │   │       ├── RestApplication.java
    │   │       ├── controller/
    │   │       │   └── MensajeController.java
    │   │       ├── modelo/
    │   │       │   └── Mensaje.java
    │   │       ├── repositorio/
    │   │       │   └── MensajeRepository.java
    │   │       └── service/
    │   │           └── MensajeService.java
    │   └── resources/
    └── test/
        └── java/
```

---

## Requisitos previos

* Tener instalado Java 17 (o superior).
* Tener Maven instalado.
* El servidor correrá en `http://localhost:8080`.

---

## Cómo probar el proyecto

1. **Compilar y ejecutar la aplicación**
   En la carpeta raíz del proyecto, ejecutar:

   ```bash
   mvn spring-boot:run
   ```

2. **Probar los endpoints**
   Puedes usar Postman, curl o cualquier cliente HTTP.

   * Obtener todos los mensajes:

     ```
     GET http://localhost:8080/api/mensajes
     ```

   * Obtener mensaje por ID (ejemplo con ID = 1):

     ```
     GET http://localhost:8080/api/mensajes/1
     ```

   * Crear un mensaje nuevo (el ID debe ser único):

     ```
     POST http://localhost:8080/api/mensajes
     Content-Type: application/json

     {
       "id": 1,
       "texto": "Hola, este es un mensaje"
     }
     ```

   * Ejemplo con curl para crear un mensaje:

     ```bash
     curl -X POST http://localhost:8080/api/mensajes \
     -H "Content-Type: application/json" \
     -d '{"id":1, "texto":"Hola, este es un mensaje"}'
     ```

3. **Respuesta esperada**

   * GET `/api/mensajes` devolverá una lista con todos los mensajes almacenados.
   * GET `/api/mensajes/{id}` devolverá el mensaje con ese ID o un 404 si no existe.
   * POST `/api/mensajes` guardará el mensaje y devolverá el mensaje guardado.

---

## Nota importante

Los mensajes se almacenan solo en memoria, por lo que se perderán al detener la aplicación.