package vorlesung;

import java.util.Scanner;

public class Aufgabe_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 5 + 1);

        System.out.println(randomNumber);

        System.out.print("Bitte gib deine geratene Zahl zwischen 1 und 5 ein: ");

        int input = scan.nextInt();

        if(input == randomNumber) {
            System.out.println("Super! Das war richtig!");
        }else if(input < randomNumber) {
            System.out.println("Die zu erratene Zahl ist größer");
        }else {
            System.out.println("Die zu erratene Zahl ist kleiner");
        }

        System.out.println("Das Programm wird nun beendet. Bitte starte es neu, um erneut zu raten.");

    }

}
