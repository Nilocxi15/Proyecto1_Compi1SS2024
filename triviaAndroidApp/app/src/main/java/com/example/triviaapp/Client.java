package com.example.triviaapp;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.Socket;

import analyzers.L_Analyzer_login;
import analyzers.S_Analyzer_login;

public class Client {
    DataInputStream in;
    DataOutputStream out;

    private static boolean status;

    public void sendMessage(String message, SendMessageCallback callback) {
        new SendMessageTask(callback).execute(message);
    }

    private class SendMessageTask extends AsyncTask<String, Void, String> {
        private SendMessageCallback callback;

        public SendMessageTask(SendMessageCallback callback) {
            this.callback = callback;
        }

        @Override
        protected String doInBackground(String... params) {
            final String HOST = "192.168.0.15";
            final int PUERTO = 5000;
            String response = "";
            String status = "";

            try {
                Socket sc = new Socket(HOST, PUERTO);

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                out.writeUTF(params[0]); // Enviamos un mensaje al servidor
                response = in.readUTF(); // Leemos la respuesta

                L_Analyzer_login lexer = new L_Analyzer_login(new BufferedReader(new StringReader(response)));
                S_Analyzer_login parser = new S_Analyzer_login(lexer);

                try {
                    parser.parse();
                    if (S_Analyzer_login.status) {
                        status = "true";
                    } else {
                        status = "false";
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    status = "false";
                }

                sc.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            return status;
        }

        @Override
        protected void onPostExecute(String result) {
            if (callback != null) {
                callback.onResult(result);
            }
        }
    }

    public interface SendMessageCallback {
        void onResult(String result);
    }
}