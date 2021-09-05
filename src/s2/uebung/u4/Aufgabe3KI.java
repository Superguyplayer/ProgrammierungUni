package s2.uebung.u4;

public class Aufgabe3KI {

    // Ausgeben der Matrix in der Console
    public static void output(java.awt.Point player, java.awt.Point door, java.awt.Point money, java.awt.Point enemy) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                if (player.y == i && player.x == j) {
                    System.out.print(" P ");
                } else if (door.y == i && door.x == j) {
                    System.out.print(" D ");
                } else if (money.y == i && money.x == j) {
                    System.out.print(" $ ");
                } else if (enemy.y == i && enemy.x == j) {
                    System.out.print(" G ");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    // Gegner wird bewegt
    public static int[] smartMove(int x, int y, boolean firstmove, double distanceBefore, double distanceAfter, int dirX, int dirY) {
        // 0 = left (x-1) /up (y-1) , 1 = right (x+1) /down (y+1)
        // Gilt nur f�r ersten Zug (boolean firstmove = true)
        int xRnd = (int) (Math.random() * 2);
        int yRnd = (int) (Math.random() * 2);


        // Beim ersten Spielerzug
        if (firstmove) {
            // Wenn x-Richtung = 0 (also links)
            if (xRnd == 0) {
                dirX = 0;
                // Wenn Spieler mind. auf Feld 2 steht, also nicht direkt am Rand
                if (x > 1) {
                    x -= 1;
                } else {
                    // Wenn Spieler direkt (links) am Rand steht, geht er einen Schritt vom Rand weg
                    x += 1;
                }
            } else {
                dirX = 1;
                if (x < 10) {
                    x += 1;
                } else {
                    x -= 1;
                }
            }

            // Das Gleiche f�r die y-Richtung
            if (yRnd == 0) {
                dirY = 0;
                if (y > 1) {
                    y -= 1;
                } else {
                    y += 1;
                }
            } else {
                dirY = 1;
                if (y < 10) {
                    y += 1;
                } else {
                    y -= 1;
                }
            }
        }

        // Ab dem 2. Zug des Gegners (firstmove = false)
        if (!firstmove) {
            // Hat sich der Abstand zum Geld vergr��ert?
            // Wenn ja: drehe um, wenn nein: weiter in die Richtung
            // z. B.: wenn Richtung x = 0 (links) UND Abstand vor Zug < Abstand nach Zug -> drehe um (x = 1)

            int rand = (int) (Math.random() * 5);
            if ((distanceBefore != distanceAfter) && (rand != 1)) {
                if (dirX == 0 && (distanceBefore < distanceAfter)) {
                    dirX = 1;


                } else if (dirX == 1 && (distanceBefore < distanceAfter)) {
                    dirX = 0;

                }

                if (dirY == 0 && (distanceBefore < distanceAfter)) {
                    dirY = 1;


                } else if (dirY == 1 && (distanceBefore < distanceAfter)) {
                    dirY = 0;

                }
            } else {
                switch (yRnd) {
                    case 0 -> {
                        dirX = xRnd;
                        dirY = -1;
                    }
                    case 1-> {
                        dirY = xRnd;
                        dirX = -1;
                    }
                }

            }

            switch (dirX) {
                case 0:
                    if (x > 1) {
                        x -= 1;
                    }
                    break;
                case 1:
                    if (x < 10) {
                        x += 1;
                    }
                    break;
            }

            switch (dirY) {
                case 0:
                    if (y > 1) {
                        y -= 1;
                    }
                    break;
                case 1:
                    if (y < 10) {
                        y += 1;
                    }
                    break;
            }

        }

        // Es wird als Array �bergeben: Neue X-Koordinate, Y-Koordinate, x-Richtung und y-Richtung
        return new int[]{x, y, dirX, dirY};
    }


    public static void main(String[] args) {
        // Spieler hat am Anfang kein Geld gessammelt und keine T�r erreicht
        boolean moneyCollect = false;
        boolean reachedDoor = false;
        boolean win = false;
        boolean lose = false;
        double newDistance = 0;
        boolean firstmove = true; // wird nach dem ersten Durchlauf auf false gesetzt
        int dirX = 1;
        int dirY = 1;

        // Player
        java.awt.Point player = new java.awt.Point(1, 1);

        // Koordinaten f�r Gegenspieler
        int enemyXPos = (int) (Math.random() * 9) + 2;
        int enemyYPos = (int) (Math.random() * 9) + 2;
        java.awt.Point enemy = new java.awt.Point();

        // Koordinaten f�r T�r
        int doorXPos = (int) (Math.random() * 9) + 2;
        int doorYPos = (int) (Math.random() * 9) + 2;
        java.awt.Point door = new java.awt.Point(doorXPos, doorYPos);

        // Koordinaten f�r Geld
        int moneyX = (int) (Math.random() * 9) + 2;
        int moneyY = (int) (Math.random() * 9) + 2;
        java.awt.Point money = new java.awt.Point(moneyX, moneyY);

        // Wenn T�r und Geld auf gleichem Feld liegen, erh�lt Geld neues Feld (reimt sich)
        if (money.equals(door)) {
            money.x = (int) (Math.random() * 9) + 2;
            money.y = (int) (Math.random() * 9) + 2;
        }

        // Wenn Gegenspieler auf gleichem Feld wie T�r / Geld landen w�rde ...
        if (!enemy.equals(door)) {
            if (!enemy.equals(money)) {
                enemy.x = enemyXPos;
                enemy.y = enemyYPos;
            } else {
                // Neue Spieler-Position, wenn Gegner auf gleichem Feld wie Geld ist
                int enemyNewX = (int) (Math.random() * 9) + 2;
                int enemyNewY = (int) (Math.random() * 9) + 2;
                enemy.x = enemyNewX;
                enemy.y = enemyNewY;
            }
        } else {
            // Neue Spieler-POsition, wenn Gegner auf gleichem Feld wie T�r ist
            int enemyNewX = (int) (Math.random() * 9) + 2;
            int enemyNewY = (int) (Math.random() * 9) + 2;
            enemy.x = enemyNewX;
            enemy.y = enemyNewY;
        }

        // Spielfeld wird ausgegeben
        output(player, door, money, enemy);

        // Aktuelle Entfernung wird berechnet
        newDistance = enemy.distance(money);

        // Entfernung vor Zug wird initiiert und auf 0 gesetzt
        double prevDistance = 0;


        // Interaktiver Programmteil startet hier
        do {
            // Die aktuelle Entfernung des Gegners wird errechnet
            newDistance = enemy.distance(money);


            /////// dienen nur zum Testen ///////////////////////////////////////
            // auskommentieren, wenn es nicht gebraucht wird ////////////////////
            System.out.println("\n" + prevDistance + " | " + newDistance);
            System.out.println((prevDistance <= newDistance));
            /////// dienen nur zum Testen ///////////////////////////////////////


            // Gegner wird bewegt
            int[] newPos = smartMove(enemy.x, enemy.y, firstmove, prevDistance, newDistance, dirX, dirY);
            enemy.x = newPos[0]; // neue X-Koordinate aus Methode smartMove
            enemy.y = newPos[1]; // neue X-Koordinate aus Methode smartMove

            // x- und y-Richtung werden bei Aufruf von smartMove() �bergeben, um festzuhalten,
            // in welche Richtung der Spieler beim letzten Zug gelaufen ist
            dirX = newPos[2];     // x-Richtung aus Methode smartMove
            dirY = newPos[3];     // y-Richtung aus Methode SmartMove

            // System.out.println(enemy.distance(money));

            // Distanz vor dem Zug wird hier gespeichert, damit sie beim neuen Schleifendurchlauf den alten Wert hat
            prevDistance = newDistance;


            // DIENT NUR ZUM TESTEN ///////////////////////////////////////
            System.out.println(dirX + " | " + dirY);
            // DIENT NUR ZUM TESTEN ///////////////////////////////////////


            // Wenn der Gegner das Geld erreicht
            if (enemy.equals(money)) {
                System.out.println("\nDer Gegner hat das Geld eingesammelt. Sie haben das Spiel verloren.");
                output(player, door, money, enemy);
                lose = true;
                break;
            }

            // Der Nutzer wird gefragt, wohin er gehen will (u, d, l, r)
            System.out.print("\nWohin wollen Sie gehen?\nDr�cken Sie u (rauf), l (links), r (rechts) oder d (runter): ");
            String userDir = new java.util.Scanner(System.in).nextLine();
            userDir = userDir.toUpperCase();

            // User-Eingabe wird ausgewertet
            // Wenn der Spieler am Spielfeld-Rand ist, geschieht nichts.
            switch (userDir) {
                case "U":
                    if (player.y > 1) {
                        player.y -= 1;
                    }
                    break;
                case "D":
                    if (player.y < 10) {
                        player.y += 1;
                    }
                    break;
                case "L":
                    if (player.x > 1) {
                        player.x -= 1;
                    }
                    break;
                case "R":
                    if (player.x < 10) {
                        player.x += 1;
                    }
                    break;
                default:
                    break;
            }

            // Aktuelles Spielfeld wird ausgegeben
            output(player, door, money, enemy);

            // Wenn der Spieler das Geld erreicht
            if (player.equals(money)) {
                moneyCollect = true;
                System.out.println("\nSie haben das Geld eingesammelt! Jetzt schnell zur T�r. Husch husch.");
                // Koordinaten werden auf 0 gesetzt, damit das Geld vom Spielplan verschwindet
                money.x = 0;
                money.y = 0;
            }

            // Wenn der Spieler die T�r erreicht
            if (player.equals(door)) {
                // Wenn der Spieler das Geld bereits eingesammelt hat
                if (moneyCollect) {
                    reachedDoor = true;
                    win = true;
                    System.out.println("\nSie haben das Geld gesammelt UND die T�r erreicht. Sie sind ein Held. Sie haben gewonnen.");
                    break;
                    // Wenn der Spieler das Geld noch nicht eingesammelt hat, aber die T�r erreicht ...
                } else {
                    System.out.println("\nSie haben die T�r erreicht, aber noch nicht das Geld eingesammelt.\nSo geht das Spiel nicht!");
                }
            }

            firstmove = false;
        } while (win == false || lose == false);
    }
}