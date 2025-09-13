package eci.edu.arsw.interfaces;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://arsw.edu.eci/")
public interface ServidorInterface {

    @WebMethod
    String saludar(@WebParam(name = "nombre") String nombre);
}
