package vorlesung.a16.antrago;

import java.util.ArrayList;
import java.util.Collections;

public class Dozent {
    private String name;
    private ArrayList<TeilModul> module;

    public Dozent(String name, TeilModul... module) {
        this.name = name;
        Collections.addAll(this.module, module);
    }

}
