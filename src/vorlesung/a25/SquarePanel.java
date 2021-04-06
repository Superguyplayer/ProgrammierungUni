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

    int movespeed = 5;
    JPanel panelRO, panelRU, panelLO, panelLU;
    Timer t;
    TimerTask tt = new TimerTask() {
        @Override
        public void run() {
                //animation
                panelRO.setLocation(panelRO.getX() + movespeed, panelRO.getY() - movespeed);
                panelRU.setLocation(panelRU.getX() + movespeed, panelRU.getY() + movespeed);
                panelLO.setLocation(panelLO.getX() - movespeed, panelLO.getY() - movespeed);
                panelLU.setLocation(panelLU.getX() - movespeed, panelLU.getY() + movespeed);


        }
    };

        //constructor
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

        //creating Panels
        panelRO = new JPanel();
        panelRU = new JPanel();
        panelLO = new JPanel();
        panelLU = new JPanel();

        //configuring Panels
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
