package blatt12;

public class InsertionSort {

    /**
     * Die Prozedur sortiert einen Array nachdem InsertionSort Prinzip
     * @param arr zu sortierendes Array
     * @return ausgabe des sortierten Arrays
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int einzusortierender_wert = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > einzusortierender_wert) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = einzusortierender_wert;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 1, 3, -10, 2};
        int[] arr2 = insertionSort(arr1);
        blatt07.ArbeitMitArrays.printArray(arr2);
    }
}
