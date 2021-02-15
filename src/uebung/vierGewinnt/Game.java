package uebung.vierGewinnt;

public class Game {


    final char coinSpieler1 = 'X';
    final char coinSpieler2 = 'O';

    public final int sizeX = 7;
    public final int sizeY = 6;

    int[][] feld;

    int currentPlayer = 1;

    public Game() {
        feld = new int[sizeX][sizeY];
    }

    /*
     * Rückgabewerte:
     * 1 oder 2: Spielerstein wurde für Spieler 1/2 gesetzt
     * 0 konnte nicht gesetzt werden (schon voll)
     */
    public int setCoin(int spielerID, int slot) {
        /*
         * In dieser Methode soll in Abhängigkeit des aktuellen Stands
         * die Coins "von unten nach oben" aufgefüllt werden. Sofern in
         * der jeweiligen Spalte kein Platz mehr ist, soll eine 0 zurück-
         * gegeben werden. Andernfalls wird eine 1 für Spieler 1 oder 2 für
         * Spieler 2 zurückgegeben.
         */

        for (int i = 0; i < sizeY; i++) {
            if (feld[slot][i] == 0) {
                feld[slot][i] = spielerID;
                return spielerID;
            }
        }

        return 0;
    }

    /*
     * Rückgabe so wie setCoin(spielerID, slot), nur dass der Spieler
     * automatisch gewählt wird (Spieler 1 beginnt)
     */
    public int setCoin(int slot) {
        int r = setCoin(currentPlayer, slot);

        return r;
    }

    /*
     * 0: kein Gewinner
     * 1/2 Spieler 1/2 hat gewonnen
     */
    public int isWinner() {
        boolean won = false;
        int countX = 0;
        int countY = 0;
        int countDiaObenRechts = 0;
        int countDiaUntenRechts = 0;

        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {

                countX = countCells(x - 1, y, -1, 0, currentPlayer) + countCells(x + 1, y, 1, 0, currentPlayer);
                countY = countCells(x, y - 1, 0, -1, currentPlayer) + countCells(x, y + 1, 0, 1, currentPlayer);

                countDiaObenRechts = countCells(x - 1, y - 1, -1, -1, currentPlayer) + countCells(x + 1, y + 1, 1, 1, currentPlayer);
                countDiaUntenRechts = countCells(x - 1, y + 1, -1, 1, currentPlayer) + countCells(x + 1, y - 1, 1, -1, currentPlayer);

                if (countX >= 4 || countY >= 4 || countDiaObenRechts >= 4 || countDiaUntenRechts >= 4) {
                    int player = currentPlayer;
                    switch (currentPlayer) {
                        case 1 -> currentPlayer = 2;
                        case 2 -> currentPlayer = 1;
                    }
                    return player;
                }

            }
        }

        switch (currentPlayer) {
            case 1 -> currentPlayer = 2;
            case 2 -> currentPlayer = 1;
        }
        return 0;

    }

    private int countCells(int x, int y, int xDir, int yDir, int player) {
        //innerhalb der Grenzen
        if (x >= 0 && x < sizeX && y >= 0 && y < sizeY) {

            // wenn gleiche Farbe wie Spieler, dann eins addieren und in gleiche Richtung weiter
            if (feld[x][y] == player) {
                return countCells(x + xDir, y + yDir, xDir, yDir, player) + 1;

            }
        }

        // außerhalb oder anderer Spieler
        return 0;
    }


    /*
     * 0: nichts gesetzt
     * 1: Spieler1 hat einen Coin an X,Y
     * 2: Spieler2 hat einen Coint an X,Y
     */
    public int getXY(int x, int y) {

        return feld[x][y];
    }

    public void setXY(int x, int y, int spielerID) {
        feld[x][y] = spielerID;
    }

    public String toString() {

        for (int y = sizeY - 1; y >= 0; y--) {
            StringBuffer b = new StringBuffer();
            b.append('|');
            for (int x = 0; x < sizeX; x++) {
                if (getXY(x, y) == 1)
                    b.append(coinSpieler1);
                else if (getXY(x, y) == 2)
                    b.append(coinSpieler2);
                else
                    b.append(' ');

            }
            b.append('|');
            System.out.println(b);

        }


        return "";
    }


    public static void main(String[] args) {

        Game g = new Game();

        /*
         * Nur zu Demozwecken. Später sollen die Steine über
         * setCoin(slot) gesetzt werden können.
         */
        g.setXY(1, 0, 1);
        g.setXY(2, 0, 2);
        g.setXY(3, 0, 1);
        g.setXY(1, 1, 2);

        System.out.println(g);


    }


}
