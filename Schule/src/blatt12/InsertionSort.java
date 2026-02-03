package blatt12;

public class InsertionSort {

    /**
     * Die Prozedur sortiert einen Array nachdem InsertionSort Prinzip
     * @param arr zu sortierendes Array
     * @return ausgabe des sortierten Arrays
     */
    public static int[] insertionSort(int[] arr) {
        int[] arrSort = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            int element = arr[i];
            int count = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[j] < element) {
                    count++;
                }
            }
            // Falls das Element bereits besetzt ist, wird der Wert um eins nach rechts ins nächste Element gepackt
            while (arrSort[count] != 0) {
                count++;
            }
            arrSort[count] = element;
        }
        return arrSort;
    }

    /**
     * Die Prozedur sortiert nach dem Insertion Sort Prinzip, aber hier als In-Place-Algorithmus
     * @param arr zu sortierendes Array
     */
    public static int[] insertionSortInPlace(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Vor dem Sortieren:");
        int[] arr1 = new int[] {4, 1, 3, -10, 2, 3, 4, 2};
        blatt07.ArbeitMitArrays.printArray(arr1);

        System.out.println("Insertion Sort:");
        int[] arr2 = insertionSort(arr1);
        blatt07.ArbeitMitArrays.printArray(arr2);

        System.out.println("Insertion Sort in Place:");
        insertionSortInPlace(arr1);
        blatt07.ArbeitMitArrays.printArray(arr1);
    }
}
