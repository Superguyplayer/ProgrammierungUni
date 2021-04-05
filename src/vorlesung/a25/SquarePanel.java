package vorlesung.a25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class SquarePanel extends JFrame {

    JPanel panelRO, panelRU, panelLO, panelLU;
    Timer t;
    TimerTask tt = new TimerTask() {
        @Override
        public void run() {

                panelRO.setLocation(panelRO.getX() + 5, panelRO.getY() - 5);
                panelRU.setLocation(panelRU.getX() + 5, panelRU.getY() + 5);
                panelLO.setLocation(panelLO.getX() - 5, panelLO.getY() - 5);
                panelLU.setLocation(panelLU.getX() - 5, panelLU.getY() + 5);


        }
    };


    public SquarePanel() {
        this.setLayout(null);
        this.setSize(550, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeComponents();
        initializeListeners();

        this.setVisible(true);


    }

    private void initializeListeners() {

        //Keys
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    t.cancel();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //Mouse
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    t.cancel();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


    }




    private void initializeComponents() {
        t = new Timer();
        panelRO = new JPanel();
        panelRU = new JPanel();
        panelLO = new JPanel();
        panelLU = new JPanel();


        panelRO.setLocation(225, 250);
        panelRO.setSize(50,50);
        panelRO.setBackground(Color.RED);

        panelRU.setLocation(225, 250);
        panelRU.setSize(50,50);
        panelRU.setBackground(Color.RED);

        panelLO.setLocation(225, 250);
        panelLO.setSize(50,50);
        panelLO.setBackground(Color.RED);

        panelLU.setLocation(225, 250);
        panelLU.setSize(50,50);
        panelLU.setBackground(Color.RED);


        this.add(panelRO);
        this.add(panelRU);
        this.add(panelLO);
        this.add(panelLU);

        t.scheduleAtFixedRate(tt, 250,250);

    }



}
