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

    public static int addieren (int [] arr1, int [] arr2) {
        System.out.print("[ ");
        for (int i = 0; i <= arr1.length - 1; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + " | ");
            }
        }
        System.out.println(" ]");

        System.out.print("[ ");
        for (int i = 0; i <= arr2.length - 1; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + " | ");
            }
        }
        System.out.println(" ]");

        int length = 0; //TODO: länge fixen (fehlermeldung bei nicht gleich langem Array)
        if (arr1.length > arr2.length) {
            length = arr1.length;
        } else if (arr2.length > arr1.length) {
            length = arr2.length;
        } else  {
            length = arr1.length;
        }
        int [] newArr = new int[length];

        System.out.print("[ "); // TODO: ausgabe schön machen
        for (int i = 0; i <= newArr.length; i++) { //TODO: Array richtig befüllen
            newArr[i] = arr1[i] +  arr2[i];
            System.out.print(" " + newArr[i]);
        }
        System.out.println("");
        return 0; // TODO: richtiges return angeben
    }

    public static void main (String[]args){
        System.out.println("Integer:");
        int [] inte = new int [] {1, 8, 7, 2, 2, 22};
        printArray(inte);
        double [] doub = new double[] {7.5, 6.8, -1.5555555555, 9, 32.3};
        System.out.println("Double:");
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
        int [] arr1 = new int [] {1, 2, 3, 4, 5, 6};
        int [] arr2 = new int [] {1, 2, 3, 4, 5, 6};
        System.out.println(addieren(arr1, arr2));
    }
}
