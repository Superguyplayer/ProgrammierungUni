package uebungsgruppe.ue1;

public class Methoden {


    public static void main(String[] args) {

        mitParametern("hai", timesTwo(2));


    }
    public static void ohneRueckgabe() {
        System.out.println("hi");
        System.out.println("bla");
    }

    private static void mitParametern(String word, int number) {
        System.out.println(word);
        System.out.println(number);
    }

    private static int timesTwo(int number) {
        return number * 2;
    }

    private static String addPoint(String word) {
        return word + "!";
    }

    private static int[] arrayTimesTwo(int[] array) {

        return null;
    }




}
