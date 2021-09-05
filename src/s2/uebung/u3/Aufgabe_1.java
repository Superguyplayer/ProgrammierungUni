package s2.uebung.u3;

public class Aufgabe_1 {
    public static void main(String[] args) {
        int n = 2, s = 1;
        while (n <= 5) {
            System.out.println((s *= n++) + "  ");
        }
    }
}
