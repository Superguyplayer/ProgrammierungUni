package s2.vorlesung.a16.antrago;

import java.util.ArrayList;

public abstract class AntragoTools {

    public static Kurs createKurs(String kursName, String... namen) {
        ArrayList<Studierender> kurs = new ArrayList<Studierender>();
        for(String name: namen) {
            kurs.add(new Studierender(name));
        }


        return new Kurs(kursName, kurs);
    }

}
