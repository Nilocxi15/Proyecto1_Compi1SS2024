package filesManager;

import analyzers.L_Analyzer_Users;
import analyzers.S_Analyzer_Users;
import models.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class readFiles {

    public static LinkedList<user> usersList = new LinkedList<user>();

    public void loadUsers() {
        FileReader file;
        BufferedReader reader;
        StringBuilder content = new StringBuilder();

        try {
            L_Analyzer_Users lexer = new L_Analyzer_Users(new BufferedReader(new FileReader("../USUARIOS.txt")));
            S_Analyzer_Users sintactic = new S_Analyzer_Users(lexer);

            try {
                sintactic.parse();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printUsersList() {
        if (usersList.isEmpty()) {
            System.out.println("La lista de usuarios está vacía.");
        } else {
            for (user u : usersList) {
                System.out.println("Usuario: " + u.getUserName());
                System.out.println("Contraseña: " + u.getPassword());
                System.out.println("Nombre: " + u.getName());
                System.out.println("Institución: " + u.getInstitution());
                System.out.println("-------------------------");
            }
        }
    }
}
