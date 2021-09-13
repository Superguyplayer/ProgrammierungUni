package datenbanken;

import java.util.HashMap;
import java.util.Scanner;

public class PostleitZahlen {

    static HashMap<String, String> data = new HashMap<>();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        addTown("58675", "Hemer");
        addTown("58636", "Iserlohn");
        addTown("58706", "Menden");


        do {

            System.out.println("Postleitzahl: ");

            String plz = scanner.nextLine();

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
        String plz = s.nextLine();
        System.out.println("Stadtname: ");
        String name = s.nextLine();

        data.put(plz, name);

    }

    private static void addTown(String plz, String name){
        data.put(plz, name);

    }

}
