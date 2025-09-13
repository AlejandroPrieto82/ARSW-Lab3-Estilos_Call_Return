package eci.edu.arsw;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        output.println("Hola servidor, este es el cliente!");

        socket.close();
    }
}

