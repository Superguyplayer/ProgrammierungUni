package s2.uebung.u9;

public class Aufgabe_2 {
    public static void main(String[] args) {

        //Long sum = 0L;
        long sum = 0;
        long time = System.nanoTime();
        for (long i = 1; i <= Integer.MAX_VALUE; i++) {

            sum += i;

        }

        time = System.nanoTime() - time;

        System.out.println(time / 1000000 + "ms");

        System.out.println();
        System.out.println(sum);


    }

}
