package com.mycompany.servidor;

import analyzers.L_Analyzer;
import analyzers.S_Analyzer;
import filesManager.readFiles;

import java.net.*;
import java.io.*;

public class Servidor{

    public static void main(String[] args){

        readFiles read = new readFiles();

        read.loadUsers();
        read.printUsersList();

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        final int PUERTO = 5000;

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true) {
                sc = servidor.accept();

                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF();

                L_Analyzer lexer = new L_Analyzer(new BufferedReader(new StringReader(mensaje)));
                S_Analyzer sintactic = new S_Analyzer(lexer);

                try {
                    sintactic.parse();
                } catch (Exception e) {

                }

                System.out.println(mensaje);

                String response = null;
                response = "<?xson version=\"1.0\" ?>\n";
                response += "<!envio_respuesta: \"LOGIN_USUARIO\" >\n";
                response += "{ \"RESPUESTA\":[{\n";
                response += "\"STATUS\": \"Ok\"\n";
                response += "}]\n";
                response += "}\n";
                response += "<fin_envio_respuesta!>";

                out.writeUTF(response);

                sc.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException e) {
            System.out.println("Error: no se pudo iniciar el servidor");
        }
    }

}
