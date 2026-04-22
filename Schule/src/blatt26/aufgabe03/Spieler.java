package blatt26.aufgabe03;

public class Spieler{

    private int anzahlSterne;
    private Karte[] karten;


    public Spieler() {
        this.anzahlSterne = 3;
        this.karten = new Karte[]{new Karte(Kartentyp.STEIN),new Karte(Kartentyp.STEIN),new Karte(Kartentyp.STEIN),new Karte(Kartentyp.STEIN),new Karte(Kartentyp.SCHERE),new Karte(Kartentyp.SCHERE),new Karte(Kartentyp.SCHERE),new Karte(Kartentyp.SCHERE),new Karte(Kartentyp.PAPIER),new Karte(Kartentyp.PAPIER),new Karte(Kartentyp.PAPIER),new Karte(Kartentyp.PAPIER)};
    }

    public int getAnzahlSterne() {
        return anzahlSterne;
    }

    public void addStern() {
        this.anzahlSterne++;
    }

    public boolean subStern() {
        this.anzahlSterne--;
        if (this.anzahlSterne == 0) {
            this.karten = null;
            return true;
        }
        return false;
    }

    public int anzahlKarten() {
        int count = 0;
        for (Karte karte : karten) {
            if (karte != null) {
                count++;
            }
        }
        return count;
    }

    public Karte getZufallKarte() {
        if (anzahlKarten() > 0) {
            while (true) {
                int z = blatt13.Zufall.zufallGanz(11);
                if (karten[z] != null) {
                    Karte k = karten[z];
                    karten[z] = null;
                    return k;
                }
            }
        }
        return null;
    }

}
