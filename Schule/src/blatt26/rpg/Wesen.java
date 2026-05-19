package blatt26.rpg;

public abstract class Wesen {

    private Ausruestung ausruestung;
    private Held held;
    private Gegner gegner;

    private int lvl;
    private int xp;
    private int stk;
    private int vit;
    private int ges;
    private int hp;
    private int maxhp;
    private int luck;

    public Wesen(int lvl, int xp, int stk, int vit, int ges, int maxhp, int luck) {
        this.ausruestung = null;
        this.held = null;
        this.gegner = null;
        this.lvl = lvl;
        this.xp = xp;
        this.stk = stk;
        this.vit = vit;
        this.ges = ges;
        this.hp = maxhp;
        this.maxhp = maxhp;
        this.luck = luck;
    }


    public void angreifen () {}

    public void verteidigen () {}

}
