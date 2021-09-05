package s2.uebung.u7.a.a2;

public class Apfel extends Obst{

    public Apfel() {
        super.name = "Apfel";
        super.color = "rot";
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
