package uebung.u5;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geben Sie das zuprüfende Wort ein: ");
        if(isPalindrom(s.nextLine())) {
            System.out.println("Das Wort ist ein Palindrom");
        }else{
            System.out.println("Das Wort ist kein Palindrom");
        }
    }

    private static boolean isPalindrom(String word) {


        StringBuilder turned= new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            turned.append(word.charAt(i));
        }

        return turned.toString().equalsIgnoreCase(word);
    }

}
