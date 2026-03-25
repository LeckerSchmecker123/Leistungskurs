package blatt20_MarioKart;

public class Item {

    private String name;
    private String wirkung;
    private boolean aktiv;

    private Charakter charakterMitItem;

    public Item(String name, String wirkung) {
        this.name = name;
        this.wirkung = wirkung;
        this.aktiv = false;
    }

    public void wirkeAn (Charakter charakter) {}

    public String getName() {
        return name;
    }

    public String getWirkung() {
        return wirkung;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
}
