package aufgabe1;

import java.util.Scanner;

public class Aufgabe_1 {

    public static void main(String[] args) {
        String name;
        int age;
        double height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Namen ein.");
        name = scan.nextLine();
        System.out.println("Bitte geben Sie Ihr Alter ein.");
        age = scan.nextInt();
        System.out.println("Bitte geben Sie Ihre Größe in Metern ein.");
        height = scan.nextDouble();

        System.out.println("Hallo " + name + "!\tSie sind " + age + " Jahre alt und " + height + "m groß.");
    }

}
