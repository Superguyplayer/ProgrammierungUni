package s2.vorlesung.a16.antrago;


import java.util.ArrayList;


public class TeilModul extends Modul{

    private ArrayList<Studierender> teilnehmende;
    private int stundenproWoche;

    public TeilModul(String name, int stundenProWoche, ArrayList<Studierender> teilnehmende) {
     super(name);
        this.teilnehmende = teilnehmende;
        this.stundenproWoche = stundenProWoche;
    }
    public TeilModul(String name, int stundenProWoche) {
        super(name);
        this.stundenproWoche = stundenProWoche;
    }

    public TeilModul removeStudent(Studierender student) {
        teilnehmende.remove(student);
        return this;
    }

    public TeilModul addStudent(Studierender student) {
        teilnehmende.add(student);
        return this;
    }

    public ArrayList<Studierender> getTeilnehmende() {
        return teilnehmende;
    }
}
