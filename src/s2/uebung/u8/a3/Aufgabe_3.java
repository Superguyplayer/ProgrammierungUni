package s2.uebung.u8.a3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_3 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\perhe\\IdeaProjects\\ProgrammmierungUni\\src\\s2.uebung\\u8\\a3\\Numbers.txt";

        List<String> lines = Files.readAllLines(Paths.get(path));

        ArrayList<Double> numbers = new ArrayList<>();

        for(String s: lines) {
            try {
                numbers.add(Double.parseDouble(s));
            }catch(NumberFormatException e) {
                System.out.println(s);
            }
        }

        System.out.println();

        for (double d: numbers) {
            System.out.println(d);
        }

    }
}
