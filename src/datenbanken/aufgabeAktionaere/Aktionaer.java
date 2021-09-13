package datenbanken.aufgabeAktionaere;

import java.util.ArrayList;
import java.util.HashMap;

public class Aktionaer {

    private String name, surename;
    private int id;

    //unternehmen und Anteile
    private HashMap<Unternehmen, Integer> unternehmen;

    public Aktionaer(String name, String surname, int id) {
        this.unternehmen = new HashMap<>();
        this.id  = id;
        this.name = name;
        this.surename = surname;

    }

    public void buyAnteile(Unternehmen unternehmen, int howMany){
        this.unternehmen.put(unternehmen, howMany);
        unternehmen.newAktionaer(this, howMany);
    }

    public HashMap<Unternehmen, Integer> getUnternehmen() {
        return unternehmen;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
