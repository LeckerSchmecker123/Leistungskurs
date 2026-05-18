package blatt26.rpg;

public class Held extends Wesen {
    private int staerke;
    private int konstitution;
    private int mStaerke;
    private int mVerteidigung;
    private int hp;
    private int mp;
    private int geschwindigkeit;
    private int glueck;
    private TypHeld typHeld;

    public Held(int staerke, int konstitution, int hp, int mp, int geschwindigkeit, int glueck, TypHeld typHeld) {
        this.staerke = staerke;
        this.konstitution = konstitution;
        this.mStaerke = 0; //typ bestimmen
        this.mVerteidigung = 0; //typ bestimmen
        this.hp = hp;
        this.mp = mp;
        this.geschwindigkeit = geschwindigkeit;
        this.glueck = glueck;
        this.typHeld = typHeld;
    }
}
