package vorlesung.v3;

import java.util.Scanner;

public class Aufgabe_4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihr Gehalt ein: ");
        double steuer, gehalt = scanner.nextDouble();


        if(gehalt <= 12000) {
            steuer = gehalt * 0.12;

        }else if(gehalt <= 20000){
            steuer = gehalt * 0.15;

        }else if(gehalt <= 30000) {
            steuer = gehalt * 0.2;

        }else{
            steuer = gehalt * 0.25;
        }

        System.out.println("Steuern: " + steuer + "€");


    }
}
