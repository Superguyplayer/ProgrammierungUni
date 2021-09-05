package s2.uebung.u12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ColorPanel extends JPanel {
    Random rand;

    public ColorPanel() {

        changeColor();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               changeColor();
            }
        });

    }

    public void changeColor() {
        rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        this.setBackground(new Color(r, g, b));

    }

    public void white() {
        this.setBackground(Color.WHITE);
    }

}
