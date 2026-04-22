package blatt26.aufgabe03;

public class Simulation {
    private int AnzSpieler;

    public Simulation(int anzSpieler) {
        AnzSpieler = anzSpieler;
    }

    public void runde (Spieler s1, Spieler s2) {
        Karte KarteS1 = s1.getZufallKarte();
        Karte KarteS2 = s2.getZufallKarte();
    }
}
