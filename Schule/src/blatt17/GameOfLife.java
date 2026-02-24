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
        blatt14.Simulationen.fuellen(spielfeld, '4', 1);
        blatt14.Simulationen.fuellen(spielfeld, '9', w);
    }

    public static char[][] weiter(char[][] charr) {
        char[][] feldNeu = MultiArrays.copy2DCharArray(charr);
        for (int x = 0; x < charr.length; x++) {
            for (int y = 0; y < charr[x].length; y++) {

                // wenn tote zelle drei lebende Nachbaren hat -> wird wiederbelebt
                int count = blatt14.Simulationen.zaehlenAcht(charr, x, y, false, '9');
                if (charr[x][y] == '4') {
                    if (count == 3) {
                        feldNeu[x][y] = '9';
                    }
                } else if (charr[x][y] == '9') {
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

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initSpielfeld(100, 100);

        initRandom(0.3);
        sv.step(spielfeld);

        char[][] feldNeu = weiter(spielfeld);

        for (int i = 0; i < 500; i++) {
            spielfeld = MultiArrays.copy2DCharArray(feldNeu);
            feldNeu = weiter(spielfeld);
            sv.step(spielfeld);
        }
        sv.start();
    }
}