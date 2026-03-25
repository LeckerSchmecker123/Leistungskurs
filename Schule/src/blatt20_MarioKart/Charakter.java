package blatt20_MarioKart;

public class Charakter {

    private String name;
    private Gewichtsklasse gewichtsklasse;
    private String spezialItem;

    private Kart kart;
    private Item aktuellesItem;

    public Charakter(String name, Gewichtsklasse gewichtsklasse, String spezialItem) {
        this.name = name;
        this.gewichtsklasse = gewichtsklasse;
        this.spezialItem = spezialItem;
        this.kart = kart;
        this.aktuellesItem = aktuellesItem;
    }

    public void lenkeKart (Kart kart) {}

    public void halteItem (Item aktuellesItem) {}

    public void wirfItem (Item aktuellesItem) {}

    public String getName() {
        return name;
    }

    public String getGewichtsklasse() {
        return gewichtsklasse.toString();
    }

    public String getSpezialItem() {
        return spezialItem;
    }
}
