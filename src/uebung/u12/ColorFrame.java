package uebung.u12;

import uebung.u11.a2.ColorPanel;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorFrame extends JFrame {

    JPanel gridPanel;

    ColorPanel[] panels;

    JPanel pnlButtons;

    JButton btnColor, btnReset;

    public ColorFrame() {
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(440, 525);

        initializeComponents();
        initializeListeners();

        this.setVisible(true);


    }

    private void initializeListeners() {

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              try {
                  ColorPanel p = (ColorPanel) gridPanel.getComponentAt(e.getPoint());
                  if (p != null) {

                      p.changeColor();

                  }
              }catch(ClassCastException exception) {
                  System.out.println("nicht dahin klicken....");
              }

            }
        });

        btnColor.addActionListener(e -> {
            for(ColorPanel p : panels) {
                p.changeColor();
            }
        });

        btnReset.addActionListener(e -> {
            for(ColorPanel p : panels) {
                p.white();
            }
        });

    }

    private void initializeComponents() {

        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(7, 7));


        panels = new ColorPanel[49];

        for (int i = 0; i < panels.length; i++) {

            panels[i] = new ColorPanel();
            gridPanel.add(panels[i]);

        }
        gridPanel.setBounds(0, 0, 425, 425);
        this.add(gridPanel);

        pnlButtons = new JPanel(new GridLayout(1, 2));
        btnColor = new JButton("Farben");
        btnReset = new JButton("Zurücksetzen");

        pnlButtons.add(btnColor);
        pnlButtons.add(btnReset);

        pnlButtons.setBounds(85, 450, 250, 25);
        this.add(pnlButtons);


    }


}
