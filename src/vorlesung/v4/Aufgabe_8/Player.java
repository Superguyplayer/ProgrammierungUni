package vorlesung.v4.Aufgabe_8;

public class Player {
    private int xPos, yPos;

    public Player() {
        this.xPos = 1;
        this.yPos = 1;

    }

    public void movePlayerX(int x) {
        //check if pos is inside of matrix
        if((this.xPos + x) <= 10) {
            if((this.xPos + x) > 0) {
                this.xPos += x;
            }else{
                this.xPos = 1;
            }
        }else{
            this.xPos = 10;
        }
       printPos();

    }

    public void movePlayerY(int y) {
        if((this.yPos + y) <= 10) {
            if((this.yPos + y) > 0) {
                this.yPos += y;
            }else{
                this.yPos = 1;
            }
        }else{
            this.yPos = 10;
        }
        printPos();

    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }


    public void printPos() {
        System.out.println("Player now at Position X: " + this.xPos + ";Y: " + this.yPos);
    }

}
