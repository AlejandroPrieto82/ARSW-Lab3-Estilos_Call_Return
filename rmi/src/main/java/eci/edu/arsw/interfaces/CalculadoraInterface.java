package eci.edu.arsw.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  CalculadoraInterface extends Remote{
    int sumar(int a, int b) throws RemoteException;
}
