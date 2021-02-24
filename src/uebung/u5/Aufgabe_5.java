package uebung.u5;

import java.util.Scanner;

public class Aufgabe_5 {


    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //I/O
        System.out.print("Wort:");
        String word = s.nextLine();
        System.out.print("Schlüssel:");
        System.out.println(encryptDecrypt(word, s.nextInt()));
    }

    private static String encryptDecrypt(String word, int offset) {
        StringBuilder builder = new StringBuilder();

        for(char c: word.toLowerCase().toCharArray()) { // jeden Buschstaben durchswitchen
            builder.append(shiftChar(c, offset));
        }
        return builder.toString();
    }



    private static char shiftChar(char abc, int offset) {

        if(alphabet.indexOf(abc) + offset > 25) {// nach oben
            return alphabet.charAt(alphabet.indexOf(abc) + offset - 26);

        }else if(alphabet.indexOf(abc) + offset < 0) {// nach unten

            return alphabet.charAt(alphabet.indexOf(abc) + offset + 26);

        }else{ // normal
            return alphabet.charAt(alphabet.indexOf(abc) + offset);
        }
    }

}
