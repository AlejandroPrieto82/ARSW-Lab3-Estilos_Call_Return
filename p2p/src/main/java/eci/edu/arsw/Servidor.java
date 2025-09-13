package eci.edu.arsw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Servidor iniciado y esperando conexión...");
        
        Socket socket = serverSocket.accept();  // Espera conexión del cliente
        System.out.println("Cliente conectado.");

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String mensaje = input.readLine();
        System.out.println("Mensaje recibido del cliente: " + mensaje);

        socket.close();
        serverSocket.close();
    }
}

