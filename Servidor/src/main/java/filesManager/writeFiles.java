package filesManager;

import analyzers.S_Analyzer_main;
import models.newUser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class writeFiles {

    public void writeNewUsers() throws IOException {
        System.out.println("Writing to file");
        for (newUser u : S_Analyzer_main.newUserList) {
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
}
