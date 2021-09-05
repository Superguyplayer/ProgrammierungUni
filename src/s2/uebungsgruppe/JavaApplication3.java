/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2.uebungsgruppe;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Admin
 */
public class JavaApplication3{
    JFrame frame  = new JFrame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new JavaApplication3();
    }
    
    public JavaApplication3(){
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setMinimumSize(new Dimension(400,600));
        System.out.println(frame.getWidth()+","+frame.getHeight());

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        class MyMouseAdapter extends MouseAdapter{
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println(frame.getWidth()+","+frame.getHeight());
            }
        }
        
        frame.addMouseListener(new MyMouseAdapter());
    }  
}