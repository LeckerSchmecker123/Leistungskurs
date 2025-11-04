package blatt09;

public class Kuerzen {

    /**
     * Die Prozedur überprüft, ob ein angegebener Bruch noch kürzbar ist
     * @param z Zahl 1 (Zähler)
     * @param n Zahl 2 (Nenner)
     * @return ausgabe (true/false)
     */
    public static boolean istKuerzbar(int z, int n) {

        int [] zListe = Teiler.teiler(z);
        int [] nListe = Teiler.teiler(n);

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

    public static void kuerzen(int z, int n) {
        //TODO: Die aufgabe halt machen
    }

    public static void main(String[] args) {
        System.out.println("istKuerzbar:");
        System.out.println(istKuerzbar(4,2));
    }
}