# Proyecto SOA - Servicio REST de Calculadora

**Hecho por: Alejandro Prieto**

---

## Descripción

Este proyecto expone un servicio REST simple usando JAX-RS (Jakarta RESTful Web Services) para realizar una operación de suma.

* **Endpoint:** `/calculadora/sumar`
* **Parámetros:** `a` y `b` como query params enteros.
* **Respuesta:** JSON con el resultado de la suma.

Es un ejemplo básico de un servicio RESTful que puede ser consumido desde cualquier cliente HTTP.

---

## Estructura del proyecto

```
soa/
├── pom.xml
├── README.MD
└── src/
    ├── main/
    │   ├── java/
    │   │   └── eci/edu/arsw/
    │   │       ├── Main.java
    │   │       └── services/
    │   │           └── CalculadoraService.java
    │   └── resources/
    └── test/
        └── java/
```

---

## Cómo probar el proyecto

1. **Compilar y ejecutar el proyecto**
   En la raíz del proyecto ejecutar:

   ```bash
   mvn clean compile
   mvn exec:java -Dexec.mainClass="eci.edu.arsw.Main"
   ```

   Esto levantará el servidor con el servicio REST (usualmente en `http://localhost:8080`, salvo que se haya configurado otro puerto en `Main.java`).

2. **Consumir el servicio REST**
   Usar un navegador, Postman o curl para hacer la petición:

   ```
   GET http://localhost:8080/calculadora/sumar?a=10&b=20
   ```

   La respuesta será un JSON con el resultado:

   ```json
   {
     "resultado": 30
   }
   ```

3. **Cerrar el servidor**
   Detener con `Ctrl+C` en la terminal donde se ejecutó el proyecto.