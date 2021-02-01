package vorlesung.v3;

import java.util.Scanner;

public class Aufgabe_4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben sie Ihr Alter ein: ");
        int age = scanner.nextInt();

        switch (age) {
            case 18 -> System.out.println("Sie sind volljährig");
            case 16 -> System.out.println("Du darfst Mofa fahren");
            default -> System.out.println("Das ist kein besonderes Alter");
        }
    }
}
