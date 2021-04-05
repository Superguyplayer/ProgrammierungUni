package vorlesung;

import java.util.Scanner;

public class Aufgabe_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quersumme von: ");
        String input = s.nextLine();

        System.out.println(digitSum(input));


    }

    private static int digitSum(String s) {
        char[] chars = s.toCharArray();

        int qSum = 0;

        for (char c:chars) {
            if(Character.isDigit(c)) {
                String st = String.valueOf(c);
                qSum += Integer.parseInt(st);
            }else{
                System.out.println("Bitte nur Zahlen eingeben");
                break;
            }
        }

        return qSum;
    }

    static int digitSum(long l) {
        char[] chars = String.valueOf(l).toCharArray();

        int qSum = 0;

        for (char c:chars) {
            if(Character.isDigit(c)) {
                String st = String.valueOf(c);
                qSum += Integer.parseInt(st);
            }else{
                System.out.println("Bitte nur Zahlen eingeben");
                break;
            }
        }

        return qSum;
    }
}
