package uebung.u7.a.a1;

import java.util.ArrayList;
import java.util.Collections;

public class MainFigur {
    public static void main(String[] args) {
        Kreis k = new Kreis();
        Kreis k1 = new Kreis();
        Kreis k2 = new Kreis();

        ArrayList<Kreis> kList = new ArrayList<Kreis>();


        k.setRad(10);
        k1.setRad(15);
        k2.setRad(20);

        kList.add(k1);
        kList.add(k2);
        kList.add(k);

        for(Kreis kreis: kList) {
            System.out.println(kreis.getFlaeche());
        }

        Collections.sort(kList);
        System.out.println();

        for(Kreis kreis: kList) {
            System.out.println(kreis.getFlaeche());
        }

        System.out.println();

        Rechteck r = new Rechteck();

        r.setHeight(10);
        r.setWidth(31);

        r.zeichne();

        System.out.println();

        k.zeichne();

    }
}
