package vorlesung.a27;

import javax.swing.*;



public class Aufgabe_27 extends JFrame {

    JButton btnExtendHook, btnDriveInHook, btnExtend, btnDriveIn, btnLeft, btnRight;
    Kran kran;


    public Aufgabe_27() {
        this.setLayout(null);

        this.setSize(640, 480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Aufgabe 27");

        initializeComponents();
        initializeListeners();

        this.setVisible(true);


    }

    private void initializeListeners() {

        //extend hook
        btnExtendHook.addActionListener(e -> kran.extendHook(10));

        //decreaseHook
        btnDriveInHook.addActionListener(e -> kran.decreaseHook(10));

        //move crane to the left
        btnLeft.addActionListener(e -> kran.moveCrane(-10));

        //move crane to the right
        btnRight.addActionListener(e -> kran.moveCrane(10));

        //move arm left
        btnDriveIn.addActionListener(e -> kran.extendArm(-10));

        //move arm right
        btnExtend.addActionListener(e -> kran.extendArm(10));

    }

    private void initializeComponents() {
        //btnExtendHook
        {
            btnExtendHook = new JButton("Haken ausfahren");
            btnExtendHook.setBounds(15, 15, 150, 25);
            this.add(btnExtendHook);
        }

        //btnDriveInHook
        {

            btnDriveInHook = new JButton("Haken einfahren");
            btnDriveInHook.setBounds(15, 45, 150, 25);
            this.add(btnDriveInHook);
        }

        //btnExtend
        {

            btnExtend = new JButton("Ausleger ausfahren");
            btnExtend.setBounds(15, 75, 150, 25);
            this.add(btnExtend);
        }

        //btnDriveIn
        {

            btnDriveIn = new JButton("Ausleger einfahren");
            btnDriveIn.setBounds(15, 105, 150, 25);
            this.add(btnDriveIn);
        }

        //btnLeft
        {

            btnLeft = new JButton("Kran nach links");
            btnLeft.setBounds(170, 15, 150, 25);
            this.add(btnLeft);
        }

        //btnRight
        {

            btnRight = new JButton("Kran nach rechts");
            btnRight.setBounds(170, 45, 150, 25);
            this.add(btnRight);
        }

        //kran
        {
            kran = new Kran();
            kran.setLocation(0,140);
            kran.setSize(640, 280);
            this.add(kran);
        }


    }

}
