package vorlesung.v3;

import java.util.Scanner;

public class Aufgabe_5 {
    public static void main(String[] args) {
        int laufzeit;
        double zinsSatz, kapital;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kapital in €: ");
        kapital = scan.nextDouble();
        System.out.print("Zinssatz in Prozent: ");
        zinsSatz = scan.nextDouble();
        System.out.print("Laufzeit in Jahren: ");
        laufzeit = scan.nextInt();

        scan.close();


        for (int i = 1; i <= laufzeit; i++) {
            kapital = Math.round(kapital * (zinsSatz / 100 + 1) * 100);
            kapital = kapital / 100;
            System.out.println("Ihr Kapital im Jahr " + i + " beträgt " + kapital + "€");

        }





    }

}
