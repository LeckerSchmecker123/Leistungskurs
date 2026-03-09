package blatt17;

import schisch_visualizer.SchischVisualizer;

public class LangtonsAmeise {
//TODO: Nicht ansatzweise fertig
    static SchischVisualizer sv = new SchischVisualizer();
    static char[][] spielfeld = blatt14.MultiArrays.createEmpty2DArray(10, 10);


    public static void ameisenSim (double w, int z) {
        blatt14.Simulationen.fuellen(spielfeld, '0', 1);
        blatt14.Simulationen.fuellen(spielfeld, '1', w / 100);
        sv.step(spielfeld);

        int[] ameisePos = new int[2];
        ameisePos[0] = spielfeld.length / 2;
        ameisePos[1] = spielfeld[0].length / 2;

        spielfeld[ameisePos[0]][ameisePos[1]] = 'V';
        sv.step(spielfeld);

        char erstesFeld = blatt14.Simulationen.getSueden(spielfeld, ameisePos[0], ameisePos[1], false);
        spielfeld[ameisePos[0]][ameisePos[1]] = '0';
        ameisePos[1]++;
        spielfeld[ameisePos[0]][ameisePos[1]] = 'V';
        if (erstesFeld == '0') {
            ameisePos[0]++;
            spielfeld[ameisePos[0]][ameisePos[1]] = '<';

        }

        for  (int i = 0; i < z; i++) {
            char[][] feldNeu = blatt14.MultiArrays.copy2DCharArray(spielfeld);

            if (spielfeld[ameisePos[0]][ameisePos[1]] == 'V') {
                char suedFeld = blatt14.Simulationen.getSueden(spielfeld, ameisePos[0], ameisePos[1], false);
                spielfeld[ameisePos[0]][ameisePos[1] + 1] = 'V';
            }
        }
    }

    public static void main(String[] args) {
        ameisenSim(15, 10);
        sv.start();
    }
}
