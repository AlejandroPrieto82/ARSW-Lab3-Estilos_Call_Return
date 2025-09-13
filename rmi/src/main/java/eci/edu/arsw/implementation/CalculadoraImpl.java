package eci.edu.arsw.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import eci.edu.arsw.interfaces.CalculadoraInterface;

public class CalculadoraImpl extends UnicastRemoteObject implements CalculadoraInterface {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }
}
