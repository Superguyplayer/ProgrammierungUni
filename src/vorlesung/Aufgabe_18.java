package vorlesung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe_18 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben");
        try {
            System.out.println(sum(s.nextInt()));
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(InputMismatchException e) {
            System.out.println("Bitte geben Sie eine Zahl ein!");
        }
    }


    public static long sum(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Bitte eine Zahl größer als 0 eingeben!");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
