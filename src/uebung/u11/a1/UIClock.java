package uebung.u11.a1;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class UIClock extends JFrame {

    private JLabel lblTime;
    private Timer t;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private TimerTask tt = new TimerTask() {
        @Override
        public void run() {
            lblTime.setText(dtf.format(LocalDateTime.now()));
        }
    };


    public UIClock() {


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(200, 65);
        this.setResizable(false);

        initializeComponents();
        this.setVisible(true);

    }

    private void initializeComponents() {
        t = new Timer();
        lblTime = new JLabel();
        lblTime.setText(dtf.format(LocalDateTime.now()));
        lblTime.setSize(200, 25);
        lblTime.setFont(new Font(lblTime.getName(), Font.PLAIN, 20)); // Fontsize einstellen

        t.scheduleAtFixedRate(tt,1000,1000);

        this.add(lblTime);


    }


}
