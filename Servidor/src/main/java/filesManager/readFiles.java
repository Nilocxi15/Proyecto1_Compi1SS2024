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

}
