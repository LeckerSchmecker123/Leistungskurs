package blatt08;

public class Kalender {

    /**
     * Die Prozedur gibt den Tag eines angegebenen Datums aus
     * @param datum (als String)
     * @return Ausgabe des Tages
     */
    public static int getTag (String datum) {
        char[] c = datum.toCharArray();

        int zehner = c[0] - '0';
        int einer = c[1] - '0';

        int tag = zehner * 10 + einer;
        return tag;
    }

    /**
     * Die Prozedur gibt den Monat eines angegebenen Datums aus
     * @param datum (als String)
     * @return Ausgabe des Monats
     */
    public static int getMonat (String datum) {
        char[] c = datum.toCharArray();

        int zehner = c[3] - '0';
        int einer = c[4] - '0';

        int monat = zehner * 10 + einer;
        return monat;
    }

    /**
     * Die Prozedur gibt das Jahr eines angegebenen Datums aus
     * @param datum (als String)
     * @return Ausgabe des Jahres
     */
    public static int getJahr (String datum) {
        char[] c = datum.toCharArray();

        int tausender =  c[6] - '0';
        int hunderter = c[7] - '0';
        int zehner = c[8] - '0';
        int einer = c[9] - '0';

        int jahr = tausender * 1000 + hunderter * 100 + zehner * 10 + einer;
        return jahr;
    }

    /**
     * Die Prozedur überprüft, ob es sich um ein Schaltjahr handelt
     * @param jahr Jahreszahl (als int)
     * @return Ausgabe als boolean
     */
    public static boolean istSchaltjahr (int jahr) {
        if (jahr % 400 == 0) {
            return true;
        } else if (jahr % 4 == 0) {
            return true;
        } else if (jahr % 100 == 0) {
            return false;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println("Der Tag:");
        System.out.println(getTag("17.10.2025"));
        System.out.println("\nDer Monat:");
        System.out.println(getMonat("17.10.2025"));
        System.out.println("\nDas Jahr:");
        System.out.println(getJahr("17.10.2025"));
        System.out.println("\nIst Schaltjahr?:");
        System.out.println(istSchaltjahr(2024));
    }
}
