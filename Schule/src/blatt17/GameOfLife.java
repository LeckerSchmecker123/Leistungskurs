package blatt17;

import blatt14.MultiArrays;
import blatt14.Simulationen;
import schisch_visualizer.SchischVisualizer;

public class GameOfLife {

    static char[][] spielfeld;

    // 4 = rot
    // 9 = grün

    public static void initSpielfeld(int h, int b) {
        spielfeld = blatt14.MultiArrays.createEmpty2DArray(h, b);
    }

    public static void initRandom(double w) {
        //blatt14.Simulationen.fuellen(spielfeld, '9', w / 10);
        blatt14.Simulationen.fuellen(spielfeld, '4', w);
    }

    public static char[][] weiter() {
        char[][] feldNeu = MultiArrays.copy2DCharArray(spielfeld);
        for (int x = 0; x < spielfeld.length; x++) {
            for (int y = 0; y < spielfeld[x].length; y++) {

                // wenn tote zelle drei lebende Nachbaren hat -> wird wiederbelebt
                int count = blatt14.Simulationen.zaehlenAcht(spielfeld, x, y, false, '9');
                if (spielfeld[x][y] == '4') {
                    if (count == 3) {
                        feldNeu[x][y] = '9';
                    }
                } else if (spielfeld[x][y] == '9') {
                    if (count < 2) { // wenn lebende Zelle weniger als 2 lebende Nachbaren hat -> stirbt an Einsamkeit
                        feldNeu[x][y] = '4';
                    } else if (count > 3) { // wenn lebende Zelle mehr als 3 lebende Nachbaren hat -> stirbt an Überbevölkerung
                        feldNeu[x][y] = '4';
                    } else if (count == 2 || count == 3) { // wenn lebende Zelle 2/3 lebende Nachbarn hat -> bleibt am Leben
                        continue;
                    }
                }
            }
        }
        return feldNeu;
    }

    public static void osziellierend (int auswahl) {
        int x = spielfeld.length / 2;
        int y  = spielfeld[0].length / 2;

        if (auswahl >= 0) {
            spielfeld[x - 1][y] = '9';
            spielfeld[x][y] = '9';
            spielfeld[x + 1][y] = '9';
        } else if (auswahl == 1) {
            spielfeld[x - 1][y] = '9';
            spielfeld[x][y] = '9';
            spielfeld[x + 1][y] = '9';
        } else if (auswahl == 2) {
            spielfeld[x - 1][y - 1] = '9';
            spielfeld[x - 2][y - 1] = '9';
            spielfeld[x][y - 2] = '9';
            spielfeld[x][y] = '9';
            spielfeld[x + 1][y] = '9';
            spielfeld[x - 1][y + 1] = '9';
        } else if (auswahl == 3) {
            spielfeld[x][y] = '9';
            spielfeld[x][y - 1] = '9';
            spielfeld[x][y + 1] = '9';
            spielfeld[x - 1][y] = '9';
            spielfeld[x - 1][y - 1] = '9';
            spielfeld[x - 1][y - 2] = '9';
        } else if (auswahl == 4) {
            spielfeld[x + 1][y] = '9';
            spielfeld[x + 1][y + 1] = '9';
            spielfeld[x][y + 1] = '9';
            spielfeld[x - 2][y - 1] = '9';
            spielfeld[x - 2][y - 2] = '9';
            spielfeld[x - 1][y - 2] = '9';
        } else if (auswahl == 5) {
            spielfeld[x][y] = '9';
            spielfeld[x + 1][y + 1] = '9';
            spielfeld[x + 1][y + 2] = '9';
            spielfeld[x][y + 2] = '9';
            spielfeld[x - 2][y] = '9';
            spielfeld[x - 3][y - 1] = '9';
            spielfeld[x - 3][y - 2] = '9';
            spielfeld[x - 2][y - 2] = '9';
        } else if (auswahl == 6) {
            spielfeld[x + 4][y] = '9';
            spielfeld[x + 4][y - 1] = '9';
            spielfeld[x + 4][y - 2] = '9';
            spielfeld[x + 4][y + 1] = '9';
            spielfeld[x + 4][y + 2] = '9';
            spielfeld[x + 5][y - 1] = '9';
            spielfeld[x + 5][y] = '9';
            spielfeld[x + 5][y + 1] = '9';
            spielfeld[x + 6][y] = '9';
            spielfeld[x - 3][y] = '9';
            spielfeld[x - 3][y - 1] = '9';
            spielfeld[x - 3][y - 2] = '9';
            spielfeld[x - 3][y + 1] = '9';
            spielfeld[x - 3][y + 2] = '9';
            spielfeld[x - 4][y - 1] = '9';
            spielfeld[x - 4][y] = '9';
            spielfeld[x - 4][y + 1] = '9';
            spielfeld[x - 5][y] = '9';
        } else if (auswahl == 7) {

        } else if (auswahl == 8) {

        } else {
            spielfeld[x - 1][y] = '9';
            spielfeld[x][y] = '9';
            spielfeld[x + 1][y] = '9';
        }
    }


    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initSpielfeld(100, 100);

        initRandom(1);
        sv.step(spielfeld);

        osziellierend(6);
        sv.step(spielfeld);

        char[][] feldNeu = weiter();

        for (int i = 0; i < 500; i++) {
            spielfeld = MultiArrays.copy2DCharArray(feldNeu);
            feldNeu = weiter();
            sv.step(spielfeld);
        }
        sv.start();
    }
}