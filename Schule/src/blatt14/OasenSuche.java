package blatt14;

import schisch_visualizer.SchischVisualizer;

public class OasenSuche {

    static char[][] spielfeld;
    static int spielerZeile;
    static int spielerSpalte;
    static int energie;

    public static void initialisiereSpielfeld(int hoehe, int breite) {
        spielfeld = blatt14.MultiArrays.createEmpty2DArray(hoehe, breite);
        blatt14.Simulationen.fuellen(spielfeld, '0', 1);
    }

    public static void zufallsPositionSpieler() {
        if (spielfeld == null) {
            return;
        }

        spielerZeile = (int) (Math.random() * spielfeld.length);
        spielerSpalte = (int) (Math.random() * spielfeld[0].length);

        spielfeld[spielerZeile][spielerSpalte] = 'P';
    }

    public static void wasserZufall(double wahrscheinlichkeit) {
        if (spielfeld == null) {
            return;
        }

        blatt14.Simulationen.fuellen(spielfeld, '2', wahrscheinlichkeit, '0');
    }

    public static void steinZufall(double wahrscheinlichkeit) {
        if (spielfeld == null) {
            return;
        }

        blatt14.Simulationen.fuellen(spielfeld, 'A', wahrscheinlichkeit, '0');
    }

    public static int randUeberschreitung(int wert, int max) {
        if (wert < 0) return max - 1;
        if (wert >= max) return 0;
        return wert;
    }

    //TODO: das bewegen funktioniert nicht!!!!!!!!!!!!
    public static void findeWasser(int energiewert) {
        if (spielfeld == null) {
            return;
        }

        energie = energiewert;

        while (energie > 0) {

            if (blatt14.Simulationen.zaehlenVier(spielfeld, spielerZeile, spielerSpalte, true, '2') != 0) {
                System.out.println("Wasser gefunden!!!");
                break;
            }

            int richtung = (int) (Math.random() * 4);
            int neueZeile = spielerZeile;
            int neueSpalte = spielerSpalte;

            if (richtung == 1) { // Norden
                neueZeile--;
            }
            if (richtung == 2) { // Süden
                neueZeile++;
            }
            if (richtung == 3) { // Westen
                neueSpalte--;
            }
            if (richtung == 4) { // Osten
                neueSpalte++;
            }

            neueZeile = randUeberschreitung(neueZeile, spielfeld.length);
            neueSpalte = randUeberschreitung(neueSpalte, spielfeld[0].length);


            if (spielfeld[neueZeile][neueSpalte] == '2' || spielfeld[neueZeile][neueSpalte] == 'A') {
                continue;
            }


            // Feld markieren
            spielfeld[spielerZeile][spielerSpalte] = '4';

            // Bewegung
            spielerZeile = neueZeile;
            spielerSpalte = neueSpalte;
            spielfeld[spielerZeile][spielerSpalte] = 'P';

            energie--;
        }

        System.out.println("Keine Energie mehr – Aufgabe beendet.");
    }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();

        initialisiereSpielfeld(60, 60);
        sv.step(spielfeld);

        zufallsPositionSpieler();
        sv.step(spielfeld);

        wasserZufall(0.03);
        sv.step(spielfeld);

        steinZufall(0.15);
        sv.step(spielfeld);

        while (energie > 0) {
            findeWasser(50);
            sv.step(spielfeld);
        }

        sv.start();
    }
}
