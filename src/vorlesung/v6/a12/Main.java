package vorlesung.v6.a12;

public class Main {
    public static void main(String[] args) {
        Person stolte = new Person();


        stolte.setFirstname("Per Henrik").setLastname("Stolte").setAge(19).setEmail("perhenrik.stolte@studium.hspv.nrw.de");


        System.out.println(stolte.getStatus());

    }
}
