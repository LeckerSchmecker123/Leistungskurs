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

    /**
     * Die funktionen übergibt den Character nördlich des angegebenen Feldes
     * @param charr 2D-Character Array (Gesamtes Feld)
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param rand Variable, falls das gesamte Feld überschritten wird
     * @return ausgabe des Character nördlich
     */
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

    /**
     * Die funktionen übergibt den Character südlich des angegebenen Feldes
     * @param charr 2D-Character Array (Gesamtes Feld)
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param rand Variable, falls das gesamte Feld überschritten wird
     * @return ausgabe des Character südlich
     */
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

    /**
     * Die funktionen übergibt den Character westlich des angegebenen Feldes
     * @param charr 2D-Character Array (Gesamtes Feld)
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param rand Variable, falls das gesamte Feld überschritten wird
     * @return ausgabe des Character westlich
     */
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

    /**
     * Die funktionen übergibt den Character westlich des angegebenen Feldes
     * @param charr 2D-Character Array (Gesamtes Feld)
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param rand Variable, falls das gesamte Feld überschritten wird
     * @return ausgabe des Character westlich
     */
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

    public static char getNordWest (char[][] charr, int x, int y, boolean rand) {
        int z = x;
        int s = y;

        // Schritt 1: Norden
        if (z > 0) {
            z--;
        } else if (rand) {
            z = charr.length - 1;
        } else {
            return '\0';
        }

        // Schritt 2: Westen
        if (s > 0) {
            s--;
        } else if (rand) {
            s = charr[0].length - 1;
        } else {
            return '\0';
        }

        return charr[z][s];
    }

    public static char getNordOst(char[][] charr, int x, int y, boolean rand) {
        int z = x;
        int s = y;

        // Norden
        if (z > 0) {
            z--;
        } else if (rand) {
            z = charr.length - 1;
        } else {
            return '\0';
        }

        // Osten
        if (s < charr[0].length - 1) {
            s++;
        } else if (rand) {
            s = 0;
        } else {
            return '\0';
        }

        return charr[z][s];
    }

    public static char getSuedWest(char[][] charr, int x, int y, boolean rand) {
        int z = x;
        int s = y;

        // Süden
        if (z < charr.length - 1) {
            z++;
        } else if (rand) {
            z = 0;
        } else {
            return '\0';
        }

        // Westen
        if (s > 0) {
            s--;
        } else if (rand) {
            s = charr[0].length - 1;
        } else {
            return '\0';
        }

        return charr[z][s];
    }

    public static char getSuedOst(char[][] charr, int x, int y, boolean rand) {
        int z = x;
        int s = y;

        // Süden
        if (z < charr.length - 1) {
            z++;
        } else if (rand) {
            z = 0;
        } else {
            return '\0';
        }

        // Osten
        if (s < charr[0].length - 1) {
            s++;
        } else if (rand) {
            s = 0;
        } else {
            return '\0';
        }

        return charr[z][s];
    }

    public static int zaehlenVier (char[][] feld, int x, int y, boolean rand, char suchZeichen) {
        int count = 0;

        if (getNorden(feld, x, y, rand) == suchZeichen) {
            count++;
        }
        if (getOsten(feld, x, y, rand) == suchZeichen) {
            count++;
        }
        if (getSueden(feld, x, y, rand) == suchZeichen) {
            count++;
        }
        if (getWesten(feld, x, y, rand) == suchZeichen) {
            count++;
        }

        return count;
    }

    public static int zaehlenAcht (char[][] feld, int x, int y, boolean rand, char suchZeichen) {
        int count = zaehlenVier(feld, x, y, rand, suchZeichen);

        if (getNordWest(feld, x, y, rand) == suchZeichen) {
            count++;
        }
        if (getNordOst(feld, x, y, rand) == suchZeichen) {
            count++;
        }
        if (getSuedWest(feld, x, y, rand) == suchZeichen) {
            count++;
        }
        if (getSuedOst(feld, x, y, rand) == suchZeichen) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] charr = new char[10][10];


        //Fuellen
        fuellen(charr,'1',1);
        sv.step(charr);

        sv.start();
    }
}
