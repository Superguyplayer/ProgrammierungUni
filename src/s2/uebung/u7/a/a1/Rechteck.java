package s2.uebung.u7.a.a1;

public class Rechteck extends Figur{

    private int height, width;


    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    void zeichne() {
        System.out.println(height);
        System.out.println(width);
        System.out.println(getFlaeche());

    }

    @Override
    double getFlaeche() {
        return height * width;
    }

    @Override
    public int compareTo(Figur o) {
        return Double.compare(this.getFlaeche(), o.getFlaeche());
    }
}
