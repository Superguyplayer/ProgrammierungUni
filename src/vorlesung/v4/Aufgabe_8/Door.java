package vorlesung.v4.Aufgabe_8;

public class Door {

    private int xPos, yPos;

    public Door() {
        this.xPos = (int)(Math.random() * 10 + 1);
        this.yPos = (int)(Math.random() * 10 + 1);
    }



    public int getyPos() {
        return yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void printPos() {
        System.out.println("Door is at Position X: " + this.xPos + ";Y: " + this.yPos);
    }



}
