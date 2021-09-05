package s2.vorlesung.a16;

public class Rechteck {
    private int breite, hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getHoehe() {
        return hoehe;
    }

    private void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    private void setBreite(int breite) {
        this.breite = breite;
    }

    public int getFlaeche() {
        return this.breite * this.hoehe;
    }


}
