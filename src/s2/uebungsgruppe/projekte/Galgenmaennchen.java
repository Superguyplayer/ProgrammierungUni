package s2.uebungsgruppe.projekte;

import java.util.Scanner;

public class Galgenmaennchen {

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        Scanner s = new Scanner(System.in);
        String searched;
        boolean won = false;
        int guessCount = 0;
        StringBuilder builder = new StringBuilder();
        System.out.println("Zu erratendes Wort eingeben:");
        searched = s.nextLine().toLowerCase();
        char[] searchedArray = searched.toCharArray();

        for (char c : searchedArray) {
            builder.append('-');
        }

        while (!won && guessCount < (builder.length() * 2)) {
            System.out.println(builder.toString());
            System.out.println("Buchstaben eingeben: ");

            char g = s.next().charAt(0);
            boolean right = false;

            for (int i = 0; i < searchedArray.length; i++) {
                if (searchedArray[i] == g) {
                    builder.replace(i, i + 1, String.valueOf(g));
                    right = true;
                }
            }
            if(right) {
                System.out.println("richtig");
            }else{
                System.out.println("falsch");
            }
            if(builder.toString().equalsIgnoreCase(searched)) {
                won = true;
            }
            guessCount++;
            System.out.printf("Du hast %d Versuche übrig.", builder.length()  * 2 - guessCount);
            System.out.println();
        }

        if(won) {
            System.out.println("gewonnen");
        }else{
            System.out.println("verloren");
        }


    }


}
