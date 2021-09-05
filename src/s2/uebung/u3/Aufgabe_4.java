package s2.uebung.u3;

public class Aufgabe_4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i);

            if (i % 3 == 0) {
                System.out.println(" ist durch 3 teilbar");
            } else {
                System.out.println();
            }
        }

    }
}
