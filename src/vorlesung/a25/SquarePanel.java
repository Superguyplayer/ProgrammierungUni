package vorlesung.a25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class SquarePanel extends JFrame {

    private int movespeed = 5;
    private JPanel panelRO, panelRU, panelLO, panelLU;
    private boolean running = true;
    private final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private Timer t;

    private TimerTask tt = new TimerTask() {
        @Override
        public void run() {

            //stopping the animation if the squares reached the edge
            if(panelLO.getX() <= 0) {
                running = false;
            }

            //animation
            if(running) {
                panelRO.setLocation(panelRO.getX() + movespeed, panelRO.getY() - movespeed);
                panelRU.setLocation(panelRU.getX() + movespeed, panelRU.getY() + movespeed);
                panelLO.setLocation(panelLO.getX() - movespeed, panelLO.getY() - movespeed);
                panelLU.setLocation(panelLU.getX() - movespeed, panelLU.getY() + movespeed);

            }

        }
    };

        //constructor
    public SquarePanel() {
        this.setTitle("Squares");
        this.setLayout(null);
        this.setSize(515, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        //setting the window to mid of the screen
        this.setLocation(screen.width / 2 - this.getWidth() / 2, screen.height / 2 - this.getHeight() / 2);


        initializeComponents();
        initializeListeners();

        //starting the animation
        t.scheduleAtFixedRate(tt, 250,250);

        this.setVisible(true);


    }

    private void initializeListeners() {

        //Keys
        this.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                   running = !running;
                }
            }
        });

        //Mouse
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    running = !running;
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

        //adding Panels
        this.add(panelRO);
        this.add(panelRU);
        this.add(panelLO);
        this.add(panelLU);


    }


}
