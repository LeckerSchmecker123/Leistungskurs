package blatt15;

import schisch_visualizer.SchischVisualizer;

public class Farben {

    static char[][] spielfeld;
    static int[] spielerPosX = new int[8];
    static int[] spielerPosY = new int[8];

    public static void initialisiereSpielfeld(int h, int b) {
        if (h % 2 != 0) {
            h++;
        }
        if (b % 2 != 0) {
            b++;
        }

        spielfeld = blatt14.MultiArrays.createEmpty2DArray(h, b);

        for (int i = 0; i < spielfeld.length; i++) {
            spielfeld[i][0] = '8';
        }
        for (int i = 0; i < spielfeld.length; i++) {
            spielfeld[i][spielfeld[0].length - 1] = '8';
        }
        for (int i = 0; i < spielfeld[0].length; i++) {
            spielfeld[0][i] = '8';
        }
        for (int i = 0; i < spielfeld[0].length; i++) {
            spielfeld[spielfeld.length - 1][i] = '8';
        }
    }

    public static void startPositionen () {}

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();

        initialisiereSpielfeld(80, 80);
        sv.step(spielfeld);

        sv.start();

    }
}
