package s2.uebung.u7.b.a2;

public class HiWi implements StudHilfskraft{
    private String name;
    private double gehalt;
    private int matrNr;
    private int dauer;

    @Override
    public double getGehalt() {
        return this.gehalt;
    }

    @Override
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMatrNr() {
        return this.matrNr;
    }

    @Override
    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    @Override
    public int getDauer() {
        return this.dauer;
    }

    @Override
    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
}
