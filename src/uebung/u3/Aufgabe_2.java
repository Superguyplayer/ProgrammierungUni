package uebung.u3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aufgabe_2 {
    public static void main(String[] args) {

        float start, decrement, end, sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Startwert: ");
        start = s.nextFloat();
        System.out.print("Endwert: ");
        end = s.nextFloat();
        System.out.print("Schrittweite: ");
        decrement = s.nextFloat();


        float steps = ((start-end) / decrement) + 1;


        for (; start >= end ; start -= decrement) {
            System.out.print(start + " ");
            sum += start;
        }
        System.out.println("\nSumme: " + sum);
        System.out.println("Mittelwert: " + sum / steps);
    }
}
