package uebung.u4;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Bitte geben Sie die erste Zahl ein:");
            int x = scan.nextInt();
            System.out.print("Bite geben Sie die zweite Zahl ein:");
            int y = scan.nextInt();

            System.out.println(ggT(x, y));

            System.out.println("Möchten sie erneut einen ggT berechnen?(y/n)");
            if (scan.next().equalsIgnoreCase("n")) {
                break;
            }

        }

        System.out.println("Programm beendet.");
        scan.close();

    }

    private static int ggT(int a, int b) {
        if (b < a) {
            if (b == 0) {
                return a;
            } else {
                return ggT(b, a % b);
            }
        } else {
            if (a == 0 || a == b) {
                return b;
            } else {
                return ggT(a, b % a);
            }

        }
    }

}
