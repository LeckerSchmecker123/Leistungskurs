package blatt12;

public class SelectionSort {

    /**
     * Die Prozedur sortiert einen Array nachdem SelectionSort Prinzip
     * @param arr zu sortierendes Array
     */
    public static void selectionSort(int[] arr) {
        for (int j = 1; j <= arr.length - 1; j++) {
            int tmp = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > tmp) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,-2,4,8,56,45,-87,76,-5,653,-863,86,35,3,-3,-1,6,6,1};
        selectionSort(arr);
        blatt07.ArbeitMitArrays.printArray(arr);
    }
}
