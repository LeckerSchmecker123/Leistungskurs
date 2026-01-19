package blatt15;

import schisch_visualizer.SchischVisualizer;

public class Farben {

    static char[][] spielfeld;
    static int[] spielerPosX = new int[8];
    static int[] spielerPosY = new int[8];

    //a)
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


    //b)
    public static void startPositionen (int[] spielerPosX, int[] spielerPosY) {
        //Team 1 linke seite -> position < als feld / 2 -> math.random * feld / 2
        //Team 2 rechte seite -> position > als feld / 2 -> feld / 2 + math.random * feld / 2

        //Team 1 (0-3)
        for (int i = 0; i <= 3; i++) {
            int x = (int) (Math.random() * spielfeld.length / 2);
            int y = (int) (Math.random() * spielfeld[0].length);
            spielerPosX[i] = x;
            spielerPosY[i] = y;
            while (spielfeld[spielerPosX[i]][spielerPosY[i]] == '8') {
                x = (int) (Math.random() * spielfeld.length / 2);
                y = (int) (Math.random() * spielfeld[0].length);
                spielerPosX[i] = x;
                spielerPosY[i] = y;
            }
            spielfeld[spielerPosX[i]][spielerPosY[i]] = 'P';
        }

        //Team 2 (4-7)
        for (int i = 4; i <= 7; i++) {
            int x = (int) (spielfeld.length / 2 + Math.random() * spielfeld.length / 2);
            int y = (int) (Math.random() * spielfeld[0].length);
            spielerPosX[i] = x;
            spielerPosY[i] = y;
            while (spielfeld[spielerPosX[i]][spielerPosY[i]] == '8') {
                x = (int) (spielfeld.length / 2 + Math.random() * spielfeld.length / 2);
                y = (int) (Math.random() * spielfeld[0].length);
                spielerPosX[i] = x;
                spielerPosY[i] = y;
            }
            spielfeld[spielerPosX[i]][spielerPosY[i]] = 'P';
        }
    }


    //c)
    public static int zaehlen7(char[][] spielfeld) {
        int count = 0;
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == '7') {
                    count++;
                }
            }
        }
        return count;
    }

    public static int zaehlen9 (char[][] spielfeld) {
        int count = 0;
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == '9') {
                    count++;
                }
            }
        }
        return count;
    }
    //d)
    public static void respawn (int spieler) {
        spieler --;
        // wenn spieler 0 - 3 dann '7'
        // wenn spieler 4 - 7 dann '9'

        spielfeld[spielerPosX[spieler]][spielerPosY[spieler]] = ' ';


        int newX;
        int newY;

        newX = (int) (Math.random() *  spielfeld.length);
        newY = (int) (Math.random() * spielfeld[0].length);

        if (spieler < 4) {
            while (spielfeld[newX][newY] != '7') {
                newX = (int) (Math.random() * spielfeld.length);
                newY = (int) (Math.random() * spielfeld[0].length);
            }
        }
        if (spieler > 3) {
            while (spielfeld[newX][newY] != '9') {
                newX = (int) (Math.random() * spielfeld.length);
                newY = (int) (Math.random() * spielfeld[0].length);
            }
        }


        spielerPosX[spieler] = newX;
        spielerPosY[spieler] = newY;

        spielfeld[spielerPosX[spieler]][spielerPosY[spieler]] = 'P';

    }


    //e)
    public static int reihenfolge (int a) {
        int[] spielerreihenfolge = new int[69] ;


        return a;
    }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();

        initialisiereSpielfeld(10, 10);
        sv.step(spielfeld);

        startPositionen(spielerPosX, spielerPosY);
        sv.step(spielfeld);

        blatt14.Simulationen.fuellen(spielfeld, '7', 0.4 , ' ');
        sv.step(spielfeld);

        blatt14.Simulationen.fuellen(spielfeld, '9', 0.2, ' ');
        sv.step(spielfeld);

        System.out.println("alt:");
        System.out.println(spielerPosX[0]);
        System.out.println(spielerPosY[0]);

        respawn(1);
        System.out.println("neu");
        System.out.println(spielerPosX[0]);
        System.out.println(spielerPosY[0]);
        sv.step(spielfeld);


        sv.start();

    }
}
