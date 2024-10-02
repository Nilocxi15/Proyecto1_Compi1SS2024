package filesManager;

import analyzers.S_Analyzer_main;
import models.NewUser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class writeFiles {

    public void writeNewUsers() throws IOException {
        System.out.println("Writing to file");
        for (NewUser u : S_Analyzer_main.newUserList) {
            List<String> lines = Files.readAllLines(Paths.get("D:/Documentos/DocumentosUSAC/Compi1/Proyecto1/USUARIOS.txt"));
            lines.remove(lines.size() - 1);
            lines.remove(lines.size() - 1);
            lines.add("\t},");
            lines.add(u.toString());
            lines.add(")");
            Files.write(Paths.get("D:/Documentos/DocumentosUSAC/Compi1/Proyecto1/USUARIOS.txt"), lines);
        }
        System.out.println("Written to file");
    }

    public void deleteUsers(String username) throws IOException {
        System.out.println("Deleting users: " + username);
        List<String> lines = Files.readAllLines(Paths.get("D:/Documentos/DocumentosUSAC/Compi1/Proyecto1/USUARIOS.txt"));
        List<String> updatedLines = new ArrayList<>();

        boolean skipBlock = false;
        boolean isBlock = false;

        for (String line: lines) {
            if (line.trim().equals("{")) {
                isBlock = true;
            }

            if (line.contains("\"USUARIO\": \"" + username + "\"") && isBlock) {
                skipBlock = true;
                if (!updatedLines.isEmpty()) {
                    updatedLines.removeLast();
                }
            }

            if (!skipBlock) {
                updatedLines.add(line);
            }

            if (skipBlock && line.trim().equals("},")) {
                skipBlock = false;
                isBlock = false;
            }
        }

        Files.write(Paths.get("D:/Documentos/DocumentosUSAC/Compi1/Proyecto1/USUARIOS.txt"), updatedLines,
                StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

    }
}
