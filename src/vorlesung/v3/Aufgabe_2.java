package vorlesung.v3;

import java.util.Scanner;

public class Aufgabe_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 5 + 1);

        System.out.println(randomNumber);

        System.out.print("Bitte gib deine geratene Zahl zwischen 1 und 5 ein: ");

        if(scan.nextInt() == randomNumber) {
            System.out.println("Super! Das war richtig!");
        }

        System.out.println("Das Programm wird nun beendet. Bitte starte es neu, um erneut zu raten.");

    }

}
