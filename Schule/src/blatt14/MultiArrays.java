package blatt14;

public class MultiArrays {

    /**
     * Die Prozedur gibt einen 2D-Integer-Array aus
     * @param arr auszugebener Array
     */
    public static void print2DArray (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
    }

    /**
     * Die Prozedur gibt einen 2D-Double-Array aus
     * @param arr auszugebener Array
     */
    public static void print2DArray (double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
    }

    /**
     * Die Prozedur gibt einen 2D-Character-Array aus
     * @param arr auszugebener Array
     */
    public static void print2DArray (char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
    }

    public static int[][] createRandom2DIntArrays (int a, int b, int p, int q) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * p + q);
            }
        }
        return arr;
    }

    public static double[][] createRandom2DDoubleArrays (int a, int b) {
        double[][] arr = new double[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Ausgabe Int-Array:");
        int[][] arrInt = {{1, 2, 5, 6, 7, 45, 2}, {2,  4, 5, 6, 87, 4, 5}, {12, 3, 7, 8}};
        print2DArray(arrInt);
        System.out.println("Ausgabe Double-Array:");
        double[][] arrDouble = {{1,65.235,4.65,2.11,4.34,6.43}, {2.465,21.5,2.4352}};
        print2DArray(arrDouble);
        System.out.println("Ausgabe Char-Array:");
        char[][] arrChar = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        print2DArray(arrChar);
        System.out.println("Ausgabe Random-Array:");
        int[][] randomArr = createRandom2DIntArrays(10, 5, 10, 5);
        print2DArray(randomArr);
        System.out.println("Random-Double-Array:");
        double[][] randomCharr = createRandom2DDoubleArrays(5, 5);
        print2DArray(randomCharr);
    }
}
