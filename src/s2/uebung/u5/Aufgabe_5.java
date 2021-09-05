package s2.uebung.u5;

import java.util.Scanner;

public class Aufgabe_5 {


    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //  I/O
        System.out.print("Wort:");
        String word = s.nextLine();
        System.out.print("Schlüssel:");
        System.out.println(encryptDecrypt(word, s.nextInt()));
    }

    private static String encryptDecrypt(String word, int offset) {
        StringBuilder builder = new StringBuilder();

        for(char c: word.toLowerCase().toCharArray()) { // jeden Buchstaben durch-switchen
            builder.append(shiftChar(c, offset));
        }
        return builder.toString();
    }



    private static char shiftChar(char abc, int offset) {

        if(abc == ' ') {
            return ' ';
        }

        if(alphabet.indexOf(abc) + offset > alphabet.length() - 1) {// nach oben
            return alphabet.charAt(alphabet.indexOf(abc) + offset - alphabet.length());

        }

        if(alphabet.indexOf(abc) + offset < 0) {// nach unten

            return alphabet.charAt(alphabet.indexOf(abc) + offset + alphabet.length());

        }

        // normal
        return alphabet.charAt(alphabet.indexOf(abc) + offset);

    }

}
