package blatt20_aufgabe0;

public class Smartphone {

    private String marke;
    private String modell;
    private int akkustand;
    private int preis;
    private int speicherplatz;
    private int displaygroesse;
    private int helligkeit;
    private int lautstaerke;
    private int betriebssystem;

    public Smartphone(int speicherplatz, int preis, String modell, String marke, int displaygroesse, int helligkeit,  int lautstaerke, int betriebssystem) {
        this.speicherplatz = speicherplatz;
        this.preis = preis;
        this.modell = modell;
        this.marke = marke;
        this.akkustand = 100;
        this.displaygroesse = displaygroesse;
        this.helligkeit = helligkeit;
        this.lautstaerke = lautstaerke;
        this.betriebssystem = betriebssystem;
    }

    public void speicherLeeren () {
        this.speicherplatz = 0;
    }

    public void akkuLaden () {
        this.akkustand = 100;
    }

    public boolean einschalten () {
        if (this.istAkkuLeer()) {
            return false;
        }
        return true;
    }

    public boolean istAkkuLeer () {
        if (this.akkustand == 0) {
            return true;
        }
        return false;
    }

    public boolean appInstallieren () {
        if (this.einschalten()) {
            return true;
        }
        return false;
    }

    public boolean hatGenugSpeicher () {
        if (this.speicherplatz > 0) {
            return true;
        }
        return false;
    }

    public int getAkkustand() {
        return this.akkustand;
    }

    public void setAkkustand(int akkustand) {
        this.akkustand = Math.max(akkustand, 0);
        this.akkustand = Math.min(akkustand, 100);
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = Math.max(preis, 0);
    }

    public int getSpeicherplatz() {
        return this.speicherplatz;
    }
    public void setSpeicherplatz(int speicherplatz) {
        this.speicherplatz = Math.max(speicherplatz, 0);
    }

    public int getHelligkeit() {
        return this.helligkeit;
    }

    public void setHelligkeit(int helligkeit) {
        if (helligkeit < 10) {
            this.helligkeit = 10;
        }
        if (helligkeit > 100) {
            this.helligkeit = 100;
        }
    }

    public int getLautstaerke() {
        return this.lautstaerke;
    }

        public void setLautstaerke(int lautstaerke) {
        if (lautstaerke < 10) {
            this.lautstaerke = 10;
        }
    }

    void nutzen(int l) {
        setAkkustand(this.akkustand - l);
    }

    void laden(int l) {
        setAkkustand(this.akkustand + l);
    }
}
