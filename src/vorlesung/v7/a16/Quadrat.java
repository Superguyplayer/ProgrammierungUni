package vorlesung.v7.a16;

public class Quadrat extends Rechteck{
    private int laenge;

    public Quadrat(int laenge) {
        super(laenge, laenge);
        this.laenge = laenge;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;

    }

}
