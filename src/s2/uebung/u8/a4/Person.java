package s2.uebung.u8.a4;

public class Person {
    private String vorname, nachname;
    private int alter;

    public Person(String vorname, String nachname, int alter) {
        if(nachname == null || nachname.isEmpty()) {
            throw new PersonException("Es muss ein Nachname angegeben werden!");
        }
        if(alter < 0 || alter > 150) {
            throw new PersonException("Alter muss zwischen 0 und 150 liegen");
        }
        this.alter = alter;
        this.nachname = nachname;
        this.vorname = vorname;

    }

}
