package s2.uebung.u7.a.a2;

public class Obstlager {

    Obst[] obsts = new Obst[6];

    public Obstlager() {
        obsts[0] = new Orange();
        obsts[1] = new Birne();
        obsts[2] = new Apfel();
        obsts[3] = new Orange();
        obsts[4] = new Birne();
        obsts[5] = new Apfel();
    }


    public void print() {

        for(Obst o: obsts) {
            System.out.println(o.getName());
            System.out.println(o.getFarbe());
            System.out.println();
        }
    }

}
