package vorlesung.v6.a12;

public class Main {
    public static void main(String[] args) {
        Person stolte = new Person();

        stolte.setFirstname("Per Henrik");
        stolte.setLastname("Stolte");
        stolte.setAge(19);
        stolte.setEmail("perhenrik.phs@gmail.com");
        System.out.println(stolte.getStatus());

    }
}
