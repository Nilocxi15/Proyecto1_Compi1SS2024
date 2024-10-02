package com.mycompany.servidor;

import analyzers.L_Analyzer_main;
import analyzers.S_Analyzer_main;
import filesManager.readFiles;
import filesManager.writeFiles;
import models.Modify;
import models.NewUser;
import models.Trivia;
import models.User;

import java.net.*;
import java.io.*;

public class Servidor {

    public static void main(String[] args) {

        readFiles read = new readFiles();
        writeFiles write = new writeFiles();

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

                            for (User u : readFiles.usersList) {
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
                            for (Modify m : S_Analyzer_main.modifyList) {
                                System.out.println("Old username: " + m.getOldUsername());
                                System.out.println("New username: " + m.getNewUsername());
                                System.out.println("New password: " + m.getNewPassword());
                                System.out.println("New institution: " + m.getInstitution());
                                System.out.println("Date: " + m.getDate());
                                write.editUser(m.getOldUsername(), m.getNewUsername(), m.getNewPassword(), m.getInstitution(), m.getDate());
                            }
                            response = "<?xson version=\"1.0\" ?>\n";
                            response += "<!envio_respuesta: \"MODIFICAR_USUARIO\" >\n";
                            response += "{ \"RESPUESTA\":[{\n";
                            response += "\"STATUS\": \"Ok\"\n";
                            response += "}]\n";
                            response += "}\n";
                            response += "<fin_envio_respuesta!>";
                            break;
                        case "eliminar":
                            System.out.println("Se solicita el analisis de ELIMINAR_USUARIO");
                            read.clearUsers();
                            for (String un : S_Analyzer_main.userToDelete) {
                                write.deleteUsers(un);
                            }

                            S_Analyzer_main.userToDelete.clear();
                            read.loadUsers();

                            response = "<?xson version=\"1.0\" ?>\n";
                            response += "<!envio_respuesta: \"ELIMINAR_USUARIO\" >\n";
                            response += "{ \"RESPUESTA\":[{\n";
                            response += "\"STATUS\": \"Ok\"\n";
                            response += "}]\n";
                            response += "}\n";
                            response += "<fin_envio_respuesta!>";
                            break;
                        case "nuevo":
                            boolean userExists = false;
                            read.clearUsers();
                            read.loadUsers();

                            for (NewUser u : S_Analyzer_main.newUserList) {
                                System.out.println("Username: " + u.getUsername());
                                System.out.println("Password: " + u.getPassword());
                                System.out.println("Name: " + u.getName());
                                System.out.println("Institution: " + u.getInstitution());
                                System.out.println("Date: " + u.getDate());

                                for (User ul : readFiles.usersList) {
                                    if (ul.getUserName().equals(u.getUsername())) {
                                        userExists = true;
                                        break;
                                    }
                                }

                                for (NewUser u2 : S_Analyzer_main.newUserList) {
                                    if(!u.equals(u2) && u.getUsername().equals(u2.getUsername())){
                                        System.out.println("Usuario repetido");
                                        userExists = true;
                                        break;
                                    }
                                }

                                if (userExists) {
                                    break;
                                }
                            }

                            if (!userExists) {
                                write.writeNewUsers();
                            }

                            if (userExists) {
                                response = "<?xson version=\"1.0\" ?>\n";
                                response += "<!envio_respuesta: \"USUARIO_NUEVO\" >\n";
                                response += "{ \"RESPUESTA\":[{\n";
                                response += "\"STATUS\": \"Error\"\n";
                                response += "}]\n";
                                response += "}\n";
                                response += "<fin_envio_respuesta!>";
                            } else {
                                response = "<?xson version=\"1.0\" ?>\n";
                                response += "<!envio_respuesta: \"USUARIO_NUEVO\" >\n";
                                response += "{ \"RESPUESTA\":[{\n";
                                response += "\"STATUS\": \"Ok\"\n";
                                response += "}]\n";
                                response += "}\n";
                                response += "<fin_envio_respuesta!>";
                            }

                            break;
                        case "nuevaTrivia":
                            System.out.println("Se solicita el analisis de NUEVA_TRIVIA");
                            response = "<?xson version=\"1.0\" ?>\n";
                            response += "<!envio_respuesta: \"NUEVA_TRIVIA\" >\n";
                            response += "{ \"RESPUESTA\":[{\n";
                            response += "\"STATUS\": \"Ok\"\n";
                            response += "}]\n";
                            response += "}\n";
                            response += "<fin_envio_respuesta!>";
                            break;
                        case "listaTrivias":
                            try {
                                read.clearTrivias();
                            } catch (Exception e) {
                                System.out.println("Error clearTrivias: " + e.getMessage());
                            }

                            read.loadTrivias();

                            System.out.println("Se solicita el analisis de LISTA_TRIVIAS");

                            response = "<?xson version=\"1.0\" ?>\n";
                            response += "<!envio_respuesta: \"LISTA_TRIVIAS\" >\n";
                            response += "{ \"RESPUESTA\":[\n";
                            for (Trivia t : readFiles.triviaList) {
                                response += "{\n";
                                response += "\"ID_TRIVIA\": \"" + t.getIdTrivia() + "\",\n";
                                response += "\"NOMBRE\": \"" + t.getName() + "\",\n";
                                response += "\"TEMA\": \"" + t.getTopic() + "\",\n";
                                response += "\"TIEMPO_PREGUNTA\": \"" + t.getTime() + "\",\n";
                                response += "\"USUARIO_CREACION\": \"" + t.getCreationUser() + "\"\n";
                                response += "},\n";
                            }
                            response += "]}\n";
                            response += "<fin_envio_respuesta!>";
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

                out.writeUTF(response);

                sc.close();
                System.out.println("Cliente desconectado");
                S_Analyzer_main.newUserList.clear();
            }

        } catch (IOException e) {
            System.out.println("Error: no se pudo iniciar el servidor");
            System.out.println(e.getMessage());
        }
    }

}
