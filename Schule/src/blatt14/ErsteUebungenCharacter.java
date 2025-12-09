package blatt14;

import schisch_visualizer.SchischVisualizer;

public class ErsteUebungenCharacter {
    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] spielfeld = blatt14.MultiArrays.createEmpty2DArray(11, 14);
        sv.step(spielfeld);

        for (int i = 0; i < spielfeld.length; i++) {
            spielfeld[i][0] = '1';
            sv.step(spielfeld);
        }
        for (int i = 0; i < spielfeld[0].length; i++) {
            spielfeld[spielfeld.length - 1][i] = '1';
            sv.step(spielfeld);
        }
        for (int i = spielfeld.length - 1; i >= 0; i--) {
            spielfeld[i][spielfeld[0].length - 1] = '1';
            sv.step(spielfeld);
        }
        for (int i = spielfeld[0].length - 1; i >= 0; i--) {
            spielfeld[0][i] = '1';
            sv.step(spielfeld);
        }

        for (int i = 0; i <= 11; i++) {
            spielfeld[2][i] = '1';
            sv.step(spielfeld);
        }
        for (int i = 0; i <= 11; i++) {
            spielfeld[spielfeld.length - 3][i] = '1';
            sv.step(spielfeld);
        }

        spielfeld[3][11] = '1';
        sv.step(spielfeld);
        spielfeld[4][11] = '1';
        sv.step(spielfeld);
        spielfeld[7][11] = '1';
        sv.step(spielfeld);
        spielfeld[6][11] = '1';
        sv.step(spielfeld);

        for (int i = 4; i <= 6; i++) {
            spielfeld[i][3] = '1';
            sv.step(spielfeld);
        }
        for (int i = 4; i <= 6; i++) {
            spielfeld[i][5] = '1';
            sv.step(spielfeld);
        }

        spielfeld[5][12] = 'P';
        sv.step(spielfeld);

        sv.start();
    }
}
