package s2.uebung.u3;

import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie hoch soll der Baum werden: ");

        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) { // Height

            for (int k = height - i; k > 0; k--) { // Spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) { //Stars

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
