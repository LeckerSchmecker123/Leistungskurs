package blatt04;

import java.util.Scanner;

public class Potenzierung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl für die Basis an."); // Frage an Nutzer, für den Wert der Basis
        double basis = input.nextDouble();
        System.out.println("Bitte geben Sie einen ganzzahlige Exponenten an."); // Frage an Nutzer, für den Wert des Exponenten
        int exponent = input.nextInt();

        int wiederholung = 0;
        double ergebnis = basis; // Ergebnis zum weiteren verrechnen Vorbereiten

        if (exponent > 0) { // Fall 1: Exponent ist größer als 0
            while (true) { // Schleife, dient als Exponent
                wiederholung++; // Wiederholung wird in jedem durchlauf um eins erhöht
                if (wiederholung == exponent) { // Wenn die variable wiederholung den gleich Wert die der Exponent hat, wird die Schleife abgebrochen
                    break;
                }
                ergebnis *= basis; // Verrechnung des Basiswerts, indem er mit sich selbst multipliziert wird
            }
        } else if (exponent < 0) { // Fall 2: Exponent ist kleiner als 0
            while (true) { // siehe Fall 1
                wiederholung--; // Wiederholung wird in jedem vorgang um eins gesenkt
                if (wiederholung == exponent) { // siehe Fall 1
                    break;
                }
                ergebnis *= basis; // siehe Fall 1
            }
            ergebnis = 1 / ergebnis; // anwendung der Formel bei negativen Exponenten
        } else { // Fall 3: Exponent ist genau 0
            ergebnis = 1; // Wenn Exponent 0 ist, ist das Ergebnis immer 1
        }

        System.out.printf("%n%.2f^%d = %.2f", basis, exponent, ergebnis); // Ausgabe der Formel und des Ergebnisses
    }
}
