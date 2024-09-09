package clientSide;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client{
    static String HOST = "localhost";
    static int PUERTO = 5000;
    Socket sc;
    DataOutputStream salida;
    DataInputStream entrada;
    String mensajeRecibido;

    public void sendMessage(String message){
        try{
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            salida.writeUTF(message);//enviamos mensaje
            mensajeRecibido = entrada.readUTF();//Leemos respuesta
            System.out.println(mensajeRecibido);
            sc.close();
        }catch(Exception e){

        }
    }

}