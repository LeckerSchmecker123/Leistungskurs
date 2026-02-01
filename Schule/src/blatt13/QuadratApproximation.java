package blatt13;

public class QuadratApproximation {

    public static double flaecheQuadrat (double seitenlaenge) {
        int flaescheninhalt = (int) Math.pow (seitenlaenge , 2);
        return flaescheninhalt;
    }

    public static double sucheSeitenlaenge (double flaeche) {
        double seite = 0.0;
        double schritt = 0.00001;

        while (Math.abs(flaecheQuadrat(seite) - flaeche) > schritt) {
            seite += schritt;
        }
        return seite;
    }



    public static void main(String[] args) {
        System.out.println("Fläsche:");
        System.out.println(flaecheQuadrat(10));
        System.out.println("Seite:");
        System.out.println(sucheSeitenlaenge(100));
    }
}
