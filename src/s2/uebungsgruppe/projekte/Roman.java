package s2.uebungsgruppe.projekte;

public class Roman {
    public static void main(String[] args) {
        System.out.println(toRoman(999));

    }

    public static String toRoman(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

        int[] numbers = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

        int count = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {

            count = number / numbers[i];
            number = number % numbers[i];
            while (count > 0) {
                stringBuilder.append(romans[i]);
                count--;
            }
        }
        return stringBuilder.toString();
    }

}


