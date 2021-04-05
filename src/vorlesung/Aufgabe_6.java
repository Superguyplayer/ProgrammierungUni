package vorlesung;

import java.util.Scanner;

public class Aufgabe_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            System.out.println("es geht los");

            int randomNumber = (int)(Math.random() * 100 + 1);
            int guessedNumber;

            for (int i = 10; i > 0; i--) {
                System.out.print("Geben sie Ihre Zahl zwischen 1 und 100 ein: ");
                guessedNumber = scan.nextInt();

                if(guessedNumber == randomNumber) {
                    System.out.println("Super! Das war richtig!");
                    break;

                }else if(guessedNumber < randomNumber) {
                    System.out.println("Die zu erratene Zahl ist größer");
                }else {
                    System.out.println("Die zu erratene Zahl ist kleiner");
                }
                 if(i == 1) {
                     System.out.println("Leider haben sie keine Versuche mehr...");
                 }

            }



    }
}
