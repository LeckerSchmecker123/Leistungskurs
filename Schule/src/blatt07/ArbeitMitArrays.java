package blatt07;

import java.util.Arrays;

public class ArbeitMitArrays {

    /**
     * Die Prozedur gibt den jeweiligen Wert aller Elemente eines Arrays als Integer aus
     * @param index angegebenes Array
     */
    public static void printArray (int [] index) {
        System.out.print("[ ");
        for (int i = 0; i <= index.length - 1; i++) {
            if (i == index.length - 1) {
                System.out.print(index[i]);
            } else {
                System.out.print(index[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur gibt den jeweiligen Wert aller Elemente eines Arrays als Integer aus
     * @param index angegebenes Array
     */
    public static void printArray (byte [] index) {
        System.out.print("[ ");
        for (int i = 0; i <= index.length - 1; i++) {
            if (i == index.length - 1) {
                System.out.print(index[i]);
            } else {
                System.out.print(index[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur gibt den jeweiligen Wert aller Elemente eines Arrays als Double aus
     * @param index angegebenes Array
     */
    public static void printArray (double [] index) {
        System.out.print("[ ");
        for (int i = 0; i <= index.length - 1; i++) {
            if (i == index.length - 1) {
                System.out.print(index[i]);
            } else {
                System.out.print(index[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur gibt den jeweiligen Wert aller Elemente eines Arrays als Boolean aus
     * @param index angegebenes Array
     */
    public static void printArray (boolean [] index) {
        System.out.print("[ ");
        for (int i = 0; i <= index.length - 1; i++) {
            if (i == index.length - 1) {
                System.out.print(index[i]);
            } else {
                System.out.print(index[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur gibt den jeweiligen Wert aller Elemente eines Arrays als Character aus
     * @param index angegebenes Array
     */
    public static void printArray (char [] index) {
        System.out.print("[ ");
        for (int i = 0; i <= index.length - 1; i++) {
            if (i == index.length - 1) {
                System.out.print(index[i]);
            } else {
                System.out.print(index[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur gibt den jeweiligen Wert aller Elemente eines Arrays als String aus
     * @param index angegebenes Array
     */
    public static void printArray (String [] index) {
        System.out.print("[ ");
        for (int i = 0; i <= index.length - 1; i++) {
            if (i == index.length - 1) {
                System.out.print(index[i]);
            } else {
                System.out.print(index[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur überprüft, ob das angegebene Array von klein nach groß sortiert ist
     * @param index Array
     * @return ausgabe als boolean (true/false)
     */
    public static boolean istSortiert (int [] index) {
        for (int i = 1; i <= index.length - 1; i++) {
            if (index[i-1] > index[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Die Prozedur addiert zwei Arrays
     * @param arr1 Array 1
     * @param arr2 Array 2
     * @return ausgabe eines neuen aufaddierten Arrays
     */
    public static int[] addieren (int [] arr1, int [] arr2) {
       int maxlang;

       if (arr1.length > arr2.length) {
           maxlang = arr1.length;
       }  else {
           maxlang = arr2.length;
       }

       int [] ausgabe = new int[maxlang];

       for (int i = 0; i < maxlang; i++) {
           int werta = 0;
           int wertb = 0;

           if (i < arr1.length) {
               werta = arr1[i];
           }
           if (i < arr2.length) {
               wertb = arr2[i];
           }
           ausgabe[i] = werta +  wertb;
       }

        System.out.print("[ ");
        for (int i = 0; i <= ausgabe.length - 1; i++) {
            if (i == ausgabe.length - 1) {
                System.out.print(ausgabe[i]);
            } else {
                System.out.print(ausgabe[i] + " | ");
            }
        }
        System.out.println(" ]");

       return ausgabe;

    }

    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach links (letzte Stelle wird zu zur ersten Stelle)
     * @param arr Array
     */
    public static void shiftLeft (int [] arr) {
        if (arr.length == 0) return;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");

        int zwischenSpeicher = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = zwischenSpeicher;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach rechts (erste Stelle wird zu zur letzten Stelle)
     * @param arr Array
     */
    public static void shiftRight (int [] arr) {
        if (arr.length == 0) return;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");

        int zwischenSpeicher = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = zwischenSpeicher;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach links (letzte Stelle wird mit 0 aufgefüllt)
     * @param arr Array
     */
    public static void shiftLeftAbsolute (int [] arr) {
        if (arr.length == 0) return;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach rechts (erste Stelle wird mit 0 aufgefüllt)
     * @param arr Array
     */
    public static void shiftRightAbsolute (int [] arr) {
        if (arr.length == 0) return;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;

        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }

    public static void main (String[]args){
        System.out.println("Integer:");
        int [] inte = new int [] {1, 8, 7, 2, 2, 22};
        printArray(inte);

        System.out.println("Double:");
        double [] doub = new double[] {7.5, 6.8, -1.5555555555, 9, 32.3};
        printArray(doub);

        System.out.println("Boolean:");
        boolean [] bool = new boolean[] {true, false, false, true, false, true};
        printArray(bool);

        System.out.println("Character:");
        char [] chars = new char[] {'a', 'b', 'c', '1', '2', '3'};
        printArray(chars);

        System.out.println("String:");
        String [] str = new String[] {"Haus", "!?!", "zwei", "3"};
        printArray(str);

        System.out.println("Ist das Array Sortiert?");
        int [] sort = new int [] {1, 2, 3, 8, 5, 6, 7, 8, 9};
        System.out.println(istSortiert(sort));

        System.out.println("Die zwei angegebenen Arrays addiert sieht so aus:");
        int [] arr1 = new int [] {-1, -9, 1, 0};
        int [] arr2 = new int [] {1, 2, 3, 4, 5, 6, 8, 2};
        printArray(arr1);
        printArray(arr2);
        addieren (arr1, arr2);

        System.out.println("Das Array um eins nach Links verschoben (erste Stelle ans ende)");
        int [] links = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shiftLeft(links);

        System.out.println("Das Array um eins nach Rechts verschoben (erste Stelle ans ende)");
        int [] rechts = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shiftRight(rechts);

        System.out.println("Das Array um eins nach Links verschoben (die letzte Stelle wird mit 0 aufgefüllt)");
        int [] absolutlinks =  new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shiftLeftAbsolute(absolutlinks);

        System.out.println("Das Array um eins nach Rechts verschoben (die erste Stelle wird mit 0 aufgefüllt)");
        int [] absolutRechts = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shiftRightAbsolute(absolutRechts);
    }
}
