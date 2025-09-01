package blatt02;

import java.util.Scanner;

public class AmiiboKostenRechner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double preisAmiibo = 15;
        System.out.println("Wie viele Amiibos wollen Sie kaufen?");
        int anz = sc.nextInt(); //TODO: Schränke die vom Nutzer gegebene Anzahl auf nichtnegative Zahlen ein.
        System.out.printf("Ihr Einkauf kostet %.2f €", preisAmiibo * anz);

    }
}
