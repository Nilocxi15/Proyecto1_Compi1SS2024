package com.mycompany.servidor;

import analyzers.L_Analyzer;
import analyzers.S_Analyzer;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Servidor{

    public static void main(String[] args){
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

                out.writeUTF("Mensaje recibido correctamente");

                sc.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException e) {
            System.out.println("Error: no se pudo iniciar el servidor");
        }
    }

}
