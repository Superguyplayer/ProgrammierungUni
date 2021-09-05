package s2.uebung.u5;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Input/Output
        System.out.print("Geben Sie das zuprüfende Wort ein: ");
        if(isPalindrom(s.nextLine())) {
            System.out.println("Das Wort ist ein Palindrom.");
        }else{
            System.out.println("Das Wort ist kein Palindrom.");
        }
    }

    private static boolean isPalindrom(String word) {


        StringBuilder turned = new StringBuilder();

        turned.append(word);
        turned.reverse();


        return turned.toString().equalsIgnoreCase(word); // boolean zurückgeben, ob wörter identisch
    }

}
