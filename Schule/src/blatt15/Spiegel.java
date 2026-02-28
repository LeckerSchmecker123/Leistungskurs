package blatt15;

import blatt14.MultiArrays;
import blatt14.Simulationen;
import schisch_visualizer.SchischVisualizer;

public class Spiegel {

    static char[][] spielfeld;
    static SchischVisualizer sv =  new SchischVisualizer();

    public static void initialisiereSpielfeld (int a) {
        spielfeld = MultiArrays.createEmpty2DArray(a, a);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                spielfeld[i][j] = '0';
            }
        }
    }

    public static void zufallSpiegel (char[][] feld, double w) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[0].length; j++) {
                if (Math.random() < w) {
                    if (Simulationen.zaehlenVier(feld, i, j, false, '/') < 1 && Simulationen.zaehlenVier(feld, i, j, false, '\\') < 1) {
                        if ((int) (Math.random() * 2) == 0) {
                            feld[i][j] = '/';
                        } else {
                            feld[i][j] = '\\';
                        }
                    }
                }
            }
        }
    }


    public static void zufallZiele(char[][] feld, double wahrs){
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if(Math.random()<wahrs && ((i>0)&&(i< feld.length-1) && ((j>0)&&j<feld[0].length-1))){
                    if(feld[i][j]!='/' && feld[i][j]!='\\'){
                        feld[i][j] = 'O';
                    }
                }
            }
        }
    }

    public static void pfeilSpawn (char[][] feld) {
        feld[0][feld[0].length/2] = '>';
    }

    public static void dreheSpiegel (char[][] feld, double w, int x, int y) {
        if (Math.random() < w) {
            if (feld[x][y] == '/') {
                feld[x][y] = '\\';
            } else {
                feld[x][y] = '/';
            }
        }
    }

    public static void pfeilBewege(char[][] feld, double drehwahrscheinlichkeit, int x, int y, char[][] ignore){
        if (feld[x][y] == '>' && ignore[x][y] != 'X') {
            feld[x][y] = '0';
            if(x < feld.length-1) {
                if (feld[x + 1][y] == 'O') {
                    feld[x + 1][y] = '0';
                } else if (feld[x + 1][y] == '<' || feld[x + 1][y] == '>' || feld[x + 1][y] == 'v' || feld[x + 1][y] == '^') {
                    feld[x + 1][y] = '0';
                } else if (feld[x + 1][y] == '/') {
                    if(y > 0) {
                        if (feld[x + 1][y - 1] != '/' && feld[x + 1][y - 1] != '\\') {
                            feld[x + 1][y - 1] = '^';
                            ignore[x + 1][y - 1] = 'X';
                        } else {
                            feld[x + 1][y] = '^';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x + 1, y, ignore);
                            feld[x + 1][y] = '/';
                        }
                    }
                    dreheSpiegel(feld, drehwahrscheinlichkeit, x + 1, y);
                } else if (feld[x + 1][y] == '\\') {
                    if(y<feld[0].length-1) {
                        if (feld[x + 1][y + 1] != '/' && feld[x + 1][y + 1] != '\\') {
                            feld[x + 1][y + 1] = 'v';
                            ignore[x + 1][y + 1] = 'X';
                        } else {
                            feld[x + 1][y] = 'v';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x + 1, y, ignore);
                            feld[x + 1][y] = '\\';
                        }
                    }
                    dreheSpiegel(feld, drehwahrscheinlichkeit, x + 1, y);
                } else {
                    feld[x + 1][y] = '>';
                    ignore[x + 1][y] = 'X';
                }
            }
        } else if (feld[x][y] == '<' && ignore[x][y] != 'X') {
            feld[x][y] = '0';
            if(x>0) {
                if (feld[x - 1][y] == 'O') {
                    feld[x - 1][y] = '0';
                } else if (feld[x - 1][y] == '<' || feld[x - 1][y] == '>' || feld[x - 1][y] == 'v' || feld[x - 1][y] == '^') {
                    feld[x - 1][y] = '0';
                } else if (feld[x - 1][y] == '/') {
                    if(y<feld[0].length-1) {
                        if(feld[x-1][y+1]!='/' && feld[x-1][y+1]!='\\') {
                            feld[x - 1][y + 1] = 'v';
                            ignore[x - 1][y + 1] = 'X';
                        } else{
                            feld[x - 1][y] = 'v';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x - 1, y, ignore);
                            feld[x - 1][y] = '/';
                        }
                    }
                    dreheSpiegel(feld,drehwahrscheinlichkeit,x-1,y);
                } else if (feld[x - 1][y] == '\\') {
                    if(y>0) {
                        if(feld[x-1][y-1]!='/' && feld[x-1][y-1]!='\\') {
                            feld[x - 1][y - 1] = '^';
                            ignore[x - 1][y - 1] = 'X';
                        } else{
                            feld[x - 1][y] = '^';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x - 1, y, ignore);
                            feld[x - 1][y] = '\\';
                        }
                    }
                    dreheSpiegel(feld,drehwahrscheinlichkeit,x-1,y);
                } else {
                    feld[x - 1][y] = '<';
                    ignore[x - 1][y] = 'X';
                }
            }
        } else if (feld[x][y] == 'v' && ignore[x][y] != 'X') {
            feld[x][y] = '0';
            if(y < feld[0].length-1) {
                if (feld[x][y+1] == 'O') {
                    feld[x][y+1] = '0';
                } else if (feld[x][y+1] == '<' || feld[x][y+1] == '>' || feld[x][y+1] == 'v' || feld[x][y+1] == '^') {
                    feld[x][y+1] = '0';
                }  else if (feld[x][y + 1] == '/') {
                    if(x>0) {
                        if(feld[x-1][y+1]!='/' && feld[x-1][y+1]!='\\') {
                            feld[x - 1][y + 1] = '<';
                            ignore[x - 1][y + 1] = 'X';
                        } else{
                            feld[x][y+1] = '<';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x, y+1, ignore);
                            feld[x][y+1] = '/';
                        }
                    }
                    dreheSpiegel(feld,drehwahrscheinlichkeit,x,y+1);
                } else if (feld[x][y+1] == '\\') {
                    if(x<feld.length-1) {
                        if(feld[x+1][y+1]!='/' && feld[x+1][y+1]!='\\') {
                            feld[x + 1][y + 1] = '>';
                            ignore[x + 1][y + 1] = 'X';
                        } else{
                            feld[x][y+1] = '>';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x, y + 1, ignore);
                            feld[x][y+1] = '\\';
                        }
                    }
                    dreheSpiegel(feld,drehwahrscheinlichkeit,x,y+1);
                }else {
                    feld[x][y + 1] = 'v';
                    ignore[x][y + 1] = 'X';
                }
            }
        } else if (feld[x][y] == '^' &&  ignore[x][y] != 'X') {
            feld[x][y] = '0';
            if(y>0) {
                if (feld[x][y - 1] == 'O') {
                    feld[x][y - 1] = '0';
                } else if (feld[x][y-1] == '<' || feld[x][y-1] == '>' || feld[x][y-1] == 'v' || feld[x][y-1] == '^') {
                    feld[x][y-1] = '0';
                } else if (feld[x][y - 1] == '/') {
                    if(x<feld.length-1) {
                        if(feld[x+1][y-1]!='/' && feld[x+1][y-1]!='\\') {
                            feld[x + 1][y - 1] = '>';
                            ignore[x + 1][y - 1] = 'X';
                        } else{
                            feld[x][y - 1] = '>';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x, y - 1, ignore);
                            feld[x][y-1] = '/';
                        }
                    }
                    dreheSpiegel(feld,drehwahrscheinlichkeit,x,y-1);
                } else if (feld[x][y-1] == '\\') {
                    if(x>0) {
                        if(feld[x-1][y-1]!='/' && feld[x-1][y-1]!='\\') {
                            feld[x - 1][y - 1] = '<';
                            ignore[x - 1][y - 1] = 'X';
                        } else{
                            feld[x][y-1] = '<';
                            pfeilBewege(feld, drehwahrscheinlichkeit, x, y - 1, ignore);
                            feld[x][y-1] = '\\';
                        }
                    }
                    dreheSpiegel(feld,drehwahrscheinlichkeit,x,y-1);
                } else {
                    feld[x][y - 1] = '^';
                    ignore[x][y - 1] = 'X';
                }
            }
        }
    }

    public static boolean spiegelSimulation (char[][] feld, int schritteAnzahl, double drehwahrscheinlichkeit, int pfeilabstand){
        zufallSpiegel(feld,0.25);
        zufallZiele(feld,0.05);
        char[][] ignore = new char[feld.length][feld[0].length];
        for (int i = 0; i < schritteAnzahl; i++) {
            ignore = blatt14.MultiArrays.createEmpty2DArray(feld.length, feld[0].length);
            for (int x = 0; x < feld.length; x++) {
                for (int y = 0; y < feld[x].length; y++) {
                    pfeilBewege(feld,drehwahrscheinlichkeit,x,y,ignore);
                }
            }
            if(i%pfeilabstand==0){
                pfeilSpawn(feld);
            }
            sv.step(feld);
        }
        for (int x = 0; x < feld.length; x++) {
            for (int y = 0; y < feld[0].length; y++) {
                if (feld[x][y] == 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initialisiereSpielfeld(40);
        System.out.println(spiegelSimulation(spielfeld, 10000, 0.5, 2));
        sv.start();
    }
}
