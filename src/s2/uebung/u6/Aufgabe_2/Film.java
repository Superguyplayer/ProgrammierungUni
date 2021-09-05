package s2.uebung.u6.Aufgabe_2;

import java.util.Date;

public class Film {
    private String titel;
    private Date premiere;
    private Person regisseur;

    public void abspielen() {
        System.out.println("abspielen...");
    }

    public String getTitel() {
        return titel;
    }
}
