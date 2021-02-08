package vorlesung.v4;

import java.util.Scanner;

public class Aufgabe_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl > 0 ein:");
        int input = s.nextInt();


        if (input < 0) {
            System.out.println("Die Zahl muss größer als 0 sein");
        } else {
            System.out.println(rekursiveSum(input));
        }

    }

    private static int iterativeSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;

    }

    private static int rekursiveSum(int n) {
        if(n == 0) {
        return 0;
        }
        return rekursiveSum(n - 1) + n;
    }


}
