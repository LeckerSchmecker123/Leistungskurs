package blatt03;

import java.util.Scanner;

public class PQ {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Erklärung des Programmes.
        System.out.println("Dieses Programm hilft bei der lösung von quadratischen Gleichungen in der Form:");
        System.out.println("x^2 + p * x + q = 0");

        // Eingabe des Nutzers für p und q.
        System.out.println("Bitte geben Sie einen p-Wert ein:");
        double p = input.nextDouble();
        System.out.println("Bitte geben Sie einen q-Wert ein:");
        double q = input.nextDouble();

        // Diskriminante berechnen, um im Folgenden die Fälle zu unterscheiden.
        double diskriminante = (p/2) * (p/2) - q;

        // Die 3 möglichen Fälle werden unterschieden:
        if (diskriminante > 0){ // Fall 1: zwei Lösungen möglich
            double x1 = -(p/2) + Math.sqrt(diskriminante);
            double x2 = -(p/2) - Math.sqrt(diskriminante);
            System.out.println("Es gibt zwei Lösungen:");
            System.out.printf("x1 = %.3f %n", x1);
            System.out.printf("x2 = %.3f", x2);
        } else if (diskriminante == 0) { // Fall 2: eine Lösung möglich
            double x = -(p/2);
            System.out.println("Es gibt eine Lösung:");
            System.out.printf("x = %.3f %n", x);
        } else { // Fall 3: keine reelle Lösung möglich
            System.out.println("Es gibt keine reellen Lösungen, da die Diskriminante sich im negativen Bereich befindet.");
        }
    }
}
