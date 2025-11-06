package blatt09;

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

    public static void main(String[] args) {
        System.out.println(istPrim(17));
        System.out.println(istPrim(9));
    }
}
