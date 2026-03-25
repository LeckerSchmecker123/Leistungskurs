package blatt20_MarioKart;

public class Kart {

    private String modellName;
    private double maxGeschwindigkeit;
    private double beschleunigung;

    private Charakter charakter1;
    private Charakter charakter2;

    public Kart(String modellName, double maxGeschwindigkeit, Charakter charakter1, Charakter charakter2) {
        this.modellName = modellName;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.beschleunigung = 0;
    }

    public void beschleunige () {}

    public void bremse () {}

    public void drifte() {}

    public String getModellName() {
        return modellName;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public double getBeschleunigung() {
        return beschleunigung;
    }

    public void setBeschleunigung(double beschleunigung) {
        this.beschleunigung = beschleunigung;
    }
}
