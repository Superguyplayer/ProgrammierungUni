package uebung.u5;

import java.util.Random;

public class Aufgabe_2 {
    public static void main(String[] args) {

        drawField(createField());

    }

    private static int[][] createField() {
        int[][] field = new int[10][10];

        for (int[] row :field) { // array mit nullen auffüllen
            for(int coloumn:row) {
                coloumn = 0;
            }
        }

        Random rand = new Random();

        for (int i = 0; i < 3; i++) { // drei zufällige einsen setzen
            field[rand.nextInt(10)][rand.nextInt(10)] = 1;

        }
        return field;
    }

    private static void drawField(int[][] field) {

        for(int[] row: field) { // malen
            for (int coloumn : row) {
                System.out.print("|");
                System.out.print(coloumn);
            }
            System.out.println("|");
        }

    }
}
