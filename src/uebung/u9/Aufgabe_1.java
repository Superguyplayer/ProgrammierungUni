package uebung.u9;


import java.math.BigInteger;
import java.util.Scanner;

public class Aufgabe_1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Zahl eingeben: ");

        String input = s.nextLine();

        System.out.println("Zahlensystem eingeben: ");

        int numberFormat = s.nextInt();

        try {
            BigInteger b1 = new BigInteger(input, numberFormat);


        System.out.println("Decimal: " + b1.toString(10));

        System.out.println("Binary: " + b1.toString(2));

        System.out.println("Tertiär: " + b1.toString(3));

        System.out.println("Oktal: " + b1.toString(8));

        System.out.println("Hexa: " + b1.toString(16));


        }catch (NumberFormatException exception) {
            System.out.println("Die eingegebene Zahl muss in das gewünschte Zahlensystem passen!");
        }

    }

}
