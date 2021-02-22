package vorlesung.v5;

import java.util.Scanner;

public class Aufgabe_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wieviele Zahlen:");
        int lenght = scan.nextInt();

        int[] numbers = new int[lenght]; // array erstellen

        System.out.println("Zahlen eingeben und bestätigen:");

        for (int i = 0; i < lenght; i++) { // Zahlen eingeben
            System.out.println("Zahl " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int sum = 0;
        System.out.println("Dein Array: "); // Array ausgeben
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
            sum += numbers[i];

        }
        System.out.print(numbers[numbers.length - 1]);
        System.out.println();
        System.out.println("Summe: " + sum);

        float mittel = sum / (float) numbers.length;
        System.out.println("Mittelwert: " + (mittel));

    }
}
