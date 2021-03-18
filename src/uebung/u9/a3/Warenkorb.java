package uebung.u9.a3;

import java.util.Vector;

public class Warenkorb {

    private Vector<Artikel> artikelVector = new Vector<Artikel>();


    public void add(Artikel artikel) {
    artikelVector.add(artikel);

    }

    public double bestellwert() {
        double sum = 0;

        for(Artikel a: artikelVector) {

            sum += a.getMenge()* a.getPreis();

        }

        return sum;

    }


}
