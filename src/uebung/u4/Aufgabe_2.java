package uebung.u4;

import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Bitte geben Sie eine Zahl ein:");
            int x = scan.nextInt();


            System.out.println(isPrime(x));

            System.out.println("Möchten sie erneut eine Zahl überprüfen?(y/n)");
            if (scan.next().equalsIgnoreCase("n")) {
                break;
            }

        }

        System.out.println("Programm beendet.");
        scan.close();
    }

    private static boolean isPrime(int p) {
        return isPrime(p, p - 1);

    }

    private static boolean isPrime(int p, int z) {
        if(z == 1) {
            return true;
        }
        if(p % z == 0) {
            return false;
        }
        return isPrime(p, z - 1);
    }
}
