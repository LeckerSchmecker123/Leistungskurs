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

    /**
     * Die Prozedur erstellt einen 2D-Array mit der länge a * b und füllt diesen mit zufälligen Werten, welche zwischen zwei grenzen liegen
     * @param a 1. Länge des Arrays
     * @param b 2. Länge des Arrays
     * @param p untere grenze des zufälligen Wertes
     * @param q obere grenze des zufälligen Wertes
     * @return ausgabe des 2D-Arrays
     */
    public static int[][] createRandom2DIntArrays (int a, int b, int p, int q) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * p + q);
            }
        }
        return arr;
    }

    /**
     * Die Prozedur erstellt einen 2D-Array mit der länge a * b und füllt diesen mit zufälligen Werten, welche zwischen 0 und 1 liegen
     * @param a 1. Länge des Arrays
     * @param b 2. Länge des Arrays
     * @return ausgabe des 2D-Arrays
     */
    public static double[][] createRandom2DDoubleArrays (int a, int b) {
        double[][] arr = new double[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random();
            }
        }
        return arr;
    }

    /**
     * Erstellt einen durchnummerierten 2D-Array
     * @param a 1. Länge des Arrays
     * @param b 2. Länge des Arrays
     * @return ausgabe des 2D-Arrays
     */
    public static int[][] createCountingArrays (int a, int b) {
        int[][] arr = new int[a][b];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        return arr;
    }

    /**
     * Erstellt einen mit Leerzeichen gefüllten 2D-Array
     * @param a 1. Länge des Arrays
     * @param b 2. Länge des Arrays
     * @return ausgabe des 2D-Arrays
     */
    public static char[][] createEmpty2DArray (int a, int b) {
        char[][] arr = new char[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }
        return arr;
    }

    public static boolean istIdentisch (char[][] arr1, char[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
        //TODO: Noch nicht fertig
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
        System.out.println("Counting Array: ");
        int[][] countingArr = createCountingArrays(5, 5);
        print2DArray(countingArr);
        System.out.println(countingArr[0][0]);
        System.out.println("Leerzeichen Array: ");
        char[][] emptyChar= createEmpty2DArray(10, 5);
        print2DArray(emptyChar);
    }
}
