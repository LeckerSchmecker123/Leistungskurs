package blatt14;

import schisch_visualizer.SchischVisualizer;

public class Simulationen {

    /**
     * Die Methode füllt ein 2D-Character-Array mit einem übergebenen Zeichen, mit einer übergebenen Wahrscheinlichkeit
     * @param charr 2D-Array
     * @param ein Einzusetzendes Zeichen
     * @param ws Wahrscheinlichkeit
     */
    public static void fuellen(char[][] charr, char ein, double ws) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (Math.random() < ws) {
                    charr[i][j] = ein;
                }
            }
        }
    }

    /**
     * Die Methode füllt ein 2D-Character-Array mit einem übergebenen Zeichen, mit einer übergebenen Wahrscheinlichkeit, wobei ein übergebenes neutrales Zeichen überschrieben wird
     * @param charr 2D-Array
     * @param ein Einzusetzendes Zeichen
     * @param ws Wahrscheinlichkeit
     * @param neutral Neutrales Zeichen
     */
    public static void fuellen(char[][] charr, char ein, double ws, char neutral) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                if (charr[i][j] == neutral) {
                    if (Math.random() < ws) {
                        charr[i][j] = ein;
                    }
                }

            }
        }
    }

    /**
     * Die Methode platziert zufällig ein übergebenes Zeichen und macht weiter, wenn es sich doppelt
     * @param charr Array
     * @param ein Einzusetzendes Zeichen
     * @param dopplung true/false
     */
    public static void platzieren(char[][] charr, char ein, boolean dopplung) {
        if (!dopplung) {
            int x = (int)(Math.random()*charr.length);
            int y = (int)(Math.random()*charr[0].length);
            charr[x][y] = ein;
        }
        while (dopplung) {
            int x = (int)(Math.random()*charr.length);
            int y = (int)(Math.random()*charr[0].length);
            if (charr[x][y] != ein) {
                charr[x][y] = ein;
                break;
            }
        }
    }

    public static char getNorden (char[][] charr, int x, int y, boolean rand) {
        y --;

        if (y < 0 && rand) {
            y = charr[0].length - 1;
        }
        else if (y < 0) {
            return '-';
        }

        return charr[x][y];
    }

    public static char getSueden (char[][] charr, int x, int y, boolean rand) {
        y++;

        if (y > charr[0].length - 1 && rand) {
            y = 0;
        }
        else if (y > charr[0].length - 1) {
            return '-';
        }

        return charr[x][y];
    }

    public static char getWesten (char[][] charr, int x, int y, boolean rand) {
        x--;

        if (x < 0 && rand) {
            x = charr.length - 1;
        }
        else if (x < 0) {
            return '-';
        }

        return charr[x][y];
    }

    public static char getOsten (char[][] charr, int x, int y, boolean rand) {
        x++;

        if (x > charr.length - 1 && rand) {
            x = 0;
        }
        else if (x > charr.length - 1) {
            return '-';
        }

        return charr[x][y];
    }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] charr = new char[10][10];

        //Fuellen
        fuellen(charr,'1',1);
        sv.step(charr);
        /*
        fuellen(charr, '1', 0.3);
        sv.step(charr);
        fuellen(charr, '2', 0.6, ' ');
        sv.step(charr);
        platzieren(charr,'O',true);
        sv.step(charr);
        platzieren(charr,'O',true);
        sv.step(charr);
        platzieren(charr,'O',true);
        sv.step(charr);
        platzieren(charr,'O',true);
        sv.step(charr);
        platzieren(charr,'O',true);
        sv.step(charr);
         */

        sv.start();
    }
}
