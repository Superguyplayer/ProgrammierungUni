package datenbanken.aufgabeAktionaere;

import java.util.HashMap;

public class Unternehmen {

    private String name, city;
    private int id, capital;
    private HashMap<Aktionaer, Integer> aktionaere;

    public Unternehmen(int id, String name, String city, int capital) {

        this.aktionaere = new HashMap<>();
        this.name = name;
        this.id = id;
        this.capital = capital;
        this.city = city;

    }

    public void newAktionaer(Aktionaer aktionaer, int howMany) {
        this.aktionaere.put(aktionaer, howMany);
    }

    public HashMap<Aktionaer, Integer> getAktionaere() {
        return aktionaere;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}
