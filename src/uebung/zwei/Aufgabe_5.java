package uebung.zwei;

import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {
        int laufzeit;
        double zinsSatz, kapital, endKapital;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kapital in €: ");
        kapital = scan.nextDouble();
        System.out.print("Zinssatz in Prozent: ");
        zinsSatz = scan.nextDouble();
        System.out.print("Laufzeit in Jahren: ");
        laufzeit = scan.nextInt();

        scan.close();

        endKapital = kapital + (zinsSatz * kapital / 100) * laufzeit;

        System.out.println("Ihr Endkapital beträgt: " + endKapital + "€");


    }
}
