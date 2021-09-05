package s2.selbststudium.mai;

import java.util.Scanner;

public class Aufgabe_2 {

    public static void main(String[] args) {

        int beginn = 0;

        Scanner s = new Scanner(System.in);

        do {

            System.out.println("Welche Zahlenreihe soll ausgegeben werden?");
            beginn = s.nextInt();

        }while(!(beginn <= 10 && beginn > 0));

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * beginn);
        }

    }

}
