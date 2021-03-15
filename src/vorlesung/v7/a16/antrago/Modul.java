package vorlesung.v7.a16.antrago;


import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Modul {
    private String name;
    private ArrayList<TeilModul> teilModule;
    private ArrayList<DayOfWeek> tage;
    private ArrayList<Date> uhrzeit;

    public Modul(String name) {
        this.name = name;

    }

    public Modul addTeilModule(TeilModul... teilModule) {
        Collections.addAll(this.teilModule, teilModule);
        return this;
    }

    private ArrayList<TeilModul> getTeilModule() {
        return teilModule;
    }
}
