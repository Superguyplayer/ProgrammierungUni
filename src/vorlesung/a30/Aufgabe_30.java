package vorlesung.a30;

import javax.swing.*;
import java.awt.*;

public class Aufgabe_30 extends JFrame {

    private JPanel pnlColor;
    private JLabel lblR, lblG, lblB, lblNumberR, lblNumberG, lblNumberB;
    private JSlider sldR, sldG, sldB;

    public Aufgabe_30() {
        this.setLayout(null);
        this.setTitle("Aufgabe_30");
        this.setSize(600, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeComponents();
        initializeListeners();

        this.setVisible(true);


    }

    private void initializeListeners() {

        sldR.addChangeListener(e -> {
            lblNumberR.setText(String.valueOf(sldR.getValue()));
            pnlColor.setBackground(new Color(sldR.getValue(), sldG.getValue(), sldB.getValue()));
        });

        sldG.addChangeListener(e -> {
            lblNumberG.setText(String.valueOf(sldG.getValue()));
            pnlColor.setBackground(new Color(sldR.getValue(), sldG.getValue(), sldB.getValue()));
        });

        sldB.addChangeListener(e -> {
            lblNumberB.setText(String.valueOf(sldB.getValue()));
            pnlColor.setBackground(new Color(sldR.getValue(), sldG.getValue(), sldB.getValue()));
        });


    }

    private void initializeComponents() {

        sldR = new JSlider(0,  255, 255);
        sldR.setBounds(5, 100, 170, 50);
        sldR.setMajorTickSpacing(85);
        sldR.setPaintTicks(true);
        sldR.setPaintLabels(true);
        this.add(sldR);

        sldG = new JSlider(0,  255, 255);
        sldG.setBounds(205, 100, 170, 50);
        sldG.setMajorTickSpacing(85);
        sldG.setPaintTicks(true);
        sldG.setPaintLabels(true);
        this.add(sldG);

        sldB = new JSlider(0,  255, 255);
        sldB.setBounds(405, 100, 170, 50);
        sldB.setMajorTickSpacing(85);
        sldB.setPaintTicks(true);
        sldB.setPaintLabels(true);
        this.add(sldB);


        lblNumberR = new JLabel("255");
        lblNumberR.setBounds(85, 55, 25, 10);
        lblNumberR.setHorizontalAlignment(JLabel.CENTER);
        this.add(lblNumberR);

        lblNumberG = new JLabel("255");
        lblNumberG.setBounds(285, 55, 25, 10);
        lblNumberG.setHorizontalAlignment(JLabel.CENTER);
        this.add(lblNumberG);

        lblNumberB = new JLabel("255");
        lblNumberB.setBounds(485, 55, 25, 10);
        lblNumberB.setHorizontalAlignment(JLabel.CENTER);
        this.add(lblNumberB);


        lblR = new JLabel("R");
        lblR.setBounds(95, 25, 10, 10);
        this.add(lblR);

        lblG = new JLabel("G");
        lblG.setBounds(295, 25, 10, 10);
        this.add(lblG);

        lblB = new JLabel("B");
        lblB.setBounds(495, 25, 10, 10);
        this.add(lblB);

        pnlColor = new JPanel();
        pnlColor.setBounds(0, 160, 600, 140);
        this.setBackground(Color.white);
        this.add(pnlColor);




    }

}
