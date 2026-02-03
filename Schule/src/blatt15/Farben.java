package blatt15;

import schisch_visualizer.SchischVisualizer;

import java.util.Arrays;

public class Farben {

    static char[][] spielfeld;
    static int[] spielerPosX = new int[8];
    static int[] spielerPosY = new int[8];
    static int[] reihenfolge;

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
    public static int zaehlen(int team) {
        char farbe = ' ';

        if  (team == 1) {
            farbe = '7';
        }
        else if (team == 2) {
            farbe = '9';
        }


        int count = 0;
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == farbe) {
                    count++;
                }
            }
        }
        return count;
    }

    //d)
    public static void respawn (int spieler) {
        //TODO: Komplette funktion überarbeiten
        spieler --;
        // wenn spieler 0 - 3 dann '7'
        // wenn spieler 4 - 7 dann '9'

        //spielfeld[spielerPosX[spieler]][spielerPosY[spieler]] = ' ';

        int newX;
        int newY;

        spielerPosX[spieler] = -1;
        spielerPosY[spieler] = -1;


        newX = (int) (Math.random() *  spielfeld.length);
        newY = (int) (Math.random() * spielfeld[0].length);

        if (zaehlen(1) > 0 || zaehlen(2) > 0) {
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
        } else {
            System.out.println("Es gibt keine Felder des Teams mehr");
        }

        spielerPosX[spieler] = newX;
        spielerPosY[spieler] = newY;

        spielfeld[spielerPosX[spieler]][spielerPosY[spieler]] = 'P';
    }


    //e)
    public static int[] reihenfolge () {
        //TODO: verhindern das ein spieler zweifach vorkommt
        int[] spielerreihenfolge = new int[8];
        int[] kopier = new int[8];

        for (int i = 0; i <= spielerreihenfolge.length - 1; i++) {
            int b =  (int) (Math.random() * 8);
            spielerreihenfolge[i] = b;
            kopier[i] = b;
            for (int j = 0; j <= spielerreihenfolge.length - 1; j++) {
                if (spielerreihenfolge[i] == kopier[j]) {
                    spielerreihenfolge[i] = (int) (Math.random() * 8);
                }
            }
        }

        return spielerreihenfolge;
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

        System.out.println("Reihenfolge:");
        System.out.println(Arrays.toString(reihenfolge()));

        sv.start();

    }
}