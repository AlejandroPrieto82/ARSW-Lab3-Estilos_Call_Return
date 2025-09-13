package eci.edu.arsw;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import eci.edu.arsw.interfaces.CalculadoraInterface;

public class Cliente {
    public static void main(String[] args) {
        try {
            int port = 1099;
            Registry registry = LocateRegistry.getRegistry("localhost", port);
            
            CalculadoraInterface calc = (CalculadoraInterface) registry.lookup("CalculadoraService");

            int resultado = calc.sumar(10, 20);
            System.out.println("Resultado remoto: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
