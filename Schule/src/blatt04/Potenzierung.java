package blatt04;

import java.util.Scanner;

public class Potenzierung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl für die Basis an.");
        double basis = input.nextDouble();
        System.out.println("Bitte geben Sie einen ganzzahlige Exponenten an.");
        int exponent = input.nextInt();

        int wiederholung = 0;
        double ergebnis = basis;

        if (exponent > 0) {
            while (true) {
                wiederholung++;
                if (wiederholung == exponent) {
                    break;
                }
                ergebnis *= basis;
            }
        } else if (exponent < 0) {
            while (true) {
                wiederholung--;
                if (wiederholung == exponent) {
                    break;
                }
                ergebnis *= basis;
            }
            ergebnis = 1 / ergebnis;
        } else {
            ergebnis = 1;
        }

        System.out.printf("%n%.2f^%d = %.2f", basis, exponent, ergebnis);
    }
}
