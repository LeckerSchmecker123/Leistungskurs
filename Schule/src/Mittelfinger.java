import schisch_visualizer.SchischVisualizer;

public class Mittelfinger {

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        //x = 16
        //y = 22

        char[][] feld = blatt14.MultiArrays.createEmpty2DArray(16, 22);
        sv.step(feld);

        //Hand
        //1. Reihe
        for (int i = 6; i < feld.length - 3; i++) {
            feld[i][21] = '1';
        }
        sv.step(feld);

        //2. Reihe
        feld[5][feld[0].length - 2] = '1';
        feld[feld.length - 3][feld[0].length - 2] = '1';
        sv.step(feld);

        //3.Reihe
        for (int i = 5; i < feld.length - 2; i++) {
            feld[i][19] = '1';
        }
        sv.step(feld);

        //4. Reihe
        feld[5][18] = '1';
        feld[13][18] = '1';
        sv.step(feld);

        //5. Reihe
        feld[4][17] = '1';
        feld[13][17] = '1';
        sv.step(feld);

        //6. Reihe
        feld[4][16] = '1';
        feld[14][16] = '1';
        sv.step(feld);

        //7. Reihe
        feld[3][15] = '1';
        feld[14][15] = '1';
        sv.step(feld);

        //8. Reihe
        feld[3][14] = '1';
        feld[14][14] = '1';
        sv.step(feld);

        //9. Reihe
        feld[2][13] = '1';
        feld[15][13] = '1';
        sv.step(feld);

        //10. Reihe
        feld[2][12] = '1';
        feld[4][12] = '1';
        feld[15][12] = '1';
        sv.step(feld);

        //11. Reihe
        feld[1][11] = '1';
        feld[4][11] = '1';
        feld[15][11] = '1';
        sv.step(feld);

        //12. Reihe
        feld[0][10] = '1';
        feld[4][10] = '1';
        feld[12][10] = '1';
        feld[15][10] = '1';
        //sv.step(feld);

        //13. Reihe
        feld[0][9] = '1';
        feld[3][9] = '1';
        feld[4][9] = '1';
        feld[12][9] = '1';
        feld[15][9] = '1';
        sv.step(feld);

        //14. Reihe
        feld[0][8] = '1';
        feld[1][8] = '1';
        feld[2][8] = '1';
        feld[4][8] = '1';
        feld[7][8] = '1';
        feld[10][8] = '1';
        feld[12][8] = '1';
        feld[14][8] = '1';
        sv.step(feld);

        //15. Reihe
        feld[4][7] = '1';
        feld[7][7] = '1';
        feld[10][7] = '1';
        feld[12][7] = '1';
        feld[13][7] = '1';
        sv.step(feld);

        //16. Reihe
        feld[5][6] = '1';
        feld[6][6] = '1';
        feld[7][6] = '1';
        feld[10][6] = '1';
        feld[11][6] = '1';
        sv.step(feld);

        //Mittelfinger extension
        feld[8][5] = '1';
        feld[9][5] = '1';
        sv.step(feld);

        for (int i = 5; i > 0; i--) {
            feld[8][i] = '0';
            feld[9][i] = '0';
            feld[10][i] = '1';
            feld[7][i] = '1';
            feld[8][i - 1] = '1';
            feld[9][i - 1] = '1';
            sv.step(feld);
        }

        /*
        feld[8][5] = '0';
        feld[9][5] = '0';
        feld[10][5] = '1';
        feld[7][5] = '1';
        feld[8][4] = '1';
        feld[9][4] = '1';
        sv.step(feld);

        feld[8][4] = '0';
        feld[9][4] = '0';
        feld[10][4] = '1';
        feld[7][4] = '1';
        feld[8][3] = '1';
        feld[9][3] = '1';
        sv.step(feld);

        feld[8][3] = '0';
        feld[9][3] = '0';
        feld[10][3] = '1';
        feld[7][3] = '1';
        feld[8][2] = '1';
        feld[9][2] = '1';
        sv.step(feld);

         */


        //Faust
        /*
        for (int i = 7; i <= 10; i++) {
            feld[i][5] = '1';
        }
        sv.step(feld);

        for (int i = 7; i <= 10; i++) {
            feld[i][5] = '0';
        }
        sv.step(feld);

        //Mittelfinger (Schritt 1)
        for (int i = 3; i <= 5; i++) {
            feld[7][i] = '1';
        }
        for (int i = 3; i <= 5; i++) {
            feld[10][i] = '1';
        }
        sv.step(feld);

        for (int i = 8; i <= 9; i++) {
            feld[i][3] = '1';
        }
        sv.step(feld);

        for (int i = 8; i <= 9; i++) {
            feld[i][3] = '0';
        }
        sv.step(feld);

        //Mittelfinger (Schritt 2)
        feld[7][2] = '1';
        feld[10][2] = '1';
        sv.step(feld);

        feld[8][1] = '1';
        feld[9][1] = '1';
        sv.step(feld);
         */

        //Mittelfinger
        /*
        for (int i = 1; i <= 6; i++) {
            feld[7][i] = '1';
        }

        for (int i = 1; i <= 6; i++) {
            feld[10][i] = '1';
        }
        sv.step(feld);

        feld[8][0] = '1';
        feld[9][0] = '1';
        sv.step(feld);

         */

        blatt14.Simulationen.fuellen(feld, '0', 1, ' ');
        sv.step(feld);
        sv.start();
    }
}
