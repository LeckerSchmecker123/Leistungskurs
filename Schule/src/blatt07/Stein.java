package blatt07;

public class Stein {

    /**
     * Die Prozedur findet denn ggT von zwei Zahlen (nach folgenden regeln: - beide Zahlen gerade -> werden beide durch 2 geteilt, - eine Zahl gerade -> wird diese durch 2 geteilt, - beide Zahlen ungerade -> wird größere Zahl durch ((größereZahl-kleinereZahl) / 2) ersetzt)
     * @param a Zahl 1
     * @param b Zahl 2
     * @return ausgabe des ggT
     */
    public static int SteinGGT (int a, int b) {
        int k = 0;

        if (a == 0) return b;
        if (b == 0) return a;

        while (a % 2 == 0 && b % 2 == 0) {
            a /= 2;
            b /= 2;
            k++;
        }

        while (a != 0 && b != 0) {
            if (a % 2 == 0) {
                a /= 2;
            } else if (b % 2 == 0) {
                b /= 2;
            } else  {
                if (a >= b) {
                    a = (a - b) / 2;
                } else  {
                    b = (b - a) / 2;
                }
            }
        }
        int ggt = (a==0 ? b : a);

        return ggt * (int) Math.pow(2, k);
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("ggT von " + a + " und " + b + " ist: " + SteinGGT(a, b));
    }
}
