package s2.uebungsgruppe.projekte;

public class Pi {


    public static void main(String[] args) {



        System.out.println(calcPi(15000000000L));
    }

    private static double calcPi(long numberOfTerms) {

        double divider = 3;
        double result = 1;
        for (long i = 0; i < numberOfTerms; i++) {
            result -= (1 / divider);
            divider += 2;
            result += (1 / divider);
            divider += 2;
            if(i % 100000000 == 0) {
                float d = (float) i / (float) numberOfTerms;
                System.out.println(d *100 + "%");
            }
        }

        return result * 4;



    }


}
