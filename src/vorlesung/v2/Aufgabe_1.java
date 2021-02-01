package vorlesung.v2;

import java.util.Scanner;

public class Aufgabe_1 {

    public static void main(String[] args) {

        String name;
        int age;
        double height;
        Scanner scan = new Scanner(System.in);


        // getting Input
        System.out.print("Bitte geben Sie Ihren Namen ein:");
        name = scan.nextLine();
        System.out.print("Bitte geben Sie Ihr Alter ein:");
        age = scan.nextInt();
        System.out.print("Bitte geben Sie Ihre Größe in Metern ein:");
        height = scan.nextDouble();
        scan.close();


        // Output
        System.out.println("Hallo " + name + "!\nSie sind " + age + " Jahre alt und " + height + "m groß.");
    }

}
