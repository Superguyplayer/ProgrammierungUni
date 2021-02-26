package uebung.u4;

import java.awt.*;
import java.util.Scanner;

public class Aufgabe_3 {

    //Colors
    static final String TEXT_RESET = "\u001B[0m";
    static final String TEXT_RED = "\u001B[31m";
    static final String TEXT_GREEN = "\u001B[32m";
    static final String TEXT_YELLOW = "\u001B[33m";
    static final String TEXT_BLUE = "\u001B[34m";

    static final int MOVES = 25;


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Points
        Point player = new Point();
        Point door = new Point();
        Point coin = new Point();
        Point opponent = new Point();

        //Win and Loose conditions
        boolean won = false, playerHasCoin = false, opponentWon = false;


        //placing the player
        player.setLocation(1, 1);

        //placing the door, the coin and the opponent randomly
        door.setLocation((int) (Math.random() * 9 + 2), (int) (Math.random() * 9 + 2));
        coin.setLocation((int) (Math.random() * 9 + 2), (int) (Math.random() * 9 + 2));
        opponent.setLocation((int) (Math.random() * 9 + 2), (int) (Math.random() * 9 + 2));

        System.out.println("Movement: up(u), down(d), right(r), left(l)\nYou've got " + MOVES + " Moves");
        visualize(player, opponent, coin, door); // showing first Time


        for (int i = 0; i < MOVES; i++) {

            System.out.println(TEXT_GREEN + "It's your Move!" + TEXT_RESET);
            //visualize(player, opponent, coin, door);
            System.out.println("Moves left: " + (MOVES - i));

            //moving the player
            String input = s.next();

            switch (input) { //moving the Player
                case "d" -> movePlayerR(player);
                case "a" -> movePlayerL(player);
                case "w" -> movePlayerUp(player);
                case "s" -> movePlayerDown(player);
            }

            //Move Opponenet in a random direction
            int rand = (int) (Math.random() * 8);
            switch (rand) {
                case 0 -> movePlayerDown(opponent);
                case 1 -> movePlayerUp(opponent);
                case 2 -> movePlayerR(opponent);
                case 3 -> movePlayerL(opponent);
                case 4 -> {
                    movePlayerL(opponent);
                    movePlayerUp(opponent);
                }
                case 5 -> {
                    movePlayerR(opponent);
                    movePlayerUp(opponent);
                }
                case 6 -> {
                    movePlayerR(opponent);
                    movePlayerDown(opponent);
                }
                case 7 -> {
                    movePlayerL(opponent);
                    movePlayerDown(opponent);
                }
            }

            System.out.println(TEXT_RED + "The Opponent moved!" + TEXT_RESET);
            visualize(player, opponent, coin, door);

            //found the coin?
            if (player.equals(coin)) {
                playerHasCoin = true;
                coin = null;
            }

            //stepped on the opponent?
            if (player.equals(opponent)) {
                opponentWon = true;
                break;
            }

            if (player.equals(door)) {
                if (playerHasCoin) {// success
                    System.out.println("Won");
                    won = true;
                    break;
                } else {
                    System.out.println(TEXT_RED + "You need to find the coin first!" + TEXT_RESET);
                }
            }


        }

        if (opponentWon) {
            System.out.println("You Lost...Your Opponent caught you!");
        }

        if (!won && !opponentWon) { // lost the game
            System.out.println("Out of moves! Door was at Pos: X:" + door.x + " Y:" + door.y);
        }

    }

    private static void visualize(Point player, Point opponent, Point coin, Point door) {
        System.out.print("\t");

        for (int k = 1; k <= 10; k++) { // Nummerierung
            System.out.print(k + "\t");
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) { // Zeilen
            System.out.print(i + "\t"); // Nummerierung

            for (int j = 1; j <= 10; j++) { // Spalten

                Point dummy = new Point(j, i);

                if (player.equals(dummy)) { //colorising the Objects of interest
                    System.out.print(TEXT_GREEN + "P\t" + TEXT_RESET);
                } else if (opponent.equals(dummy)) {
                    System.out.print(TEXT_RED + "G\t" + TEXT_RESET);
                } else if (coin != null && coin.equals(dummy)) { // only if the coin is still there
                    System.out.print(TEXT_YELLOW + "$\t" + TEXT_RESET);
                } else if (door.equals(dummy)) {
                    System.out.print(TEXT_BLUE + "D\t" + TEXT_RESET);
                } else {
                    System.out.print("x\t");
                }
            }
            System.out.println();
        }
    }

    private static void movePlayerR(Point player) {
        if ((player.x + 1) <= 10) {          //check the bounds
            player.x += 1;
        } else {
            System.out.println(TEXT_RED + "You can't go outside of the Matrix" + TEXT_RESET);
        }

    }

    private static void movePlayerL(Point player) {
        if ((player.x - 1) >= 1) {          //check the bounds
            player.x -= 1;
        } else {
            System.out.println(TEXT_RED + "You can't go outside of the Matrix" + TEXT_RESET);
        }

    }

    private static void movePlayerUp(Point player) {
        if ((player.y - 1) >= 1) {          //check the bounds
            player.y -= 1;
        } else {
            System.out.println(TEXT_RED + "You can't go outside of the Matrix" + TEXT_RESET);
        }

    }

    private static void movePlayerDown(Point player) {
        if ((player.y + 1) <= 10) {          //check the bounds
            player.y += 1;
        } else {
            System.out.println(TEXT_RED + "You can't go outside of the Matrix" + TEXT_RESET);
        }

    }

}
