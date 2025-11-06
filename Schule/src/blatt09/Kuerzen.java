package blatt09;

public class Kuerzen {

    /**
     * Die Prozedur überprüft, ob ein angegebener Bruch noch kürzbar ist
     * @param z Zahl 1 (Zähler)
     * @param n Zahl 2 (Nenner)
     * @return ausgabe (true/false)
     */
    public static boolean istKuerzbar(int z, int n) {

        int[] zListe = Teiler.teiler(z);
        int[] nListe = Teiler.teiler(n);

        int l = 0;

        if (z >= n) {
            l = z;
        } else {
            l = n;
        }

        for (int i = 1; i < l - 1; i++) {
            if (zListe[i] == nListe[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Die Prozedur kürzt einen Bruch so weit es möglich ist
     * @param z Zähler
     * @param n Nenner
     */
    public static void kuerzen(int z, int n) {
        int a = z;
        int b = n;

        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        int ggt = a;

        z = z /ggt;
        n = n / ggt;

        System.out.println("Gekürzter Bruch: " + z + "/" + n);
    }

    public static void main(String[] args) {
        System.out.println("istKuerzbar:");
        System.out.println(istKuerzbar(4,2));
        kuerzen(5,6);
    }
}