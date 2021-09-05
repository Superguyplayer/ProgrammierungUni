package s2.uebung.u7.a.a2;

public class Orange extends Obst{

    public Orange() {
        super.name = "Orange";
        super.color = "orange";
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
