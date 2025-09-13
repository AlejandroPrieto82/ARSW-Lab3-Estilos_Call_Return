package eci.edu.arsw;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import eci.edu.arsw.implementation.CalculadoraImpl;
import eci.edu.arsw.interfaces.CalculadoraInterface;

public class Servidor {
    public static void main(String[] args) {
        try {
            CalculadoraInterface calc = new CalculadoraImpl();

            int port = 1099;
            Registry registry = LocateRegistry.createRegistry(port);

            registry.rebind("CalculadoraService", calc);

            System.out.println("Servidor listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
