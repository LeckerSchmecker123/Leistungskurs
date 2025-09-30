package blatt07;

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
    }
}
