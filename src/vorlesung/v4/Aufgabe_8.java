package vorlesung.v4;

import java.awt.*;
import java.util.Scanner;

public class Aufgabe_8 {

    public static void main(String[] args) {

        Point player = new Point();
        Point door = new Point();
        boolean won = false;
        Scanner s = new Scanner(System.in);

        //placing the player
        player.setLocation(1, 1);

        //placing the door
        door.setLocation((int) (Math.random() * 9 + 2), (int) (Math.random() * 9 + 2));

        //System.out.println(door.toString());

        for (int i = 0; i < 5; i++) { // 5 Moves

            //Infos
            System.out.println("Position: X:" + player.x + " Y:" + player.y);
            System.out.println("Distance to Door:" + player.distance(door));


            System.out.print("Movement in X or Y:");

            if (s.next().equalsIgnoreCase("x")) { // which direction
                System.out.println("How many: ");
                int x = s.nextInt(); // how many steps
                if ((player.x + x) <= 10) {          //check the bounds
                    if ((player.x + x) > 0) {
                        player.x += x;
                    } else {
                        player.x = 1;       //min
                    }
                } else {
                    player.x = 10;          //max
                }

            } else { // same for y
                System.out.println("How many: ");
                int y = s.nextInt();

                if ((player.y + y) <= 10) {
                    if ((player.y + y) > 0) {
                        player.y += y;
                    } else {
                        player.y = 1;
                    }
                } else {
                    player.y = 10;
                }
            }

            if (player.equals(door)) {  // success
                System.out.println("Won");
                won = true;
                break;
            }

        }

        if (!won) { // lost the game
            System.out.println("Out of moves! Door was at Pos: X:" + door.x + " Y:" + door.y);
        }

    }
}
