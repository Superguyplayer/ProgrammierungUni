package uebung.u7.b.a2;

import java.util.Date;

public class Person {
    private String vorname, nachname;
    private Date geborenAm;


    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Date getGeborenAm() {
        return geborenAm;
    }

    public void setGeborenAm(Date geborenAm) {
        this.geborenAm = geborenAm;
    }
}
