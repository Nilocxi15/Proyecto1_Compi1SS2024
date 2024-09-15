package clientSide;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
    final String HOST = "localhost";
    final int PUERTO = 5000;

    DataInputStream in;
    DataOutputStream out;
    String mensajeRecibido;

    public void sendMessage(String message) {
        final String HOST = "localhost";
        final int PUERTO = 5000;

        try {
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF(message); // Enviamos un mensaje al servidor
            String mensaje = in.readUTF(); // Leemos la respuesta
            System.out.println(mensaje);

            sc.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

}