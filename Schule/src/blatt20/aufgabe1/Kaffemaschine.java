package blatt20.aufgabe1;

public class Kaffemaschine {
    private int bohnen; //in Gramm
    private int wasser; //in Milliliter
    private int dreck; // in Prozent
    private String kaffeesatz; // in Sorte oder so

    public Kaffemaschine(int bohnen, int wasser, int dreck, String kaffeesatz) {
        this.bohnen = bohnen;
        this.wasser = wasser;
        this.dreck = dreck;
        this.kaffeesatz = kaffeesatz;
    }

    public void bohnenAuffuellen(int bohnenNeu) {
        if (this.bohnen+bohnenNeu <= 350) {
            this.bohnen = this.bohnen+bohnenNeu;
        }
    }

    public void wasserAuffuellen(int wasserNeu) {
        if (this.wasser+wasserNeu <= 800) {
            this.wasser = this.wasser+wasserNeu;
        }
    }

    public void wasserLeeren() {
        this.wasser = 0;
    }

    public void dreckReinigen() {
        this.dreck = 0;
    }

    public void kaffesatzLeeren() {
        this.kaffeesatz = " ";
    }

    public void kaffeeZiehen() {}
}
