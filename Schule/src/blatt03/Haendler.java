package blatt03;

import java.util.Scanner;

public class Haendler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Anzahl der jeweiligen SD-Karten
        System.out.println("Wie viele normale SD-Karten wollen sie kaufen?");
        int anz_norm_sd_kar = sc.nextInt(); // normale SD-Karte
        // Aufgabe 2
        if (anz_norm_sd_kar < 0) {
            System.out.println("Dies ist eine fehlerhafte Angabe.");
            System.exit(0);
        } else if (anz_norm_sd_kar > 50) {
            anz_norm_sd_kar = 50;
            System.out.println("Sie haben das maximum von 50 normalen SD-Karten erreicht");
        }
        System.out.println("Wie viele Mini SD-Karten wollen sie kaufen?");
        int anz_min_sd_kar = sc.nextInt(); // MiniSD-Karte
        // Aufgabe 2
        if (anz_min_sd_kar < 0) {
            System.out.println("Dies ist eine fehlerhafte Angabe.");
            System.exit(0);
        } else if (anz_min_sd_kar > 50) {
            anz_min_sd_kar = 50;
            System.out.println("Sie haben das maximum von 50 MiniSD-Karten erreicht");
        }
        System.out.println("Wie viele Micro SD-Karten wollen sie kaufen?");
        int anz_mic_sd_kar = sc.nextInt(); // MicroSD-Karte
        // Aufgabe 2
        if (anz_mic_sd_kar < 0) {
            System.out.println("Dies ist eine  fehlerhafte Angabe.");
            System.exit(0);
        } else if (anz_mic_sd_kar > 50) {
            anz_mic_sd_kar = 50;
            System.out.println("Sie haben das maximum von 50 MicroSD-Karten erreicht");
        }


        // Kosten der jeweiligen SD-Karten, beschriftung entspricht der beschriftung der Anzahl
        double pre_norm_sd_kar = 5;
        double pre_min_sd_kar = 8;
        double pre_mic_sd_kar = 12;

        //Gesamtpreis
        double preis_gesamt = anz_norm_sd_kar * pre_norm_sd_kar + anz_min_sd_kar * pre_min_sd_kar + anz_mic_sd_kar * pre_mic_sd_kar;
        // Gesamtpreis mit Rabatt
        double rabatt = preis_gesamt * 0.15;
        double rabattPreis = preis_gesamt - rabatt;

        //Warenkorb:
        System.out.println("Der Preis für...");
        System.out.println(anz_norm_sd_kar + " normale SD-Karten");
        System.out.println(anz_min_sd_kar + " MiniSD-Karten");
        System.out.println(anz_mic_sd_kar + " MicroSD-Karten");
        System.out.printf("...lautet %.2f € %n%n", preis_gesamt);

        if (anz_norm_sd_kar + anz_min_sd_kar + anz_mic_sd_kar > 15) {
            System.out.println("Da Sie insgesamt mehr als 15 SD-Karten kaufen erhalten sie 15% Rabatt");
            System.out.printf("Der Preis mit Rabatt lautet %.2f%n", rabattPreis);
        }
    }
}