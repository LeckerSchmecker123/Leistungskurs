package blatt20_aufgabe0;

public class Auto {
    private String marke;
    private String modell;

    private int tank;
    private int geschwindigkeit;
    private int kilometerstand;

    void beschleunigen(int v) {
        this.geschwindigkeit += v;
    }

    void bremsen (int v) {
        this.geschwindigkeit -= v;
    }

    void fahren(int km) {
        this.kilometerstand += km;
    }

    public Auto() {
        this.marke = "unbekannt";
        this.modell = "unbekannt";
        this.tank = 50;
        this.geschwindigkeit = 0;
        this.kilometerstand = 0;
    }

    public Auto(Auto a) {
        this.marke = a.marke;
        this.modell = a.modell;
        this.tank = a.tank;
        this.geschwindigkeit = a.geschwindigkeit;
        this.kilometerstand = a.kilometerstand;
    }

    public Auto(String marke, String modell, int tank, int geschwindigkeit, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
        this.tank = tank;
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = kilometerstand;
    }

    public void setTank(int tank) {
        this.tank = tank;
        if (this.tank < 0) {
            this.tank = 0;
        }
        if (this.tank > 100) {
            this.tank = 100;
        }
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
        if (this.geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        }
        if (this.geschwindigkeit > 450) {
            this.geschwindigkeit = 450;
        }
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
        if (this.kilometerstand < 0) {
            this.kilometerstand = 0;
        }
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getTank() {
        return tank;
    }
}

