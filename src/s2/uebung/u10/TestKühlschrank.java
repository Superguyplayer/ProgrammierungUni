package s2.uebung.u10;

public class TestKühlschrank {

    public static void main(String[] args) {
        Kuehlschrank k = new Kuehlschrank();

        try {
            k.addContent("möhre", 4);
            k.addContent("joghurt", 3);
            k.addContent("möhre", 5);



        } catch (Kuehlschrankexception kuehlschrankexception) {
            kuehlschrankexception.printStackTrace();
        }
        k.getContent();

    }

}
