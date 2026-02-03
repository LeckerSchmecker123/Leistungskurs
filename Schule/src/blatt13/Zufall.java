package blatt13;

public class Zufall {

    public static double zufall (double b) {
        double zahl = Math.random() * b;
        return zahl;
    }

    public static int zufallGanz (int b) {
        int zahl = (int) (Math.random() * b);
        return zahl;
    }

    public static double zufall (double a, double b) {
        double zahl = a + Math.random() * (b - a);
        return zahl;
    }

    public static int zufallGanz (int a, int b) {
        int zahl = (int) (a + Math.random() * (b - a));
        return zahl;
    }

    public static int[] zufallArray (int l, int a, int b) {
        int[] array = new int[l];

        for (int i = 0; i < l; i++) {
            array[i] = zufallGanz(a, b);
        }
        return array;
    }

    public static void main (String[] args) {
        System.out.println(zufall(1.5));
        System.out.println(zufallGanz(10));
        System.out.println(zufall(1, 1.5));
        System.out.println(zufallGanz(5, 10));
        int[] array = zufallArray(10, 5, 10);
        blatt07.ArbeitMitArrays.printArray(array);
    }
}
