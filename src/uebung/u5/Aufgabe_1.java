package uebung.u5;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {

       int[] arr1 = threeNumbers();
       int[] arr2 = threeNumbers();

       int skalar = 0;
        for (int i = 0; i < arr1.length; i++) {
            skalar += arr1[i] * arr2[i];
        }
        System.out.println(skalar);

    }

    private static int[] threeNumbers() {
        int[] arr = new int[3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Zahl: ");
            arr[i] = s.nextInt();
        }
        return arr;
    }

}
