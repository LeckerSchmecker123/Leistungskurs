package blatt26.aufgabe03;

public class Simulation {
    private int AnzSpieler;
    private int Versklavte;

    public Simulation(int anzSpieler) {
        this.AnzSpieler = anzSpieler;
        this.Versklavte = 0;
    }

    public int[] initialisiereSpieler() {
        int[] spieler = new int[AnzSpieler];
        for (int i = 0; i < AnzSpieler; i++) {
            spieler[i] = i;
        }
        return spieler;
    }

    public void getSpieler() {
        int s1 = (int) (Math.random() * AnzSpieler);
        int s2 = (int) (Math.random() * AnzSpieler);
        while (s1 == s2) {
            s2 = (int) (Math.random() * AnzSpieler);
        }
    }

    public void compareSpieler(Spieler s1, Spieler s2) {
        Karte karte1 = s1.getZufallKarte();
        Karte karte2 = s2.getZufallKarte();

        int win = karte1.compareTo(karte2);

    }


    public void runde () {

    }
}
