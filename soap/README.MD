# Proyecto SOAP - Servicio Web JAX-WS

**Hecho por: Alejandro Prieto**

---

## Descripción

Este proyecto implementa un servicio web SOAP usando JAX-WS en Java.

* El **Servidor** publica un servicio SOAP en `http://localhost:8080/soap-service`.
* El **Cliente** consume ese servicio para invocar remotamente el método `saludar`, que recibe un nombre y devuelve un saludo personalizado.

Es un ejemplo básico para entender servicios SOAP en Java.

---

## Estructura del proyecto

```
soap/
├── pom.xml
├── README.MD
├── request.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── eci/edu/arsw/
    │   │       ├── Cliente.java
    │   │       ├── Servidor.java
    │   │       └── interfaces/
    │   │           └── ServidorInterface.java
    │   └── resources/
    └── test/
        └── java/
```

---

## Cómo probar el proyecto

1. **Compilar el proyecto**
   Desde la raíz del proyecto:

   ```bash
   mvn compile
   ```

2. **Ejecutar el servidor SOAP**

   ```bash
   mvn exec:java -Dexec.mainClass="eci.edu.arsw.implementation.ServidorImpl"
   ```

   > **Nota:** Ajusta el valor de `mainClass` si tu clase principal para arrancar el servidor tiene otro nombre o paquete.

   Verás en consola mensajes como:

   ```
   Publicando servicio en: http://localhost:8080/soap-service
   Servicio publicado. Presiona Ctrl+C para detener.
   ```

3. **Ejecutar el cliente SOAP**
   En otra terminal, desde la raíz del proyecto:

   ```bash
   mvn exec:java -Dexec.mainClass="eci.edu.arsw.Cliente"
   ```

   El cliente invocará el método remoto `saludar("Samuel")` y mostrará:

   ```
   Respuesta del servidor: Hola, Samuel! Bienvenido al servicio SOAP.
   ```

4. **Probar con SOAP UI u otra herramienta**

   * Puedes importar el WSDL disponible en:

     ```
     http://localhost:8080/soap-service?wsdl
     ```

   * Probar operaciones manualmente con herramientas gráficas.

5. **Detener el servidor**

   * En la terminal donde se ejecutó el servidor, presiona `Ctrl+C`.

---

## Ejemplo de petición SOAP (request.xml)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope 
  xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
  xmlns:arsw="http://arsw.edu.eci/">
  <soapenv:Header/>
  <soapenv:Body>
    <arsw:saludar>
      <nombre>Samuel</nombre>
    </arsw:saludar>
  </soapenv:Body>
</soapenv:Envelope>
```