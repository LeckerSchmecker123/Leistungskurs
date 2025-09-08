package blatt04;

public class ETF {
    public static void main(String[] args) {

        int monat = 0;
        double sparbetrag = 50; //€
        double gesamtbetrag = 0; //€
        double anteilETF = 3578.89; //€
        double anteil = 0; //%

        while (monat < 12) {
            monat++;
            gesamtbetrag += sparbetrag;
            anteil = gesamtbetrag / anteilETF;

            System.out.println("Monat: " + monat);
            System.out.printf("Sparbetrag: %.2f € %n", sparbetrag);
            System.out.printf("Gesamtbetrag: %.2f € %n", gesamtbetrag);
            System.out.printf("Anteil: %.5f %%%n%n",  anteil);

        }
    }
}
