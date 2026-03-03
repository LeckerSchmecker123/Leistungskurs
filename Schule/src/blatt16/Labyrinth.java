package blatt16;

import schisch_visualizer.SchischVisualizer;

import java.io.File;

public class Labyrinth {

    static SchischVisualizer sv = new SchischVisualizer();

    public char[][] leseLabyrinth (int laby) {
        if (laby < 10) {
            return Stroeme.readCharArray("laby0" + laby + ".txt", "Schule" + File.separator + "src" + File.separator + "blatt16");
        }
        return Stroeme.readCharArray("laby" + laby + ".txt", "Schule" + File.separator + "src" + File.separator + "blatt16");

    }


    public static void main(String[] args) {

    }
}
