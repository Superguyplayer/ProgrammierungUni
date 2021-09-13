package datenbanken.aufgabeAktionaere;

public class Main {




    public static void main(String[] args) {

        Unternehmen biontech = new Unternehmen(1, "Biontech", "Stadt1", 123425);
        Unternehmen moderna = new Unternehmen(2, "Moderna", "Stadt2", 4222);
        Unternehmen pfizer = new Unternehmen(3, "Pfizer", "Stadt3", 532445);
        Unternehmen sanofi = new Unternehmen(4, "Sanofi", "Stadt4", 733522);

        Aktionaer maxi = new Aktionaer("Maxi", "Mustermann", 1);
        Aktionaer moritz = new Aktionaer("Moritz", "Meier", 2);
        Aktionaer lisa = new Aktionaer("Lisa", "Australien", 3);
        Aktionaer bernd = new Aktionaer("Bernd", "Koch", 4);

        maxi.buyAnteile(biontech, 50);
        maxi.buyAnteile(pfizer, 100);
        lisa.buyAnteile(moderna, 80);
        lisa.buyAnteile(pfizer, 60);
        lisa.buyAnteile(sanofi, 120);
        bernd.buyAnteile(biontech, 200);

        System.out.println("Aktionäre von " + biontech.getName());
        for(Aktionaer a:biontech.getAktionaere().keySet()) {
            System.out.println(a.getName());
        }




    }
}
