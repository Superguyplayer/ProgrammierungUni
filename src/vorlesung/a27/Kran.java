package vorlesung.a27;

import javax.swing.*;
import java.awt.*;
import java.lang.invoke.VarHandle;

public class Kran extends JPanel {

    private JPanel pnlBottom, pnlMid, pnlTop, pnlHook;
    private int midX = 297, midY = 250, top = 150, topLenght = 50, hookLenght = 50;

    public Kran() {
        this.setLayout(null);

        initializeComponents();

        this.setVisible(true);


    }

    private void initializeComponents() {
        //pnlBottom
        {
            pnlBottom = new JPanel();
            pnlBottom.setBackground(Color.RED);

            this.add(pnlBottom);
        }
        //pnlMid
        {
            pnlMid = new JPanel();
            pnlMid.setBackground(Color.RED);

            this.add(pnlMid);
        }

        //pnlTop
        {
            pnlTop = new JPanel();
            pnlTop.setBackground(Color.RED);

            this.add(pnlTop);
        }

        //pnlHook
        {
            pnlHook = new JPanel();
            pnlHook.setBackground(Color.RED);

            this.add(pnlHook);
        }

        updateCrane();

    }

    private void updateCrane() {

        pnlBottom.setBounds(midX - 78, midY, 175, 25);
        pnlHook.setBounds(midX - topLenght, midY - 150, 25, hookLenght);
        pnlMid.setBounds(midX, midY - top, 25, top);

        if(topLenght < 0) {
            pnlTop.setBounds(midX, midY - top, Math.abs(topLenght), 25);
        }else{
            pnlTop.setBounds(midX - topLenght, midY - top, topLenght, 25);
        }

    }


    public void extendHook(int increase) {

        if (hookLenght + increase < 130) {
            hookLenght += increase;
        }
        updateCrane();

    }

    public void decreaseHook(int decrease) {

        if (hookLenght - decrease >= 0) {
            hookLenght -= decrease;
        }
        updateCrane();

    }

    public void moveCrane(int value) {
        if(midX + value < 400 && midX + value > 250) {
            midX += value;
        }
        updateCrane();
    }

    public void extendArm(int value) {
        if(topLenght + value < 200 && topLenght + value > -200) {
            topLenght += value;
        }

        updateCrane();
    }

}
