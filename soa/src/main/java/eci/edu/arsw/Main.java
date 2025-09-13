package eci.edu.arsw;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class Main {
    public static final String BASE_URI = "http://localhost:8080/";

    public static void main(String[] args) {
        final ResourceConfig rc = new ResourceConfig().packages("eci.edu.arsw");


        final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);

        System.out.println("Servidor REST arrancado en " + BASE_URI + " (Presiona Ctrl+C para detener)");

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            System.out.println("Servidor detenido.");
        } finally {
            server.shutdownNow(); // Para el servidor al salir
        }
    }
}
