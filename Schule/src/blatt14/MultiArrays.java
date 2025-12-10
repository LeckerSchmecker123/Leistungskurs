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
        System.out.println();
    }

    /**
     * Die Prozedur gibt einen 2D-Double-Array aus
     * @param arr auszugebener Array
     */
    public static void print2DArray (double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
        System.out.println();
    }

    /**
     * Die Prozedur gibt einen 2D-Character-Array aus
     * @param arr auszugebener Array
     */
    public static void print2DArray (char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
        System.out.println();
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

    /**
     * Die Funktion überprüft, ob zwei übergebene 2D-Character-Arrays identisch sind
     * @param arr1 1. 2D-Array
     * @param arr2 2. 2D-Array
     * @return true, wenn identisch, wenn nicht identisch dann false
     */
    public static boolean istIdentisch (char[][] arr1, char[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Die Funktion kopiert einen 2D-Character-Array
     * @param og zu kopierender Array (original Array)
     * @return ausgabe des kopierten Arrays
     */
    public static char[][] copy2DCharArray (char[][] og) {
        char[][] copy = new char[og.length][og[0].length];
        for (int i = 0; i < og.length; i++) {
            for (int j = 0; j < og[i].length; j++) {
                copy[i][j] = og[i][j];
            }
        }
        return copy;
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
        System.out.println("Ist Identisch?:");
        char[][] charr1 = {{'a', 'b', 'c', 'd', 'e', 'f'}, {'a', 'b', 'c', 'd', 'e', 'f'}};
        char[][] charr2 = {{'a', 'b', 'c', 'd', 'e', 'f'}, {'a', 'b', 'c', 'd', 'e', 'f'}};
        print2DArray(charr1);
        print2DArray(charr2);
        System.out.println(istIdentisch(charr1, charr2));
        System.out.println("Kopiertes 2D-Character-Array:");
        char[][] og = {{'a', 'n', 'c', 'd'},{'a', 'n', 'c', 'd'}};
        print2DArray(og);
        char[][] copy = copy2DCharArray(og);
        print2DArray(copy);
        og[1][1] = 'f';
        print2DArray(copy);
        print2DArray(og);
    }
}
