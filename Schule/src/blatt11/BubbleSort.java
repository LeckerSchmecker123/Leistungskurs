package blatt11;

import blatt07.ArbeitMitArrays;
import com.sun.security.jgss.GSSUtil;

public class BubbleSort {

    /**
     * Die Prozedur tauscht zwei angegebene Elemente eines Arrays
     * @param arr angegebener Array
     * @param i 1. Element
     * @param j 2. Element
     */
    public static void swap (int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main (String [] args) {

        System.out.println("Swap Methode:");
        int [] arr = new int [] {1, 2, 3, 4, 5};
        blatt07.ArbeitMitArrays.printArray(arr);
        swap (arr, 0, arr.length - 1);
        blatt07.ArbeitMitArrays.printArray(arr);

        System.out.println("\nBubble Sort:");
        int [] arr1 = new int [] {-10000000, 1, 3, 2, -3, 0, 15, 1, 2, 3, 10,};
        blatt07.ArbeitMitArrays.printArray(arr1);
        bubbleSort (arr1);
        blatt07.ArbeitMitArrays.printArray(arr1);

        System.out.println(ArbeitMitArrays.istSortiert(arr1));
    }
}
