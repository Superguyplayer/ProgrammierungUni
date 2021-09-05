package s2.vorlesung.a16.antrago;


public class Antrago {

    public static void main(String[] args) {

        Kurs k1 = AntragoTools.createKurs("MSI20/01", "Peter", "Thomas", "Hugo", "Lena");


        Modul JuGrdVinf = new Modul("Juristische Grundlagen der Verwaltungsinformatik");
        Modul RfV = new Modul("Rahmen für Verwaltungshandeln");
        Modul GrdlIT = new Modul("Allgemeine Grundlagen der Verwaltungsnformatik");
        Modul GrdlProg = new Modul("Grundlagen der Programmierung");

        TeilModul AVR = new TeilModul("Allgemeines Verwaltungsrecht", 3, k1.getStudierende());
        TeilModul KmnR = new TeilModul("Kommunalrecht", 4, k1.getStudierende());

        TeilModul Gov = new TeilModul("Governance", 1, k1.getStudierende());
        TeilModul GeSoz = new TeilModul("Grundlagen empirischer Sozialforschung", 2, k1.getStudierende());
        TeilModul PolWiss = new TeilModul("Politikwissenschaften", 2, k1.getStudierende());

        TeilModul ITArch = new TeilModul("Grundlagen der IT-Architektur", 2, k1.getStudierende());
        TeilModul SoftEng = new TeilModul("Grundlagen der Software-Architektur", 3, k1.getStudierende());

        TeilModul Prog = new TeilModul("Programmierung", 4, k1.getStudierende());
        TeilModul UebungProg1 = new TeilModul("ProgrammierÜbung 1", 2);
        TeilModul UebungProg2 = new TeilModul("ProgrammierÜbung 2", 2);

        UebungProg1.addStudent(k1.getStudierende().get(1));
        UebungProg2.addStudent(k1.getStudierende().get(2));




        JuGrdVinf.addTeilModule(AVR, KmnR);
        RfV.addTeilModule(Gov, GeSoz, PolWiss);
        GrdlIT.addTeilModule(ITArch, SoftEng);
        GrdlProg.addTeilModule(Prog, UebungProg1, UebungProg2);

        System.out.println(UebungProg1.getTeilnehmende().get(0).getName());


    }






}
