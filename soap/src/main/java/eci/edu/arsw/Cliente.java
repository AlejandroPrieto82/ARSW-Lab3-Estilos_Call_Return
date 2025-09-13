package eci.edu.arsw;

import java.net.URL;

import javax.xml.namespace.QName;

import eci.edu.arsw.interfaces.ServidorInterface;
import jakarta.xml.ws.Service;

public class Cliente {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/soap-service?wsdl");

        QName qnameServicio = new QName("http://arsw.edu.eci/", "ServidorImplService");
        QName qnamePuerto = new QName("http://arsw.edu.eci/", "ServidorImplPort");

        Service service = Service.create(url, qnameServicio);
        ServidorInterface proxy = service.getPort(qnamePuerto, ServidorInterface.class);

        String respuesta = proxy.saludar("Samuel");
        System.out.println("Respuesta del servidor: " + respuesta);
    }
}
