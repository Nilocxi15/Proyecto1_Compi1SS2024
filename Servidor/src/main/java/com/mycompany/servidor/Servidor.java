package com.mycompany.servidor;

import analyzers.L_Analyzer_main;
import analyzers.S_Analyzer_main;
import filesManager.readFiles;
import models.login;
import models.user;

import java.net.*;
import java.io.*;

public class Servidor {

    public static void main(String[] args) {

        readFiles read = new readFiles();

        String response = null;

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

                L_Analyzer_main lexer_main = new L_Analyzer_main(new BufferedReader(new StringReader(mensaje)));
                S_Analyzer_main sintactic_main = new S_Analyzer_main(lexer_main);

                try {
                    sintactic_main.parse();

                    switch (sintactic_main.requestName) {
                        case "login":
                            read.clearUsers();
                            read.loadUsers();

                            for (user u : readFiles.usersList) {
                                String formUser = S_Analyzer_main.loginList.getFirst().getUsername();
                                String formPass = S_Analyzer_main.loginList.getFirst().getPassword();
                                String dbUser = u.getUserName();
                                String dbPass = u.getPassword();

                                if (formUser.equals(dbUser) && formPass.equals(dbPass)) {
                                    response = "<?xson version=\"1.0\" ?>\n";
                                    response += "<!envio_respuesta: \"LOGIN_USUARIO\" >\n";
                                    response += "{ \"RESPUESTA\":[{\n";
                                    response += "\"STATUS\": \"Ok\", \n";
                                    response += "\"USUARIO\": \"" + u.getName() + "\"\n";
                                    response += "}]\n";
                                    response += "}\n";
                                    response += "<fin_envio_respuesta!>";
                                    break;
                                } else {
                                    response = "<?xson version=\"1.0\" ?>\n";
                                    response += "<!envio_respuesta: \"LOGIN_USUARIO\" >\n";
                                    response += "{ \"RESPUESTA\":[{\n";
                                    response += "\"STATUS\": \"Error\"\n";
                                    response += "}]\n";
                                    response += "}\n";
                                    response += "<fin_envio_respuesta!>";
                                }

                            }

                            break;
                        case "modificar":
                            System.out.println("Se solicita el analisis de MODIFICAR_USUARIO");
                            break;
                        case "eliminar":
                            System.out.println("Se solicita el analisis de ELIMINAR_USUARIO");
                            break;
                        case "nuevo":
                            boolean userExists = false;
                            read.clearUsers();
                            read.loadUsers();

                            String username = sintactic_main.userName;
                            String password = sintactic_main.password;
                            String name = sintactic_main.name;
                            String institution = sintactic_main.institution;
                            String date = sintactic_main.date;

                            for (user u : readFiles.usersList) {
                                if (u.getUserName().equals(username)) {
                                    userExists = true;
                                    break;
                                }
                            }

                            if (userExists) {
                                response = "<?xson version=\"1.0\" ?>\n";
                                response += "<!envio_respuesta: \"LOGIN_USUARIO\" >\n";
                                response += "{ \"RESPUESTA\":[{\n";
                                response += "\"STATUS\": \"Error\"\n";
                                response += "}]\n";
                                response += "}\n";
                                response += "<fin_envio_respuesta!>";
                            } else {
                                response = "<?xson version=\"1.0\" ?>\n";
                                response += "<!envio_respuesta: \"MODIFICAR_USUARIO\" >\n";
                                response += "{ \"RESPUESTA\":[{\n";
                                response += "\"STATUS\": \"Ok\",\n";
                                response += "\"USUARIO\": \"" + username + "\",\n";
                                response += "\"PASSWORD\": \"" + password + "\",\n";
                                response += "\"NOMBRE\": \"" + name + "\",\n";
                                response += "\"INSTITUCION\": \"" + institution + "\",\n";
                                response += "\"FECHA_CREACION\": \""+ date + "\"\n";
                                response += "}]\n";
                                response += "}\n";
                                response += "<fin_envio_respuesta!>";
                            }
                            break;
                        default:
                            System.out.println("No se reconoce la solicitud");
                            response = "<?xson version=\"1.0\" ?>\n";
                            response += "<!envio_respuesta: \"LOGIN_USUARIO\" >\n";
                            response += "{ \"RESPUESTA\":[{\n";
                            response += "\"STATUS\": \"Error\"\n";
                            response += "}]\n";
                            response += "}\n";
                            response += "<fin_envio_respuesta!>";
                            break;
                    }

                } catch (Exception e) {

                }

                //System.out.println(mensaje);

                out.writeUTF(response);

                sc.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException e) {
            System.out.println("Error: no se pudo iniciar el servidor");
        }
    }

}
