package uebungsgruppe.projekte.rech;

import java.awt.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.util.Random;

public class trechner extends JFrame implements ActionListener {
	private JTextField txtvar1 = new JTextField();
	private JTextField txtvar2 = new JTextField();
	private JTextField txtvarErg = new JTextField();

	// Labels
	private JLabel lblVar1 = new JLabel("Zahl 1");
	private JLabel lblVar2 = new JLabel("Zahl 2");
	private JLabel lblVarErg = new JLabel("Ergebnis");
	private JLabel txtrandomText = new JLabel();
	private JLabel lblschalke = new JLabel(new ImageIcon("C:\\Users\\perhe\\IdeaProjects\\ProgrammmierungUni\\src\\uebungsgruppe\\rechner\\rech\\images.png"));

	// Buttons
	private JButton btplus = new JButton("+");
	private JButton btminus = new JButton("-");
	private JButton btmal = new JButton("*");
	private JButton btgeteilt = new JButton("/");
	private JButton btloeschen = new JButton("Reset");
	private JButton gb = new JButton("Schalke");
	private JButton random = new JButton("??");
	private JButton btwurzel = new JButton("Wurzel");
	private JButton btfakl = new JButton("Fakultät");

	File Schalkeg = new File("C:\\Users\\perhe\\IdeaProjects\\ProgrammmierungUni\\src\\uebungsgruppe\\rechner\\rech\\Schalkeg.wav");

	public trechner() {
		Container cp = getContentPane();
		cp.setLayout(null);

		lblVar1.setBounds(140, 10, 60, 20);
		txtvar1.setBounds(210, 10, 120, 20);
		lblVar2.setBounds(140, 40, 190, 20);
		txtvar2.setBounds(210, 40, 120, 20);
		lblVarErg.setBounds(140, 70, 190, 20);
		txtvarErg.setBounds(210, 70, 160, 20);
		txtvarErg.setEditable(false);
		lblschalke.setBounds(1, 1, 130, 130);
		txtrandomText.setBounds(250, 220, 275, 35);

		btplus.setBounds(140, 120, 50, 20);
		btminus.setBounds(190, 120, 50, 20);
		btmal.setBounds(240, 120, 50, 20);
		btgeteilt.setBounds(290, 120, 50, 20);
		btloeschen.setBounds(140, 150, 100, 20);
		gb.setBounds(240, 150, 100, 20);
		random.setBounds(50, 210, 150, 20);
		btwurzel.setBounds(400, 60, 100, 20);
		btfakl.setBounds(300, 200, 150, 20);

		// Registration
		cp.add(lblVar1);
		cp.add(txtvar1);
		cp.add(lblVar2);
		cp.add(txtvar2);
		cp.add(lblVarErg);
		cp.add(btplus);
		cp.add(btminus);
		cp.add(btmal);
		cp.add(btgeteilt);
		cp.add(btloeschen);
		cp.add(gb);
		cp.add(txtvarErg);
		cp.add(lblschalke);
		cp.add(txtrandomText);
		cp.add(random);
		cp.add(btwurzel);
		cp.add(btfakl);

		// Parameter
		setTitle("Schalkerechner");
		setSize(550, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		lblschalke.setVisible(false);
		txtrandomText.setVisible(false);

		btplus.addActionListener(this);
		btminus.addActionListener(this);
		btmal.addActionListener(this);
		btgeteilt.addActionListener(this);
		btloeschen.addActionListener(this);
		gb.addActionListener(this);
		random.addActionListener(this);
		btwurzel.addActionListener(this);
		btfakl.addActionListener(this);

	}

	// ActionPerformer

	@Override
	public void actionPerformed(ActionEvent e) {
		double var1, var2;
		Random r = new Random();
		int randomer;

		String gsnnc = "Gib se noch ne Chance!!";
		Object obj = e.getSource();

		if (obj == gb) {
			lblschalke.setVisible(true);
			txtvarErg.setText(gsnnc);
			PlaySound(Schalkeg);
		}

		if (obj == random) {
			txtrandomText.setVisible(true);
			randomer = r.nextInt(6);

			if (randomer == 0) {
				txtrandomText.setText("Ohh, ein Schalker...");
			}

			else if (randomer == 1) {
				txtrandomText.setText("Schalke 07!");
			} else if (randomer == 2) {
				txtrandomText.setText("Schalke Schalke");
			} else if (randomer == 3) {
				txtrandomText.setText("Toooooooor!!");
			} else if (randomer == 4) {
				txtrandomText.setText("Fynn Bogasson");
			} else if (randomer == 5) {
				txtrandomText.setText("Ole Ole Ole Ole");
				
			}

		}

		if (obj == btloeschen) {

			txtvar1.setText("");
			txtvar2.setText("");
			txtvarErg.setText("");
			lblschalke.setVisible(false);
			txtrandomText.setVisible(false);
		}

		try {

			if (obj == btwurzel) {
				var1 = Double.parseDouble(txtvar1.getText());
				var1 = Math.sqrt(var1);
				txtvarErg.setText("" + var1);
			}

			if (obj == btfakl) {
				var1 = Double.parseDouble(txtvar1.getText());
				if (var1 <= 21) {

					long x = 1;
					var1 = Double.parseDouble(txtvar1.getText());
					while (true) {
						if (var1 <= 1) {
							break;
						}
						x *= var1;
						var1--;

					}
					txtvarErg.setText("" + x);
				} else {
					txtvarErg.setText("Bitte maximal 21 eingeben");
				}

			}
			if (obj == btplus) {

				var1 = Double.parseDouble(txtvar1.getText());
				var2 = Double.parseDouble(txtvar2.getText());

				var1 = var1 + var2;
				txtvarErg.setText("" + var1);
			}

			else if (obj == btminus) {
				var1 = Double.parseDouble(txtvar1.getText());
				var2 = Double.parseDouble(txtvar2.getText());

				var1 = var1 - var2;
				txtvarErg.setText("" + var1);
			}

			else if (obj == btmal) {
				var1 = Double.parseDouble(txtvar1.getText());
				var2 = Double.parseDouble(txtvar2.getText());

				var1 = var1 * var2;
				txtvarErg.setText("" + var1);
			}

			else if (obj == btgeteilt) {
				var1 = Double.parseDouble(txtvar1.getText());
				var2 = Double.parseDouble(txtvar2.getText());

				var1 = var1 / var2;
				txtvarErg.setText("" + var1);
			}
		} catch (Exception k) {

			Random i = new Random();
			int rando;
			rando = i.nextInt(3);
			txtrandomText.setVisible(true);

			switch (rando) {
				case 0 -> txtrandomText.setText("Zu blöd fürn Schalkerechner!");
				case 1 -> txtrandomText.setText("Selbst nen Dortmunder ist schlauer");
				case 2 -> txtrandomText.setText("Mann bist du blöd!!");
			}

		}
	}

	public static void main(String[] args) {
		new trechner();
	}

	static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

		} catch (Exception Audio) {
		}
	}
}
