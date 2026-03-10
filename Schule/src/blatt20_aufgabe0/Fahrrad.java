package blatt20_aufgabe0;

public class Fahrrad {
    String marke;
    String typ;
    int gang1;
    int gang2;
    int reifenDurchmesser;
    String[] farben;
    boolean zulassung;
    boolean ruecklicht;
    boolean frontlicht;
    boolean lichtAn;

    public Fahrrad (String marke, boolean lichtAn, int gang1, int gang2, int reifenDurchmesser, String[] farben, boolean zulassung, boolean ruecklicht, boolean frontlicht, String typ) {
        this.marke = marke;
        this.typ = typ;
        this.gang1 = gang1;
        this.gang2 = gang2;
        this.reifenDurchmesser = reifenDurchmesser;
        this.farben = farben;
        this.zulassung = zulassung;
        this.ruecklicht = ruecklicht;
        this.frontlicht = frontlicht;
    }

    public void klingeln () {
        System.out.println("KLINGELING!!!");
    }

    public static void main (String[] args) {

    }
}
