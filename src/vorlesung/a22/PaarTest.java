package vorlesung.a22;

public class PaarTest {

    public static void main(String[] args) {
        Paar<String, Integer> p1 = new Paar<>();

        p1.setValueT("Hallo");
        p1.setValueU(10);

        System.out.println(p1.toString());

    }
}
