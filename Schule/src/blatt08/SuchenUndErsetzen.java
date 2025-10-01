package blatt08;

import java.util.Scanner;

public class SuchenUndErsetzen {

    /**
     * Die Prozedur tauscht einen angegebenen Buchstaben durch einen anderen angegebenen Buchstaben aus, die Wörter, in denen der Tausch stattfindet, wird ebenfalls angeben
     * @param str Wort(e)
     * @param ersetzen Buchstabe der ersetzt werden soll
     * @param ersatz Buchstabe der den alen Buchstabe ersetzten soll
     * @return ausgabe der Wort(e) mit dem neuen Buchstaben
     */
    public static String ersetzen (String str, String ersetzen, String ersatz) {
        char[] ersetzenKlein = ersetzen.toCharArray();
        char[] ersatzKlein = ersatz.toCharArray();

        ersetzen = ersetzen.toUpperCase();
        ersatz = ersatz.toUpperCase();

        char [] ersetzenGross = ersetzen.toCharArray();
        char [] ersatzGross = ersatz.toCharArray();

        char [] charr = str.toCharArray();
        for  (int i = 0; i < charr.length; i++) {
            if (charr[i] == ersetzenKlein[0]) {
                charr[i] = ersatzKlein[0];
            } else if (charr[i] == ersetzenGross[0]) {
                charr[i] = ersatzGross[0];
            }
        }
        String s = new String(charr);
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein oder mehrere Wörter ein:");
        String worte = input.nextLine();
        System.out.println("Bitte geben Sie nun den Buchstaben ein der ersetzt werden soll:");
        String ersetzen = input.nextLine();
        System.out.println("Bitte geben Sie nun den Buchstaben, der den alten ersetzten soll");
        String ersatz = input.nextLine();
        System.out.println(ersetzen(worte, ersetzen, ersatz));
    }
}
