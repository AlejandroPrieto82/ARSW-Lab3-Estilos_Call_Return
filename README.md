# ARSW-Lab3-Estilos\_Call\_Return

**Hecho por:** Alejandro Prieto

---

## Descripción general

Este repositorio contiene varios proyectos de ejemplo para distintos estilos y protocolos de comunicación en servicios distribuidos y sistemas distribuidos, incluyendo:

* **REST**
* **SOAP**
* **SOA con JAX-RS**
* **RMI**
* **P2P**

Cada carpeta representa una implementación o experimento con uno de estos protocolos o estilos de comunicación, permitiendo entender y comparar sus características, ventajas y formas de uso.

---

## Proyectos y protocolos incluidos

### 1. REST (`rest/`)

* **Qué es:**
  REST (Representational State Transfer) es un estilo arquitectónico para diseñar APIs web usando HTTP.
  Los servicios REST usan verbos HTTP como GET, POST, PUT, DELETE para operar sobre recursos.

* **Qué contiene:**
  Un servicio web desarrollado con Spring Boot que permite manejar mensajes.
  Operaciones básicas para obtener todos los mensajes, obtener un mensaje por ID y crear mensajes nuevos.

* **Tecnologías:**
  Java 17, Spring Boot 3, Maven.

---

### 2. SOAP (`soap/`)

* **Qué es:**
  SOAP (Simple Object Access Protocol) es un protocolo estándar para intercambiar mensajes XML entre aplicaciones a través de HTTP o SMTP.
  Es más estricto que REST, usa un formato de mensaje estándar (XML con envoltorios SOAP) y está basado en contratos (WSDL).

* **Qué contiene:**
  Servicio web SOAP publicado usando JAX-WS que expone un método para saludar.
  Incluye cliente y servidor para invocar el método remoto.

* **Tecnologías:**
  Java 17, JAX-WS (Jakarta XML WS), Maven.

---

### 3. SOA - Servicio REST con JAX-RS (`soa/`)

* **Qué es:**
  SOA (Arquitectura Orientada a Servicios) es un enfoque para construir aplicaciones como servicios interoperables.
  En este caso, se implementa un servicio RESTful usando JAX-RS, la API estándar de Jakarta para servicios REST.

* **Qué contiene:**
  Un servicio REST básico para una calculadora que suma dos números pasados por query parameters.

* **Tecnologías:**
  Java 17, Jersey (implementación JAX-RS), Maven.

---

### 4. RMI (`rmi/`)

* **Qué es:**
  RMI (Remote Method Invocation) es una tecnología de Java que permite la invocación remota de métodos en objetos que viven en otras JVMs.
  Permite comunicación distribuida con llamadas a métodos como si fueran locales.

* **Qué contiene:**
  Implementación cliente-servidor para un servicio de calculadora usando RMI.
  Define interfaces remotas y clases de implementación.

* **Tecnologías:**
  Java 17, RMI estándar.

---

### 5. P2P (`p2p/`)

* **Qué es:**
  P2P (Peer-to-Peer) es un modelo de red descentralizado donde cada nodo puede actuar como cliente y servidor.
  No hay servidores centrales y los pares se comunican directamente.

* **Qué contiene:**
  Ejemplo simple de comunicación P2P en Java.
  Incluye código para nodos que se descubren y envían mensajes entre sí.

* **Tecnologías:**
  Java 17, Maven.

---

## Estructura general del repositorio

```
ARSW-Lab3-Estilos_Call_Return/
│
├── p2p/      # Ejemplo Peer-to-Peer
├── rest/     # API REST con Spring Boot
├── rmi/      # Servicio con Java RMI
├── soa/      # Servicio REST con JAX-RS (Jersey)
└── soap/     # Servicio SOAP con JAX-WS
```

Cada proyecto contiene su propio `pom.xml` para gestión de dependencias, código fuente en `src/main/java`, recursos en `src/main/resources`, y pruebas en `src/test/java`.

---

## Requisitos previos

* Java 17 o superior instalado y configurado en el PATH.
* Maven 3.6 o superior instalado y configurado en el PATH.

---

## Cómo empezar

1. Selecciona el proyecto que quieras ejecutar (por ejemplo `rest/` para REST).
2. Entra en la carpeta del proyecto desde la consola.
3. Usa Maven para compilar y ejecutar el proyecto, por ejemplo:

```bash
mvn clean compile
```

Luego para ejecutar, según el proyecto:

```bash
# Para REST con Spring Boot
mvn spring-boot:run

# Para SOA con JAX-RS
mvn exec:java -Dexec.mainClass="eci.edu.arsw.Main"

# Para SOAP o RMI (según proyecto)
mvn exec:java -Dexec.mainClass="eci.edu.arsw.Servidor"
```

4. Sigue las instrucciones específicas de cada carpeta para probar los servicios (endpoints, clientes, etc).

---

## Ejemplos rápidos para probar servicios

### REST (Spring Boot)

Ejemplo usando `curl` para obtener todos los mensajes:

```bash
curl -X GET http://localhost:8080/mensajes
```

### SOAP

Después de iniciar el servidor SOAP, puedes probar con el cliente incluido o con SoapUI importando:

```
http://localhost:8080/soap-service?wsdl
```

Ejemplo de request SOAP (contenido de `request.xml`):

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

### SOA (JAX-RS)

Para sumar dos números, usar:

```
GET http://localhost:8080/calculadora/sumar?a=10&b=20
```

Respuesta JSON:

```json
{
  "resultado": 30
}
```

---

## Estructura común del código fuente

En cada proyecto la estructura sigue el estándar Maven:

```
src/
├── main/
│   ├── java/          # Código fuente Java
│   └── resources/     # Archivos de configuración y recursos
└── test/
    └── java/          # Tests unitarios
```

---

## Cómo contribuir

Si deseas contribuir:

1. Haz un fork del repositorio.
2. Crea una rama para tu feature o bugfix.
3. Envía un Pull Request describiendo los cambios.

---

## Contacto

Para preguntas o soporte, puedes contactarme en:
[Alejandro Prieto GitHub](https://github.com/AlejandroPrieto82)

---

## Recursos útiles

* [Spring Boot REST](https://spring.io/projects/spring-boot)
* [JAX-WS (SOAP)](https://javaee.github.io/metro-jax-ws/)
* [Jersey (JAX-RS)](https://eclipse-ee4j.github.io/jersey/)
* [Java RMI](https://docs.oracle.com/javase/tutorial/rmi/)
* [Conceptos P2P](https://en.wikipedia.org/wiki/Peer-to-peer)

---

## Licencia

[Licencia](/LICENSE)
