package blatt09;

public class Teiler {

    /**
     * Die Prozedur überprüft, ob der Teiler ein teiler der Zahl ist
     * @param zahl Zahl 1
     * @param teiler Zahl 2 (Teiler)
     * @return Ausgabe (true/false)
     */
    public static boolean istTeiler (int zahl, int teiler) {
        if (zahl <= 0 || teiler <= 0) {
            return false;
        }

        return (zahl % teiler == 0);
    }

    /**
     * Die Prozedur gibt alle Teiler einer angegebenen Zahl
     * @param zahl Zahl deren Teiler ausgegeben werden
     */
    public static void alleTeiler (int zahl) {
        System.out.print("Alle Teiler der Zahl " + zahl + ": ");
        for (int i = 1; i <= zahl; i++) {
            if (istTeiler(zahl, i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Die Prozedur zählt die Anzahl an Teilern einer Zahl
     * @param zahl Zahl (Integer)
     * @return Ausgabe der Anzahl an Teilern
     */
    public static int anzahlTeiler (int zahl) {
        int anzahl = 0;
        for (int i = 1; i <= zahl; i++) {
            if (istTeiler(zahl, i)) {
                anzahl ++;
            }
        }
        return anzahl;
    }

    /**
     * Die Prozedur gibt alle Teiler einer Zahl aus
     * @param zahl Zahl 1
     * @return Ausgabe aller Teiler (Array)
     */
    public static int[] teiler (int zahl) {
        int anzahl = anzahlTeiler(zahl);
        int[] teilerListe = new int[anzahl];

        int index = 0;
        for (int i = 1; i <= zahl; i++) {
            if (istTeiler(zahl, i)) {
                teilerListe[index] = i;
                index++;
            }
        }
        return teilerListe;
    }

    public static void main(String[] args) {

        System.out.println("Ist das ein Teiler?:");
        System.out.println(istTeiler(2,3));
        System.out.println("Alle Teiler:");
        alleTeiler(2);
        System.out.println("Anzahl der Teiler:");
        System.out.println(anzahlTeiler(2));
        System.out.println("Teilerliste:");
        int [] liste = teiler(6);
        for (int t : liste) {
            System.out.print(t + " ");
        }
    }
}