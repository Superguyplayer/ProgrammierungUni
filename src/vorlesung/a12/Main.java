package vorlesung.a12;

public class Main {
    public static void main(String[] args) {
        Person stolte = new Person("Per Henrik", "Stolte");
        System.out.println(stolte.getStatus());

        stolte.setAge(19).setEmail("perhenrik.stolte@studium.hspv.nrw.de");


        System.out.println(stolte.getStatus());

    }
}
