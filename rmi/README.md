# Proyecto RMI - Calculadora Remota

**Hecho por: Alejandro Prieto**

---

## Descripción

Este proyecto implementa un servicio RMI (Remote Method Invocation) en Java que expone una calculadora remota con la operación de suma.

* El **Servidor** publica el servicio `CalculadoraService` que implementa la interfaz remota.
* El **Cliente** se conecta al registro RMI, busca el servicio y llama remotamente al método `sumar`.

Es un ejemplo básico para entender el uso de RMI en Java.

---

## Estructura del proyecto

```
rmi/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── eci/edu/arsw/
    │   │       ├── Cliente.java
    │   │       ├── Servidor.java
    │   │       ├── implementation/
    │   │       │   └── CalculadoraImpl.java
    │   │       └── interfaces/
    │   │           └── CalculadoraInterface.java
    │   └── resources/
    └── test/
        └── java/
```

---

## Cómo probar el proyecto

1. **Compilar el proyecto**
   En la raíz del proyecto, ejecutar:

   ```bash
   mvn compile
   ```

2. **Ejecutar el servidor**
   Ejecutar en la terminal:

   ```bash
   mvn exec:java -Dexec.mainClass="eci.edu.arsw.Servidor"
   ```

   Esto iniciará el registro RMI y registrará el servicio `CalculadoraService`.
   Verás en consola el mensaje:

   ```
   Servidor listo.
   ```

3. **Ejecutar el cliente**
   Abrir otra terminal y ejecutar:

   ```bash
   mvn exec:java -Dexec.mainClass="eci.edu.arsw.Cliente"
   ```

   El cliente invocará remotamente el método `sumar(10, 20)` y mostrará el resultado:

   ```
   Resultado remoto: 30
   ```

4. **Cerrar las aplicaciones**

   * El servidor se puede detener con `Ctrl+C`.
   * El cliente se cierra automáticamente tras mostrar el resultado.
