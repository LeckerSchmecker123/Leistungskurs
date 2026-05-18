package blatt26.rpg;

public abstract class Wesen {

    int staerke;
    int konstitution;
    int mStaerke;
    int mVerteidigung;
    int hp;
    int mp;
    int geschwindigkeit;
    int glueck;

    public int angreifen () {
        return -1;
    }

    public void verteidige () {}

    public void useItems () {}
}
