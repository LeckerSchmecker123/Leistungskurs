package blatt26.aufgabe03;

public class Karte implements Comparable<Karte> {
    private Kartentyp typ;

    public Karte(Kartentyp typ) {
        this.typ = typ;
    }

    public Kartentyp getTyp() {
        return typ;
    }

    @Override
    public int compareTo(Karte o) {
        if (this.getTyp() == Kartentyp.STEIN || o.getTyp() == Kartentyp.STEIN) {
            return 0;
        } else if (this.getTyp() == Kartentyp.SCHERE || o.getTyp() == Kartentyp.SCHERE) {
            return 0;
        } else if (this.getTyp() == Kartentyp.PAPIER || o.getTyp() == Kartentyp.PAPIER) {
            return 0;
        } else if (this.getTyp() == Kartentyp.PAPIER ||  o.getTyp() == Kartentyp.STEIN) {
            return 1;
        } else if (this.getTyp() == Kartentyp.STEIN || o.getTyp() == Kartentyp.SCHERE) {
            return 1;
        } else if (this.getTyp() == Kartentyp.SCHERE || o.getTyp() == Kartentyp.PAPIER) {
            return 1;
        } else return -1;
    }
}
