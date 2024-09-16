package clientSide;

import analyzers.L_Analyzer;
import analyzers.S_Analyzer;

import java.net.*;
import java.io.*;

public class client {
    DataInputStream in;
    DataOutputStream out;

    boolean status = false;

    public boolean sendMessage(String message) {
        final String HOST = "localhost";
        final int PUERTO = 5000;

        try {
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF(message); // Enviamos un mensaje al servidor
            String mensaje = in.readUTF(); // Leemos la respuesta
            System.out.println(mensaje);

            L_Analyzer lexer = new L_Analyzer(new BufferedReader(new StringReader(mensaje)));
            S_Analyzer sintactic = new S_Analyzer(lexer);

            try {
                sintactic.parse();
                status = sintactic.resultado;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                status = false;
            }

            sc.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return status;
    }

    public void resetStatus() {
        status = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}