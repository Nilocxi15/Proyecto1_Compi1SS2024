package com.mycompany.servidor;

import analyzers.L_Analyzer;
import analyzers.S_Analyzer;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Servidor{
    static int PUERTO = 5000;
    ServerSocket sc;
    Socket so;
    DataOutputStream salida;
    DataInputStream entrada;
    String mensajeRecibido;

    public void initServidor(){

        Scanner teclado = new Scanner(System.in);
        try{
            sc = new ServerSocket(PUERTO);
            so = new Socket();
            
            System.out.println("Esperando conexión...");
            so = sc.accept();
            System.out.println("Se conecto uno...");
            entrada = new DataInputStream(so.getInputStream());
            salida = new DataOutputStream(so.getOutputStream());
            String msn = "";
            while(!msn.equals("x")){
                
                mensajeRecibido = entrada.readUTF();//Leemos respuesta

                //Declaraciones de los analizadores léxicos y sintácticos
                L_Analyzer l_analyzer = new L_Analyzer(new BufferedReader(new StringReader(mensajeRecibido)));
                S_Analyzer s_analyzer = new S_Analyzer(l_analyzer);
                try {
                    s_analyzer.parse();
                } catch (Exception e) {
                    System.out.println("Error en el análisis sintáctico");
                }
                // Fin de las declaraciones de los analizadores léxicos y sintácticos

                System.out.println(mensajeRecibido);

                System.out.println("Escriba un msn para enviar");
                msn = teclado.nextLine();
                salida.writeUTF(""+msn);//enviamos mensaje

            }
            sc.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args){
        Servidor o = new Servidor();
        o.initServidor();
    }

}
