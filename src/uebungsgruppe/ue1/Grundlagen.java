package uebungsgruppe.ue1;


import java.util.Scanner; // importe

public class Grundlagen {
    public static void main(String[] args) {

        //Konsolenausgaben
        System.out.print(""); //ohne Umbruch
        System.out.println(); // mit Umbruch
        //in eclipse sysout Strg+Leertaste

        //Formatierte Ausgabe
        int j = 3;
        System.out.printf("Hi%sblabla", j);

        //primitive Datentypen
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 99999999999999L; //ganz lang... bis 2^63 - 1

        float f = 5.123456f;
        double d = 1.015165154d;

        boolean bool = false;


        char c = 'p';

        String str = "BlaBlaBla"; // nicht primitiv...

        //Strings verknüpfen mit +

        Scanner scan = new Scanner(System.in); // Inputstream auslesen

        str = scan.nextLine(); // nächste Zeile einlesen

        /*
            Zwei Strings einlesen Leertaste dazwischen und auf der Konsole ausgeben

         */


        //kontrollstrukturen

        /*
            if(BEDINGUNG) {
            auszuführendes...
            }

            if(BEDINGUNG) {
            auszuführendes...
            }else if(BEDINGUNG) {
            auszuführendes
            }

            if(BEDINGUNG) {
            auszuführendes...
            }else if(BEDINGUNG) {
            auszuführendes
            }else{
            auszuführendes
            }

        */


        if(i > l && l < d || str.equalsIgnoreCase("BlaBla")) {
            System.out.println("Hi");
        }else if(i == 2) {
            System.out.println("Tach");
        }else{
            System.out.println("NÖ");
        }


        switch(5) {
            case 1://doSmth
                break;              //was ist wenn weggelassen?
            case 2://soSmthElse
                break;
            default://wasauchimmer
                break;
        }

        //alternativ
        switch(4) {
            case 1 -> System.out.println("") ;
            case 2 -> System.out.println("..");
            //etc
            default -> System.out.println("...");

        }

        //arrays
        int[] arr = new int[10];
        String[] strArr = {"hi", "bla", "guten Morgen"};

        System.out.println(strArr.length);


        //schleifen

        for (int k = 0; k < strArr.length; k++) {
            System.out.print(strArr[k] + ", ");
        }

        for(String word: strArr) {
            System.out.println(word);
        }

        int counter = 0;
        while(counter < 5) {
            System.out.println(counter * 2);
            counter++;
        }

        do{
            System.out.println(counter / 2);
            counter++;
        }while(counter < 10);

        //array eingeben, array ausgeben




    }
}
