package blatt04;

import java.util.Scanner;

public class Rechenuebung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl ein");
        double zahl1 = input.nextDouble();
        System.out.println("Bitte gib eine zweite Zahl ein");
        double zahl2 = input.nextDouble();

        System.out.printf("Gebe die Lösung von %.1f * %.1f ein.%n", zahl1, zahl2);
        double antwort = input.nextDouble();

        while (antwort != zahl1 * zahl2) {
            System.out.printf("Gebe die Lösung von %.1f * %.1f ein.%n", zahl1, zahl2);
            antwort = input.nextDouble();
        }
        System.out.printf("Gut! Die Lösung ist %.1f", zahl1 * zahl2);
    }
}
