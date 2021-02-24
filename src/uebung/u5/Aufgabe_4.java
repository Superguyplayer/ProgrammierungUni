package uebung.u5;

public class Aufgabe_4 {
    public static void main(String[] args) {

        int[] arr = bubbleSort(new int[]{2, 5, 4, 1, 1, 74, 8, 4, 7, 8, 4, 5, 1, 10});
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    private static int[] bubbleSort(int[] arrayToSort) {
        int j;
        for (int k : arrayToSort) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] < arrayToSort[i + 1]) {
                    continue;
                }
                j = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i + 1];
                arrayToSort[i + 1] = j;

            }
        }
        return arrayToSort;
    }


}
