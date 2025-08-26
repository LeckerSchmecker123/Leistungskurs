package blatt01;

public class Haendler {

    public static void main(String[] args) {

        // Anzahl der jeweiligen SD-Karten
        int anz_norm_sd_kar = 9; // normale SD-Karte
        int anz_min_sd_kar = 5; // MiniSD-Karte
        int anz_mic_sd_kar = 0; // MicroSD-Karte

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

        //Zusatzfrage 1:
        // Man brauch 6 Variablen mindestens, da man für die Anzahl der 3 SD-Karten und für den Wert der 3 SD-Karten jeweils 3 Variablen braucht.
        // Eine Variable für den Gesamtpreis ist nicht notwendig, da man die Formel für den Gesamtpreis anstelle der Variable nutzen kann.
        //Zusatzfrage 2:
        // Für die Anzahl der jeweiligen SD-Karten ist ein Integer am sinnvollsten, da man nur ganze SD-Karten erwerben kann und ein Integer nur halb so viel Speicher verbraucht wie ein Double.
        // Jedoch ist für den Einzelwahrenpreis und der Gesamtpreis ein Double besser, da der Preis nachkommastellen enthalten kann.
        //Zusatzfrage 3:
        // Ein Problem das auftreten könnte ist, dass für die Anzahl ein negativer Wert zugewiesen wird und somit der Preis falsch ist bzw. auch im negativen Bereich liegt
    }
}
