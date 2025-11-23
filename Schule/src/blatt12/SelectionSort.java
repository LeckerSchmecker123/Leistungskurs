package blatt12;

public class SelectionSort {

    public static void SelectionSort(int[] arr) {
        for  (int i = 0; i <= arr.length - 1; i++) {
            int min = i;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    //TODO: Das Ganze ding fixen
    public static void main(String[] args) {
        System.out.println("Vor dem Sortieren:");
        int[] arr1 = new int[] {4, 1, 3, -10, 2, 3, 4, 2};
        blatt07.ArbeitMitArrays.printArray(arr1);

        System.out.println("Sortieren:");
        while (blatt07.ArbeitMitArrays.istSortiert(arr1) == false) {
            SelectionSort(arr1);
            blatt07.ArbeitMitArrays.printArray(arr1);
        }
    }
}
