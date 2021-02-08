package uebung.u3;

import java.util.Scanner;

public class Aufgabe_3 {
    public static void main(String[] args) {
        boolean online = true;
        Scanner s = new Scanner(System.in);
        while (online) {

            System.out.print("Geben Sie Ihre Zahl ein: ");
            float number = s.nextFloat();
            System.out.print(number + ", ");

            while (number / 2 > 0.001) {

                System.out.print((number = number / 2) + ", ");

            }

            System.out.println("\nWenn Sie von vorne beginnen möchten bestätigen sie mit y, ansonsten geben Sie n ein.");
            if (!s.next().equals("y")) {
                online = false;
            }

        }

        s.close();

    }
}
