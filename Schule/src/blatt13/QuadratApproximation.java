package blatt13;

public class QuadratApproximation {

    public static int flaecheQuadrat (int seitenlaenge) {
        int flaescheninhalt = (int) Math.pow (seitenlaenge , 2);
        return flaescheninhalt;
    }

    public static void main(String[] args) {
        System.out.println(flaecheQuadrat(10));
    }
}
