package uebung.u7.a.a1;

public class MainFigur {
    public static void main(String[] args) {
        Kreis k = new Kreis();
        Rechteck r = new Rechteck();

        k.setRad(10);
        r.setHeight(10);
        r.setWidth(31);

        r.zeichne();

        System.out.println();

        k.zeichne();

    }
}
