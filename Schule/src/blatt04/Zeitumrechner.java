package blatt04;

import java.util.Scanner;

public class Zeitumrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gebe eine positive Zahl an Sekunden ein:");
        int sekunden = input.nextInt();

        int zaehler = 0;

        int tage = 0;
        int stunden = 0;
        int minuten = 0;

        while (sekunden >= 86400) {
            sekunden -= 86400;
            tage++;
            zaehler++;
        }

        while (sekunden >= 3600) {
            sekunden -= 3600;
            stunden++;
            zaehler++;
        }

        while (sekunden >= 60) {
            sekunden -= 60;
            minuten++;
            zaehler++;
        }

        System.out.println(tage + " Tage, " +  stunden + " Stunden, " +  minuten + " Minuten, " + sekunden + " Sekunden");
        System.out.println("Schleifendurchläufe: " + zaehler);

        // b) Das obenstehende Beispiel brauch 126 Schleifendurchläufe
        // c) Man kann das Programm mit weniger als 10 Rechenoperatoren lösen, indem man Division und Modulo verwendet. Somit stimmt die Aussage
    }
}
