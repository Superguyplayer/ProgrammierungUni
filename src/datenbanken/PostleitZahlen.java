package datenbanken;

import java.util.HashMap;
import java.util.Scanner;

public class PostleitZahlen {

    static HashMap<Integer, String> data = new HashMap<>();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        addTown(58675, "Hemer");
        addTown(58636, "Iserlohn");
        addTown(58706, "Menden");


        do {

            System.out.println("Postleitzahl: ");
            int plz = scanner.nextInt();

            if(data.containsKey(plz)) {

                System.out.println("Zur Postleitzahl " + plz + " gehört die Stadt " + data.get(plz));
            }else{
                System.out.println("Nicht vorhanden");
            }

            System.out.println("nochmal?(y/n)");


        } while (!scanner.next().equals("n"));



    }


    private static void addTown(){

        Scanner s = new Scanner(System.in);
        System.out.println("Postleitzahl: ");
        int plz = s.nextInt();
        System.out.println("Stadtname: ");
        String name = s.nextLine();

        data.put(plz, name);

    }

    private static void addTown(int plz, String name){
        data.put(plz, name);

    }

}
