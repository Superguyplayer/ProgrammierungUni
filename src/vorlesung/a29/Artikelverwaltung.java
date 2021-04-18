package vorlesung.a29;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Artikelverwaltung extends JFrame {

    private JLabel lblArticle, lblPrice, lblDescription;
    private JTextField txtArticle, txtPrice;
    private JTextArea txtDescription;
    private JScrollPane scrollPane;

    private JButton btnOK, btnPrint;


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


        btnOK.addActionListener(e -> {System.out.println(txtArticle.getText() + ", Price: " + txtPrice.getText());});

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

                if(!Character.isDigit(e.getKeyChar()) && !(e.getKeyChar() == '.')) { // nur Zahlen eingeben
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
