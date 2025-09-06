package blatt03;

import java.util.Scanner;

public class PQAllgemein {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Erklärung des Programmes.
        System.out.println("Dieses Programm hilft bei der lösung von quadratischen Gleichungen in der Form:");
        System.out.println("a * x^2 + b * x + c = d");

        // Eingabe des Nutzers für p und q.
        System.out.println("Bitte geben Sie einen a-Wert an:");
        double a = input.nextDouble();
        System.out.println("Bitte geben Sie einen b-Wert an:");
        double b = input.nextDouble();
        System.out.println("Bitte geben Sie einen c-Wert an:");
        double c = input.nextDouble();
        System.out.println("Bitte geben Sie einen d-Wert an:");
        double d = input.nextDouble();

        // Umformen zu Normalform: a*x^2 + b*x + (c-d)
        double A = a;
        double B = b;
        double C = c - d;
        if (A == 0) {
            if (B == 0) {
                if (C == 0) {
                    System.out.println("Unendlich viele Lösungen (0 = 0).");
                } else {
                    System.out.println("Keine Lösung (Widerspruch).");
                }
            } else {
                double x = -C / B;
                System.out.println("Es handelt sich um eine lineare Gleichung mit einer Lösung:");
                System.out.printf("x = %.3f", x);
            }
        } else {
            // Diskriminante berechnen, um Fälle im folgenden zu Unterscheiden
            double diskriminante = B*B - 4*A*C;

            //Fälle unterscheiden:
            if (diskriminante > 0) {
                double x1 = -B + Math.sqrt(diskriminante);
                double x2 = -B - Math.sqrt(diskriminante);
                System.out.println("Es gibt zwei Lösungen:");
                System.out.printf("x1 = %.3f %n", x1);
                System.out.printf("x2 = %.3f", x2);
            } else if (diskriminante == 0) {
                double x = -B / (2 * A);
                System.out.println("Es gibt eine Lösung:");
                System.out.printf("x = %.3f", x);
            } else  {
                System.out.println("Es gibt keine reellen Lösungen, da die Diskriminante sich im negativen Bereich befindet.");
            }
        }
    }
}
