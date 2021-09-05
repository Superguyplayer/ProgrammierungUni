package s2.vorlesung;

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


        System.out.println("Dein Array: "); // Array ausgeben

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");

        }
        System.out.print(numbers[numbers.length - 1]); // letzte Zahl ausgeben

        System.out.println();

        System.out.println("Mittelwert: " + average(numbers));


    }

    private static float average(int... numbers) {

        int sum = 0;
        for (int i:numbers) {
            sum += i;
        }

        return sum / (float) numbers.length;
    }
}
