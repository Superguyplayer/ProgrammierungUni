package datenbanken.aufgabeAktionaere;

import java.util.ArrayList;

public class Main {


    private static ArrayList<Unternehmen> unternehmenList = new ArrayList<>();
    private static ArrayList<Aktionaer> aktionaerList = new ArrayList<>();

    public static void main(String[] args) {

        unternehmenList.add(new Unternehmen(1, "Biontech", "Stadt1", 123425));
        unternehmenList.add(new Unternehmen(2, "Moderna", "Stadt2", 4222));
        unternehmenList.add(new Unternehmen(3, "Pfizer", "Stadt3", 532445));
        unternehmenList.add(new Unternehmen(4, "Sanofi", "Stadt4", 733522));

        aktionaerList.add(new Aktionaer("Maxi", "Mustermann", 1));
        aktionaerList.add(new Aktionaer("Moritz", "Meier", 2));
        aktionaerList.add(new Aktionaer("Lisa", "Australien", 3));
        aktionaerList.add(new Aktionaer("Bernd", "Koch", 4));

        aktionaerList.get(0).buyAnteile(unternehmenList.get(0), 50);
        aktionaerList.get(0).buyAnteile(unternehmenList.get(2), 100);
        aktionaerList.get(2).buyAnteile(unternehmenList.get(1), 80);
        aktionaerList.get(2).buyAnteile(unternehmenList.get(2), 60);
        aktionaerList.get(2).buyAnteile(unternehmenList.get(3), 120);
        aktionaerList.get(3).buyAnteile(unternehmenList.get(0), 200);





        System.out.println("Unternehmen von : "  + aktionaerList.get(2).getName());


        for(Unternehmen u: aktionaerList.get(2).getUnternehmen().keySet()) {
            System.out.println(u.getName());
        }

        System.out.println();
        System.out.println("Aktionäre von Pfizer:");
        for(Aktionaer a: unternehmenList.get(2).getAktionaere().keySet()) {
            System.out.println(a.getName());
        }

        deleteUnternehmen(unternehmenList.get(2));
        System.out.println();
        System.out.println("Unternehmen von : "  + aktionaerList.get(2).getName());


        for(Unternehmen u: aktionaerList.get(2).getUnternehmen().keySet()) {
            System.out.println(u.getName());
        }




    }

    public static void deleteUnternehmen(Unternehmen unternehmen) {

        for(Aktionaer a: unternehmen.getAktionaere().keySet()) {
            a.getUnternehmen().remove(unternehmen);
        }
        unternehmenList.remove(unternehmen);


    }


}
