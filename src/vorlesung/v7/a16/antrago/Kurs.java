package vorlesung.v7.a16.antrago;

import java.util.ArrayList;

public class Kurs {
    private String name;
    private ArrayList<Studierender> studierende;
    private ArrayList<Modul> module;

    public Kurs(String name, ArrayList<Studierender> studierende) {
        this.name = name;
        this.studierende = studierende;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudierende(ArrayList<Studierender> studierende) {
        this.studierende = studierende;
    }

    public ArrayList<Studierender> getStudierende() {
        return studierende;
    }

    public ArrayList<Modul> getModule() {
        return module;
    }

    public void setModule(ArrayList<Modul> module) {
        this.module = module;
    }
}
