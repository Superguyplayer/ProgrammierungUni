package uebung.u11.a2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class Aufgabe_2 extends JFrame {

    private JPanel pnlSquare;
    private Timer t = new Timer();
    boolean pause = true;

    private TimerTask tt = new TimerTask() {
        @Override
        public void run() {
            if (!pause) {
                pnlSquare.setSize(pnlSquare.getWidth() + 1, pnlSquare.getHeight() + 1);
            }
        }
    };

    public Aufgabe_2() {
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);

        initializeComponents();
        initializeListeners();

        t.scheduleAtFixedRate(tt, 30, 30);

        this.setVisible(true);
    }

    private void initializeListeners() {

        this.addMouseListener(new MouseListener() {


            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlSquare.setBackground(Color.BLUE);
                pause = false;


            }

            @Override
            public void mouseExited(MouseEvent e) {
                pause = true;
                pnlSquare.setBackground(Color.RED);
                pnlSquare.setSize(50, 50);


            }
        });

    }

    private void initializeComponents() {
        //pnlSquare
        {
            pnlSquare = new JPanel();
            pnlSquare.setLocation(125, 125);
            pnlSquare.setBackground(Color.RED);
            pnlSquare.setSize(50, 50);

            this.add(pnlSquare);
        }

    }
}
