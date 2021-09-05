package s2.selbststudium.mai.af3;

public class Laubbaum extends Baum{

     enum Arten{
        KLEINBAUM, MITTELGROSSER_BAUM, GROSSBAUM
    }

    private Arten art;

     public Laubbaum(Arten art) {
         this.art = art;
     }

    @Override
    public String toString() {
        return "Laubbaum{" +
                " art=" + art +
                '}';
    }
}
