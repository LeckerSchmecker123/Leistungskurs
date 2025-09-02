package blatt03;

import java.util.Scanner;

public class Haendler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Anzahl der jeweiligen SD-Karten
        System.out.println("Wie viele normale SD-Karten wollen sie kaufen?");
        int anz_norm_sd_kar = sc.nextInt(); // normale SD-Karte // TODO: Beim einsetzten von negativen Werten gibt es Probleme
        System.out.println("Wie viele Mini SD-Karten wollen sie kaufen?");
        int anz_min_sd_kar = sc.nextInt(); // MiniSD-Karte // TODO: Beim einsetzten von negativen Werten gibt es Probleme
        System.out.println("Wie viele Micro SD-Karten wollen sie kaufen?");
        int anz_mic_sd_kar = sc.nextInt(); // MicroSD-Karte // TODO: Beim einsetzten von negativen Werten gibt es Probleme

        // Kosten der jeweiligen SD-Karten, beschriftung entspricht der beschriftung der Anzahl
        double pre_norm_sd_kar = 5;
        double pre_min_sd_kar = 8;
        double pre_mic_sd_kar = 12;

        //gesamtpreis
        double preis_gesamt = anz_norm_sd_kar * pre_norm_sd_kar + anz_min_sd_kar * pre_min_sd_kar + anz_mic_sd_kar * pre_mic_sd_kar;

        //Warenkorb:
        System.out.println("Der Preis für...");
        System.out.println(anz_norm_sd_kar + " normale SD-Karten");
        System.out.println(anz_min_sd_kar + " MiniSD-Karten");
        System.out.println(anz_mic_sd_kar + " MicroSD-Karten");
        System.out.println("...lautet " + preis_gesamt + " €");
    }
}