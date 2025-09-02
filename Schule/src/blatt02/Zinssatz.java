package blatt02;

import java.util.Scanner;

public class Zinssatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was ist ihr Startkapital?");
        double altesKapital = sc.nextDouble(); // €
        System.out.println("Was ist der Zinssatz in Prozent?");
        double zinssatz = sc.nextDouble(); // %


        double zinsen = (altesKapital * zinssatz) / 100;
        double neuesKapital = altesKapital + zinsen;

        System.out.printf("Altes Kapital: %.2f € %n", altesKapital);
        System.out.println("Zinssatz: " + zinssatz + " %" + "\n");
        System.out.println("Zinsen: " + zinsen + " €");
        System.out.printf("Neues Kapital: %.2f €", neuesKapital);
    }
}
