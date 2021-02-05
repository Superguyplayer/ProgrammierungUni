package uebung.u3;

import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie hoch soll der Baum werden: ");

        int height = scanner.nextInt();

        for ( int i = 1; i <= height; i++) {

            for (int k = height - i; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
