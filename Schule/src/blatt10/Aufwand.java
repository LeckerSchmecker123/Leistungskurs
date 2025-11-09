package blatt10;

public class Aufwand {

    /**
     * Die Prozedur zählt die Anzahl an Umbrüchen
     * @param charr eingabe des Textes
     * @return ausgabe der Anzahl an Umbrüchen
     */
    public static int zahlDerUmbrueche(char[] charr) {
        int count = 0;
        for (int i = 0; i < charr.length-1; i++) {
            if (charr[i] == '.') {
                if (charr[i+1] == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Die Prozedur fügt einem Eingegebenen String Zeilenumbrüche hinzu
     * @param s Eingabe des "Textes"
     * @return Ausgabe als Character Arrays (mit Zeilen umbrüchen)
     */
    public static char[] umbrueche(String s) {
        char[] charr = s.toCharArray(); // Verwandelt die eingabe in einen Character Array um
        int c = zahlDerUmbrueche(charr); // speichert die Zahl der Umbrüche des oberen Arrays
        int k = 0; // Neue Variable
        char[] charr2 = new char[charr.length+c]; //Neuer Array mit der länge des ersten Arrays + die Anzahl an Umbrüchen
        while (c > 0) { // while-schleife, solange Anzahl an Umbrüchen größer als 0 ist
            for (int i = 0; i < charr.length-1; i++) { // for-Schleife, solange bis i == charr-length-1 ist
                if (charr[i] == '.') { // Wenn erster Array an Element (i) ein "." ist
                    if (charr[i+1] == ' ') { // Wenn erster Array an Element (i+1) " " ist
                        charr2[i] = charr[i]; // Wird Array 2 Element (i) gleich Array 1 Element (i) gesetzt
                        charr2[i+1] = '\n'; // Und an Array 2 Stelle (i+1) wird ein Zeilenumbruch hinzugefügt
                        k++; // k wird um eins erhöht
                        c--; // Anzahl an Umbrüchen wird um eins gesenkt
                    } else { // Wenn Array 1 Element (i) nicht " " ist
                        charr2[i+k] = charr[i]; // Wird Array 2 Element (i+k) gleich Array 1 Element (i)
                    }
                } else { // Wenn Array 1 an Element (i) kein "." ist
                    if (charr[i] == ' ' && charr[i-1] == '.') { // Wenn Array 1 Element (i) gleich " " und Array 1 Element (i-1) gleich "." ist
                        // Nichts
                    } else { // Wenn nicht
                        charr2[i] = charr[i]; // Dann ist Array 2 Element (i) = Array 1 Element (i)
                    }
                }
            }
        }

        return charr2; // Ausgabe von Array 2

    }

    public static void main(String[] args) {
        String eingabe = "Nussecken (1 Blech). Teig: 300g Mehl, 1 TL Backpulver, 130g Zucker, 1 Pkg Vanillezucker, 2 EL Leinsamen, 6 EL Wasser, 130g Margarine/Butter. Belag: 200g Margarine/Butter, 6 EL Wasser, 200g Zucker, 1 Pkg Vanillezucker, 400g gemahlene Haselnüsse/Mandeln. Außerdem: Erdbeer-/Himbeermarmelade, 100g Zartbitterschokolade. Schritte: Die Leinsamen in 6 EL Wasser aufquellen lassen. Alle Zutaten für den Teig vermischen und zu einem relativ weichen Teig zerkneten, dann auf einem mit Backpapier ausgelegten Backbleck dünn drücken. Marmelade dünn auf dem Teig verteilen. Margarine, Wasser, Zucker und Vanillezucker in einem Topf schmelzen und kurz aufkochen lassen, dann Nüsse dazugeben und alles vermischen. Belag auf der Marmelade verteilen. Im vorgeheizten Backofen bei 180° C Ober/Unterhitze oder 160° C Umluft ca. 30 Minuten backen. Glasur erwärmen und mit einem Löffel über das Blech sprenkeln (so wird es gleichmäßiger und geht schneller als die Ecken in Schokolade zu tunken), abkühlen lassen. Zu Ecken schneiden.";
        char[] ausgabe = umbrueche(eingabe); // legt einen Character Array an mit Zeilenumbrüchen von der Funktion umbrueche
        System.out.println(eingabe); // Gibt den String "eingabe aus"
        System.out.println(ausgabe); // Gibt den Character Array mit Zeilenumbruch veränderung aus

        /*
        b)Der Aufwand ist bei beiden Funktionen O(n)
        c)Es gibt einen relativ hohen Speicheraufwand, da man den eingegebenen String in ein Array aus Character umwandelt und Zeilenumbrüche hinzufügt
        d)Das Programm ist sehr stabil, da es lediglich Character überprüft und in bestimmten fällen ein Zeilenumbruch hinzufügt
        e)Best-case: Es gibt keine Punkte, wodurch nur die Character überprüft werden müssen, aber keine Zeilen umbrüche hinzugefügt werden müssen. O(n)
          Worst-case: Nach jedem Punkt folgt ein Leerzeichen, bei jedem Punkt wird ein Umbruch eingefügt. Dennoch O(n), aber mit Schreiboperationen
         */

    }
}
