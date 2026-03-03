package blatt17;

import schisch_visualizer.SchischVisualizer;

public class Waldentwicklung {

    static SchischVisualizer sv = new SchischVisualizer();

    public static void waldentwicklung (double p, double q, int z) {
        p = p / 100;
        q = q / 100;

        char[][] feld = blatt14.MultiArrays.createEmpty2DArray(100, 100);

        for (int i = 0; i < z; i++) {
            char[][] feldalt = blatt14.MultiArrays.copy2DCharArray(feld);
            for (int j = 0; j < feld.length; j++) {
                for (int k = 0; k < feld[0].length; k++) {

                    if (feldalt[j][k] == ' ') {
                        int nachbarBaum = blatt14.Simulationen.zaehlenVier(feld, j, k, false, '9');
                        if (Math.random() < p + nachbarBaum * 0.02) {
                            feld[j][k] = '9';
                        }
                    }
                    if (feldalt[j][k] == '9') {
                        if (Math.random() < q) {
                            feld[j][k] = '4';
                        }
                    }
                    if (feldalt[j][k] == '4') {
                        feld[j][k] = ' ';
                        if (k >= 1 && feldalt[j][k - 1] == '9') {
                            feld[j][k - 1] = '4';
                        }
                        if (j <= 98 && feldalt[j + 1][k] == '9') {
                            feld[j + 1][k] = '4';
                        }
                        if (k <= 98 && feldalt[j][k + 1] == '9') {
                            feld[j][k + 1] = '4';
                        }
                        if (j >= 1 && feldalt[j - 1][k] == '9') {
                            feld[j - 1][k] = '4';
                        }
                    }
                }
            }
            sv.step(feld);
        }
        sv.start();
    }


    public static void main(String[] args) {
        waldentwicklung(0.3, 0.1, 8000);
    }
}
