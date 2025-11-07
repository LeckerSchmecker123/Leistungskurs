package blatt09;

import java.util.Arrays;

public class Primzahlen {

    /**
     * Die Prozedur überprüft, ob es sich um eine Primzahl handelt oder nicht
     * @param zahl Zu überprüfende Zahl
     * @return ausgabe, wenn Primzahl dann true, sonst false
     */
    public static boolean istPrim(int zahl) {
        if (zahl <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Die Prozedur gibt alle Primzahl bis zu einer angegebenen Grenze aus
     * @param Grenze Zahl (Obergrenze)
     */
    public static void printPrim(int Grenze) {
        System.out.println("Alle Primzahlen bis " + Grenze + ":");

        for (int i = 2; i <= Grenze; i++) {
            if (istPrim(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Die Prozedur zählt die ersten n Primzahlen auf
     * @param n Anzahl an aufgezählten Primzahlen
     * @return Ausgabe des Arrays
     */
    public static int[] generierePrimzahlen (int n) {
        int[] primzahlen = new int[n];
        int zahl = 2;
        int count = 0;

        while (count < n) {
            if (istPrim(zahl)) {
                primzahlen[count] = zahl;
                count++;
            }
            zahl++;
        }

        return primzahlen;
    }

    public static void primfaktorzerlegung(int zahl) {
        System.out.print(zahl + " = ");
        int teiler = 2;

        while (zahl > 1) {
            if (zahl % teiler == 0) {
                System.out.print(teiler);
                zahl /= teiler;
                if (zahl > 1) System.out.print(" * ");
            } else {
                teiler++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(istPrim(17));
        System.out.println(istPrim(9));

        printPrim(17);

        int[] liste = generierePrimzahlen(1);
        System.out.println("Erste 10 Primzahlen: ");
        for (int p : liste) System.out.print(p + " ");
        System.out.println();
        System.out.println("Primfaktorzerlegung");
        primfaktorzerlegung(187);
    }
}
