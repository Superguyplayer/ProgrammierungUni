package uebung.u11.a2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorPanel extends JPanel {
    Random rand;

    public ColorPanel() {
         rand = new Random();

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        this.setBackground(new Color(r, g, b));

    }

    public void changeColor() {
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        this.setBackground(new Color(r, g, b));

    }

    public void white() {
        this.setBackground(Color.WHITE);
    }

}
