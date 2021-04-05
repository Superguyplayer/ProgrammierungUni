package vorlesung;


public class Aufgabe_17 {

    public static void main(String[] args) {
        int age = 0;

        try {
            age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein"));

            System.out.printf("Sie sind %S Jahre alt.", age);

        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie eine Zahl ein");
        }

    }
}
