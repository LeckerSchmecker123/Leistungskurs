package blatt04;

import java.util.Scanner;

public class Reihen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchten Sie je Reihe ausgegeben bekommen?");
        int anzahl = input.nextInt();

        while(anzahl <= 0) {
            System.out.println("Wie viele Zahlen möchten Sie je Reihe ausgegeben bekommen?");
            anzahl = input.nextInt();
        }

        int wiederholung = 0;
        int anzahl1 = 0;
        int anzahl2 = 0;
        int anzahl3_1 = 0;
        int anzahl4 = 1;

        System.out.println("Reihe 1:");
        while (wiederholung < anzahl) {
            wiederholung++;
            anzahl1++;
            System.out.print(anzahl1 + " ");
        }
        wiederholung = 0;

        System.out.println("\n\nReihe 2:");
        while (wiederholung < anzahl) {
            wiederholung++;
            anzahl2 += 2;
            System.out.print(anzahl2 + " ");
        }
        wiederholung = 0;

        System.out.println("\n\nReihe 3:");
        while (wiederholung < anzahl) {
            wiederholung++;
            anzahl3_1++;
            int anzahl3_2 = anzahl3_1 * anzahl3_1;
            System.out.print(anzahl3_2 + " ");
        }
        wiederholung = 0;

        System.out.println("\n\nReihe 4:");
        while (wiederholung < anzahl) {
            wiederholung++;
            System.out.print(anzahl4 + " ");
            if (wiederholung >= anzahl) {
                break;
            }
            wiederholung++;
            System.out.print(-anzahl4 + " ");
            anzahl4++;
        }
    }
}
