package vorlesung.v5;

import java.util.Scanner;

public class Aufgabe_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quersumme von: ");
        String input = s.nextLine();

        char[] chars = input.toCharArray();

        int qSum = 0;
        for (char c:chars) {
            String st = String.valueOf(c);
            qSum += Integer.parseInt(st);
        }

        System.out.println(qSum);


    }
}
