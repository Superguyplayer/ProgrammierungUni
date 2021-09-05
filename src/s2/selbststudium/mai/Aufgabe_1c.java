package s2.selbststudium.mai;

public class Aufgabe_1c {
    public static void main (String[] args) {
        System.out.print("Bitte geben Sie Ihr Alter ein: "); int alter; alter = new java.util.Scanner(System.in).nextInt();
        if(alter == 6){
            System.out.println("Auf in die Schule");
        }else if(alter == 18){
            System.out.println("Ab in die Uni");
        }else if(alter == 67){
            System.out.println("Ruhestand");
        }else{
            System.out.println("Man hat mit " + alter + " immer was zu tun");
        }

    }
}

