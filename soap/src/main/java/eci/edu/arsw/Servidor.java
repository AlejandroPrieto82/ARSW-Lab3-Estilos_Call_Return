package eci.edu.arsw;

import eci.edu.arsw.interfaces.ServidorInterface;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;

@WebService(
    endpointInterface = "eci.edu.arsw.interfaces.ServidorInterface",
    targetNamespace = "http://arsw.edu.eci/",
    serviceName = "ServidorImplService",
    portName = "ServidorImplPort"
)
public class Servidor implements ServidorInterface {

    @Override
    public String saludar(String nombre) {
        System.out.println("Nombre recibido: '" + nombre + "'");
        return "Hola, " + nombre + "! Bienvenido al servicio SOAP.";
    }

    public static void main(String[] args) {
        String url = "http://localhost:8080/soap-service";
        System.out.println("Publicando servicio en: " + url);
        Endpoint.publish(url, new Servidor());
        System.out.println("Servicio publicado. Presiona Ctrl+C para detener.");
    }
}
