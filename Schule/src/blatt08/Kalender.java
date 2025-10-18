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

    /**
     *Die Prozedur baut aus den 3 angegebenen Parametern (Tag, Monat, Jahr) das Datum zusammen
     * @param tag Ganzzahl 1
     * @param monat Ganzzahl 2
     * @param jahr Ganzzahl 3
     * @return Ausgabe des Datums
     */
    public static String zuDatum (int tag, int monat, int jahr) {
        String datum = "";

        if (tag < 10) {
            datum = tag + "0";
        }
        datum = datum + tag;
        datum = datum + ".";

        if (monat < 10) {
            datum = datum + "0";
        }
        datum = datum + monat;
        datum = datum + ".";

        datum = datum + jahr;

        return datum;
    }

    //TODO: Wenn 31. gibt es probleme
    public static String naechsterTag (String datum) {
        int tag = getTag(datum);
        int monat = getMonat(datum);
        int jahr = getJahr(datum);

        int [] tageImMonat = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (istSchaltjahr(jahr)) {
            tageImMonat[1] = 29;
        }

        tag++;

        if (tag > tageImMonat[monat - 1]) {
            tag = 1;
            monat++;
            if (monat > 12) {
                monat = 1;
                jahr++;
            }
        }
        return zuDatum(tag, monat, jahr);
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
        System.out.println("\nDas Datum zusammengebaut:");
        System.out.println(zuDatum(11, 2,2025));
        System.out.println("\nNächster Tag:");
        System.out.println(naechsterTag("30.11.2025"));
    }
}
