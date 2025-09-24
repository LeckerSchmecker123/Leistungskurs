package blatt06;

import java.util.Scanner;

public class NotenlisteMitArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wie viele Noten möchten Sie eingeben?");
        int anzahlNoten = input.nextInt();
        if (anzahlNoten == 0) {
            System.exit(0);
        }
        while (anzahlNoten < 0) {
            System.out.println("Wie viele Noten möchten Sie eingeben?");
            anzahlNoten = input.nextInt();
        }

        int[] noten = new int[anzahlNoten];
        /*
        noten[0] = 2;
        noten[1] = 2;
        noten[2] = 3;
        noten[3] = 1;
        noten[4] = 1;
        noten[5] = 4;
        noten[6] = 1;
        noten[7] = 2;
        noten[8] = 3;
        noten[9] = 5;
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Geben Sie eine Note ein");
            noten[i] = input.nextInt();
            while (noten[i] < 0 || noten[i] > 6) {
                System.out.println("Geben Sie eine Note ein");
                noten[i] = input.nextInt();
            }
        }

        //Ausgabe für die Noten bei jedem Index
        System.out.println("\nNotenausgabe:");
        for (int i = 0; i <= noten.length -1; i++) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
        }

        //Ausgabe für die Noten bei jedem Index (rückwärts)
        System.out.println("\nNotenausgabe (rückwärts):");
        for (int i = noten.length - 1; i >= 0; i--) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
        }

        //Ausgabe für den Notendurchschnitt
        int summe = 0;

        //alle Noten werden addiert
        for (int i = 0; i < noten.length; i++) {
            summe += noten[i];
        }

        //Summe wird in einen double umgerechnet und mit der Noten Anzahl verrechnet
        double durchschnittNoten = (double) summe / noten.length;

        System.out.println("\nDer Notendurchschnitt ist: " + durchschnittNoten);
    }
}
