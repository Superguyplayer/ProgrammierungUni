package uebung.u9.a3;

public class MainEinkaufen {

    public static void main(String[] args) {

        Artikel a1 = new Artikel(1, 1.5, 10);
        Artikel a2 = new Artikel(2, 2.75, 2);
        Artikel a3 = new Artikel(3, 3, 5);

        Warenkorb w1 = new Warenkorb();

        w1.add(a1);
        w1.add(a2);
        w1.add(a3);

        System.out.println(w1.bestellwert());


    }





}
