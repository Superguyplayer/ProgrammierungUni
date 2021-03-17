package uebung.u7.b.a2;

import java.util.Date;

public class Film {
    private String titel;
    private Date premiere;
    private Person regisseur;


    public void abspielen() {

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Date getPremiere() {
        return premiere;
    }

    public void setPremiere(Date premiere) {
        this.premiere = premiere;
    }

    public Person getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(Person regisseur) {
        this.regisseur = regisseur;
    }
}
