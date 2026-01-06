package blatt14;

import schisch_visualizer.SchischVisualizer;

public class OasenSuche {

    static char[][] spielfeld;

    public static void initialisiereSpielfeld (int h, int b) {
        spielfeld = blatt14.MultiArrays.createEmpty2DArray(h, b);
    }

    public static void zufallsPositionSpieler (char[][] charr) {
        if (charr != null) {
            charr[(int) (Math.random() * spielfeld.length)][(int) (Math.random() * spielfeld[0].length)] = 'P';
        }
    }


    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
    }
}
