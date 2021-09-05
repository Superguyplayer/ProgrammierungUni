package s2.selbststudium.mai.af3;

public class Main {
    public static void main(String[] args) {

        Laubbaum b = new Laubbaum(Laubbaum.Arten.GROSSBAUM);
        Laubbaum a = new Laubbaum(Laubbaum.Arten.KLEINBAUM);

        System.out.println(a.toString());
        System.out.println(b.toString());


    }
}
