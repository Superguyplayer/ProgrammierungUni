package vorlesung.a28;

import javax.swing.*;
import java.awt.*;

public class Aufgabe_28 extends JFrame {

    private JPanel[] panels = new JPanel[20];

    public Aufgabe_28() {

        this.setLayout(new GridLayout(4, 5, 15, 15));
        this.setSize(700,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);

        initializeComponents() ;

        this.setVisible(true);

    }

    private void initializeComponents() {

        for(JPanel p: panels) {
            p = new JPanel();
            p.setBackground(Color.RED);
            this.add(p);

        }

    }

}
