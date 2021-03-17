package uebung.u7.a.a2;

public class Birne extends Obst{

    public Birne() {
        super.name = "Birne";
        super.color = "grün";
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getFarbe() {
        return color;
    }
}
