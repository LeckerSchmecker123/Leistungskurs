package blatt08;

import java.util.Scanner;

public class SuchenUndErsetzen2 {

    public static String ersetzen (String wort, String ersetzten, String ersatz) {
        char [] ersetzenKlein = ersetzten.toCharArray();
        char [] ersatzKlein = ersatz.toCharArray();

        ersetzten = ersetzten.toUpperCase();
        ersatz = ersatz.toUpperCase();

        char [] ersetzenGross = ersetzten.toCharArray();
        char [] ersatzGross = ersatz.toCharArray();

        char [] charr = wort.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] == ersetzenKlein[i]) {
                charr[i] = ersatzKlein[i];
            } else if (charr[i] == ersetzenGross[i]) {
                charr[i] = ersatzGross[i];
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
