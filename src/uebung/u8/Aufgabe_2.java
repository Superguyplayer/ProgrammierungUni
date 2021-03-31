package uebung.u8;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Aufgabe_2 {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\perhe\\IdeaProjects\\ProgrammmierungUni\\src\\uebung\\u8\\a1.txt";
        List<String> lines = Files.readAllLines(Paths.get(filename));

        String longest = "";

        for(String s: lines) {
            if(s.length() > longest.length()) {
                longest = s;
            }
        }

        System.out.println(longest);

    }
}
