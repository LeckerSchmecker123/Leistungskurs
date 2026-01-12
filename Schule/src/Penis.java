import schisch_visualizer.SchischVisualizer;

public class Penis {

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        //x = 14
        //y = 16

        char[][] feld = blatt14.MultiArrays.createEmpty2DArray(15, 17);
        sv.step(feld);

        feld[2][16] = '1';
        feld[3][16] = '1';
        feld[11][16] = '1';
        feld[12][16] = '1';
        sv.step(feld);

        feld[1][15] = '1';
        feld[4][15] = '1';
        feld[10][15] = '1';
        feld[13][15] = '1';
        sv.step(feld);

        feld[0][14] = '1';
        feld[4][14] = '1';
        feld[10][14] = '1';
        feld[14][14] = '1';
        sv.step(feld);

        feld[0][13] = '1';
        feld[4][13] = '1';
        feld[10][13] = '1';
        feld[14][13] = '1';
        sv.step(feld);

        feld[1][12] = '1';
        feld[4][12] = '1';
        feld[10][12] = '1';
        feld[13][12] = '1';
        sv.step(feld);

        feld[2][11] = '1';
        feld[3][11] = '1';
        feld[4][11] = '1';
        feld[10][11] = '1';
        feld[11][11] = '1';
        feld[12][11] = '1';
        sv.step(feld);

        feld[4][10] = '1';
        feld[10][10] = '1';
        sv.step(feld);

        feld[4][9] = '1';
        feld[5][10] = '1';
        feld[6][10] = '1';
        feld[7][10] = '1';
        feld[8][10] = '1';
        feld[9][10] = '1';
        feld[10][9] = '1';
        sv.step(feld);

        feld[4][8] = '1';
        feld[10][8] = '1';
        sv.step(feld);

        feld[4][7] = '1';
        feld[7][7] = '1';
        feld[10][7] = '1';
        sv.step(feld);

        feld[5][6] = '1';
        feld[7][6] = '1';
        feld[9][6] = '1';
        sv.step(feld);

        feld[6][5] = '1';
        feld[7][5] = '1';
        feld[8][5] = '1';
        sv.step(feld);

        for (int i = 7; i > 2; i--) {
            feld[7][i] = '0';
            feld[7][i - 1] = '0';
            feld[7][i - 2] = '0';
            feld[5][i - 1] = '0';
            feld[9][i - 1] = '0';
            feld[6][i - 2] = '0';
            feld[8][i - 2] = '0';

            feld[4][i - 1] = '1';
            feld[7][i - 1] = '1';
            feld[10][i - 1] = '1';

            feld[5][i - 2] = '1';
            feld[7][i - 2] = '1';
            feld[9][i - 2] = '1';

            feld[6][i - 3] = '1';
            feld[7][i - 3] = '1';
            feld[8][i - 3] = '1';

            sv.step(feld);
        }

        sv.start();
    }
}
