package aufgabe1;

import java.util.Scanner;

public class Aufgabe_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // getting Input
        System.out.println("Bitte geben Sie Ihren Namen ein.");
        String name = scan.nextLine();
        System.out.println("Bitte geben Sie Ihr Alter ein.");
        int age = scan.nextInt();
        System.out.println("Bitte geben Sie Ihre Größe in Metern ein.");
        double height = scan.nextDouble();

        // Output
        System.out.println("Hallo " + name + "!\nSie sind " + age + " Jahre alt und " + height + "m groß.");
    }

}
