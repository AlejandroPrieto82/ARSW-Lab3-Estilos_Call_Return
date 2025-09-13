package eci.edu.arsw.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora")
public class CalculadoraService {

    @GET
    @Path("/sumar")
    @Produces(MediaType.APPLICATION_JSON)
    public Resultado sumar(@QueryParam("a") int a, @QueryParam("b") int b) {
        int suma = a + b;
        return new Resultado(suma);
    }

    public static class Resultado {
        private int resultado;

        public Resultado() {}

        public Resultado(int resultado) {
            this.resultado = resultado;
        }

        public int getResultado() {
            return resultado;
        }

        public void setResultado(int resultado) {
            this.resultado = resultado;
        }
    }
}
