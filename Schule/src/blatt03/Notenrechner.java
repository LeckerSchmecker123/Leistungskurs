package blatt03;

import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nutzer wird nach maximal- und erreichter Punktzahl gefragt
        System.out.println("Bitte gib die maximale Punktzahl ein.");
        double maximalPunktzahl = input.nextDouble();
        System.out.println("Bitte gib deine erreichte Punktzahl ein.");
        double erreichtePunktzahl = input.nextDouble();

        //Fehlerüberprüfung der Eingaben des Nutzers
        if (maximalPunktzahl <= 0) {
            System.out.println("Fehler: Die maximale Punktzahl muss größer als 0 sein.");
            System.exit(0);
        } else if (erreichtePunktzahl > maximalPunktzahl) {
            System.out.println("Fehler: Erreichte Punktzahl darf nicht größer als maximale Punktzahl sein.");
            System.exit(0);
        } else if (erreichtePunktzahl < 0) {
            System.out.println("Fehler: Erreicht Punktzahl darf nicht negativ sein.");
            System.exit(0);
        }

        // Punkte in Anteil (%) umrechnen
        double Anteil = (erreichtePunktzahl / maximalPunktzahl) * 100;

        // Note bestimmen
        int note;
        if (Anteil >= 85) {
            note = 1;
        } else if (Anteil >= 70) {
            note = 2;
        } else if (Anteil >= 55) {
            note = 3;
        } else if (Anteil >= 39) {
            note = 4;
        } else if (Anteil >= 17) {
            note = 5;
        } else {
            note = 6;
        }

        //Ausgabe
        System.out.printf("%.2f %% erreicht. %n", Anteil);
        System.out.println("Note: " + note + "\n");

        //Gratulation bei voller Punktzahl
        if (erreichtePunktzahl == maximalPunktzahl) {
            System.out.println("Herzlichen Glückwunsch zur vollen Punktzahl. Du Genie!");
        }

    }
}
