package uebung.u7.a.a1;

public class Kreis extends Figur{

    private int rad;


    public void setRad(int rad) {
        this.rad = rad;
    }

    @Override
    void zeichne() {
        System.out.println(rad);
        System.out.println(getFlaeche());
    }

    @Override
    double getFlaeche() {
        return Math.PI * Math.pow(rad, 2);
    }
}
