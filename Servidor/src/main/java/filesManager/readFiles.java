package filesManager;

import analyzers.L_Analyzer_Users;
import analyzers.L_Analyzer_trivias;
import analyzers.S_Analyzer_Users;
import analyzers.S_Analyzer_trivias;
import models.Component;
import models.Trivia;
import models.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class readFiles {

    public static LinkedList<User> usersList = new LinkedList<>();
    public static LinkedList<Trivia> triviaList = new LinkedList<>();

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

    public void clearUsers() {
        usersList.clear();
    }

    public void loadTrivias() {

        try {
            L_Analyzer_trivias lexer = new L_Analyzer_trivias(new BufferedReader(new FileReader("../TRIVIAS.txt")));
            S_Analyzer_trivias sintactic = new S_Analyzer_trivias(lexer);

            try {
                sintactic.parse();
            } catch (Exception e) {
                System.out.println("Error parser: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error no entra al parser: " + e.getMessage());
        }

        for (Trivia trivia : triviaList) {
            System.out.println("IDTrivia: " + trivia.getIdTrivia());
            System.out.println("Name: " + trivia.getName());
            System.out.println("Topic: " + trivia.getTopic());
            System.out.println("Time: " + trivia.getTime());
            System.out.println("Creation User: " + trivia.getCreationUser());
            System.out.println("Components List: " + trivia.getComponentsList());
        }

        for (Trivia trivia : readFiles.triviaList) {
    for (Component component : trivia.getComponentsList()) {
        switch (component.getComponentClass()) {
            case "CAMPO_TEXTO":
                // Lógica para CAMPO_TEXTO
                System.out.println("Component Class: CAMPO_TEXTO");
                break;
            case "AREA_TEXTO":
                // Lógica para AREA_TEXTO
                System.out.println("Component Class: AREA_TEXTO");
                break;
            // Agrega más casos según sea necesario
            default:
                System.out.println("Component Class: " + component.getComponentClass());
                break;
        }
    }
}


    }

    public void clearTrivias() {
        triviaList.clear();
    }

}
