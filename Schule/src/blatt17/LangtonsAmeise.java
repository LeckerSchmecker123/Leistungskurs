package blatt17;

import schisch_visualizer.SchischVisualizer;

public class LangtonsAmeise {

    static SchischVisualizer sv = new SchischVisualizer();
    static char[][] spielfeld = blatt14.MultiArrays.createEmpty2DArray(100, 100);

    public static void initRandom(double w) {
        blatt14.Simulationen.fuellen(spielfeld, '0', 1);
        blatt14.Simulationen.fuellen(spielfeld, '1', w / 100);
        sv.step(spielfeld);
    }

    public static void ameisenSim () {}

    public static void main(String[] args) {
        initRandom(20);
        sv.start();
    }
}
