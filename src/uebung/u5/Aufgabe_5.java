package uebung.u5;

import java.util.Scanner;

public class Aufgabe_5 {


    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wort:");
        String word = s.nextLine();
        System.out.print("Schlüssel:");
        System.out.println(encryptDecrypt(word, s.nextInt()));
    }

    private static String encryptDecrypt(String word, int offset) {
        StringBuilder builder = new StringBuilder();
        for(char c: word.toLowerCase().toCharArray()) {
            builder.append(shiftChar(c, offset));
        }
        return builder.toString();
    }



    private static char shiftChar(char abc, int offset) {
        if(alphabet.indexOf(abc) + offset > 25) {
            return alphabet.charAt(alphabet.indexOf(abc) + offset - 25);

        }else if(alphabet.indexOf(abc) + offset < 0) {

            return alphabet.charAt(alphabet.indexOf(abc) + offset + 25);

        }else{
            return alphabet.charAt(alphabet.indexOf(abc) + offset);
        }
    }

}
