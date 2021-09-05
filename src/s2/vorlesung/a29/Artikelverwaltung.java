package s2.vorlesung.a29;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Artikelverwaltung extends JFrame {

    private JLabel lblArticle, lblPrice, lblDescription, lblWarning;
    private JTextField txtArticle, txtPrice;
    private JTextArea txtDescription;
    private JScrollPane scrollPane;

    private JButton btnOK, btnPrint;

    private InputVerifier verifier = new InputVerifier() {
        @Override
        public boolean verify(JComponent input) {
            JTextField field = (JTextField) input;
            String in = field.getText();
            try{
                Double.parseDouble(in);
            } catch(Exception e) {
                return false;
            }
            return true;
        }
    };


    public Artikelverwaltung() {
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Artikelverwaltung");
        this.setSize(500, 300);
        this.setResizable(false);

        initializeComponents();
        initializeListeners();


        this.setVisible(true);


    }

    private void initializeListeners() {


        btnOK.addActionListener(e -> {
            if(txtArticle.getText().equals("")) {
                lblWarning.setText("Es muss eine Artikelbezeichnung geben");
                lblWarning.setForeground(Color.red);
                lblWarning.setVisible(true);
            }else if(verifier.verify(txtPrice)) {
                lblWarning.setText("Bitte einen sinnvollen Preis eingeben");
                lblWarning.setForeground(Color.red);
                lblWarning.setVisible(true);
            } else{

                System.out.println(txtArticle.getText() + ", Price: " + txtPrice.getText());
            }


        });

        //max 30 chars
        txtArticle.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(txtArticle.getText().length() >= 30) {
                    e.consume();
                }
            }
        });


        txtPrice.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(txtPrice.getText().length() >= 30) {
                    e.consume();
                }

                if(!Character.isDigit(e.getKeyChar()) && !(e.getKeyChar() == ',')) { // nur Zahlen eingeben
                    e.consume();
                }
            }
        });

    }

    private void initializeComponents() {

        lblArticle = new JLabel("Artikelbeschreibung:");
        lblArticle.setBounds(25, 5, 150, 15);
        this.add(lblArticle);

        txtArticle = new JTextField();
        txtArticle.setBounds(25, 25, 400, 20);
        this.add(txtArticle);

        lblPrice = new JLabel("Preis:");
        lblPrice.setBounds(25, 48, 50, 15);
        this.add(lblPrice);

        lblWarning = new JLabel("");
        lblWarning.setBounds(150, 2, 250, 20);
        lblWarning.setVisible(false);
        this.add(lblWarning);

        txtPrice = new JTextField();
        txtPrice.setBounds(25, 65, 400, 20);
        txtPrice.setHorizontalAlignment(JTextField.RIGHT);
        this.add(txtPrice);

        lblDescription = new JLabel("Beschreibung:");
        lblDescription.setBounds(25, 90, 400, 20);
        this.add(lblDescription);


        txtDescription = new JTextArea();
        txtDescription.setLineWrap(true);

        scrollPane = new JScrollPane(txtDescription, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(25, 120, 400, 100);

        this.add(scrollPane);


        btnOK = new JButton("OK");
        btnOK.setBounds(165, 230, 55, 25);

        this.add(btnOK);

        btnPrint = new JButton("Drucken");
        btnPrint.setBounds(230, 230, 90, 25);

        this.add(btnPrint);

    }

}
