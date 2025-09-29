package blatt07;

public class Rechner {

    /**
     * Die Prozedur berechnet Summe, Differenz, Produkt und Quotient von zwei Zahlen und gibt die Ergebnisse aus
     * @param a Zahl 1
     * @param b Zahl 2
     */
    public static void operation (int a, int b) {
        System.out.println("Summe: " + (a + b));
        System.out.println("Differenz: " + (a - b));
        System.out.println("Produkt: " + (a * b));
        System.out.println("Quotient: " + (a / b));
    }

    /**
     * Die Prozedur addiert zwei Zahlen und gibt diese aus
     * @param a Zahl 1
     * @param b Zahl 2
     * @return ausgabe
     */
    public static int add (int a,int b) {
        int summe = a + b;
        return summe;
    }

    /**
     * Die Prozedur subtrahiert zwei Zahlen und gibt diese aus
     * @param a Zahl 1
     * @param b Zahl 2
     * @return ausgabe
     */
    public static int sub (int a,int b) {
        int differenz = a - b;
        return differenz;
    }

    /**
     * Die Prozedur multipliziert zwei Zahlen und gibt diese aus
     * @param a Zahl 1
     * @param b Zahl 2
     * @return ausgabe
     */
    public static int mult (int a,int b) {
        int produkt = a * b;
        return produkt;
    }

    /**
     * Die Prozedur
     * @param a
     * @param b
     * @return
     */
    public static int div (int a,int b) {
        int quotient = a / b;
        return quotient;
    }

    public static void main (String[] args) {
        operation (1,2);
    }
}
