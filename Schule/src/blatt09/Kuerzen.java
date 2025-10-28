package blatt09;

public class Kuerzen {

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

    public static void main(String[] args) {
        System.out.println("istKuerzbar:");
        System.out.println(istKuerzbar(3,2));
    }
}