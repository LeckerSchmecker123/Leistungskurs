package blatt15;

public class Spiegel {

    static char[][] feld;

    public static void zufallSpiegel (char[][] feld) {
        int chance = (int) (Math.random() * 10 / 2);
        if (chance > 5) {
            blatt14.Simulationen.fuellen(feld, 'i', 0.5, ' ');
        } else {
            blatt14.Simulationen.fuellen(feld, 'a', 0.5, ' '); // \\
        }

    }

    public static void main(String[] args) {
        feld = blatt14.MultiArrays.createEmpty2DArray(10, 10);
        zufallSpiegel(feld);
        blatt14.MultiArrays.print2DArray(feld);
    }
}
