package blatt14;

import schisch_visualizer.SchischVisualizer;

public class OasenSuche {

    static SchischVisualizer sv = new SchischVisualizer();
    static char[][] spielfeld;
    static int[] spielerPosition = new int[2];
    static int energie;

    public static void initialisiereSpielfeld(int hoehe, int breite) {
        spielfeld = blatt14.MultiArrays.createEmpty2DArray(hoehe, breite);
    }

    public static void zufallsPositionSpieler() {
        if (spielfeld != null) {
            int positionX = (int) (Math.random() * spielfeld.length);
            int positionY = (int) (Math.random() * spielfeld[0].length);

            if (spielerPosition != null && spielfeld[spielerPosition[0]][spielerPosition[1]] == 'P') {
                spielfeld[spielerPosition[0]][spielerPosition[1]] = 'P';
            }

            spielerPosition[0] = positionX;
            spielerPosition[1] = positionY;
            spielfeld[spielerPosition[0]][spielerPosition[1]] = 'P';
        }
    }

    public static void wasserZufall(double wahrscheinlichkeit) {
        if (spielfeld != null) {
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[0].length; j++) {
                    double zufallsZahl = Math.random();
                    if (zufallsZahl <= wahrscheinlichkeit && (i != spielerPosition[0] && j != spielerPosition[1])) {
                        spielfeld[i][j] = '2';
                    }
                }
            }
        }
    }

    public static void steinZufall(double wahrscheinlichkeit) {
        if (spielfeld != null) {
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[0].length; j++) {
                    double zufallsZahl = Math.random();
                    if (zufallsZahl <= wahrscheinlichkeit && (i != spielerPosition[0] && j != spielerPosition[1])) {
                        spielfeld[i][j] = 'A';
                    }
                }
            }
        }
    }

    public static void bewegeSpielerZufaellig(){

        int richtung = (int)(Math.random()*4);

        spielfeld[spielerPosition[0]][spielerPosition[1]] = '4';

        if(richtung==0){ // Schritt nach rechts

            if(spielerPosition[0]!=spielfeld[0].length-1){

                if((spielfeld[spielerPosition[0]+1][spielerPosition[1]] != '2')&&(spielfeld[spielerPosition[0]+1][spielerPosition[1]] != 'A')) {

                    spielerPosition[0]++;

                } else{

                    energie++;

                }

            } else{

                if((spielfeld[0][spielerPosition[1]] != '2')&&(spielfeld[0][spielerPosition[1]] != 'A')) {

                    spielerPosition[0] = 0;

                } else{

                    energie++;

                }

            }

        } else if(richtung==1){ // Schritt nach oben

            if(spielerPosition[1]!=0){

                if((spielfeld[spielerPosition[0]][spielerPosition[1]-1] != '2')&&spielfeld[spielerPosition[0]][spielerPosition[1]-1] != 'A') {

                    spielerPosition[1]--;

                } else{

                    energie++;

                }

            } else{

                if((spielfeld[spielerPosition[0]][spielfeld[0].length-1] != '2') && spielfeld[spielerPosition[0]][spielfeld[0].length-1] != 'A') {

                    spielerPosition[1] = spielfeld[0].length - 1;

                } else{

                    energie++;

                }

            }

        } else if(richtung==2) { // Schritt nach links

            if(spielerPosition[0]!=0){

                if ((spielfeld[spielerPosition[0]-1][spielerPosition[1]] != '2')&&spielfeld[spielerPosition[0]-1][spielerPosition[1]] != 'A') {

                    spielerPosition[0]--;

                } else{

                    energie++;

                }

            } else{

                if ((spielfeld[spielfeld.length-1][spielerPosition[1]] != '2')&&spielfeld[spielfeld.length-1][spielerPosition[1]] != 'A') {

                    spielerPosition[0] = spielfeld.length - 1;

                } else{

                    energie++;

                }

            }

        } else if(richtung==3) { // Schritt nach unten

            if(spielerPosition[1]!=spielfeld[0].length-1){

                if ((spielfeld[spielerPosition[0]][spielerPosition[1]+1] != '2')&&spielfeld[spielerPosition[0]][spielerPosition[1] + 1] != 'A') {

                    spielerPosition[1]++;

                } else{

                    energie++;

                }

            } else{

                if ((spielfeld[spielerPosition[0]][0] != '2')&&spielfeld[spielerPosition[0]][0] != 'A') {

                    spielerPosition[1] = 0;

                } else{

                    energie++;

                }

            }

        }

        spielfeld[spielerPosition[0]][spielerPosition[1]] = 'P';

    }

    public static void findeWasser (int energiewert) {
        if (spielfeld != null) {
            if (spielerPosition != null) {
                energie = energiewert;
                for (; energie > 0; energie--) {
                    int wasserNaehe = Simulationen.zaehlenAcht(spielfeld, spielerPosition[0], spielerPosition[1], false, '2');
                    if (energie == 0) {
                        System.out.println("Energie leer, gestorben!!!");
                    }
                    if (wasserNaehe > 0) {
                        System.out.println("Wasser gefunden!!!");
                        break;
                    }
                    bewegeSpielerZufaellig();
                    sv.step(spielfeld);
                }
            }
        }
    }


    public static void main(String[] args) {
        initialisiereSpielfeld(60, 60);
        sv.step(spielfeld);
        zufallsPositionSpieler();
        sv.step(spielfeld);
        wasserZufall(0.03);
        sv.step(spielfeld);
        steinZufall(0.15);
        sv.step(spielfeld);
        findeWasser(50);
        sv.start();
    }
}
