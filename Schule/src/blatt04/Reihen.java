package blatt04;

import java.util.Scanner;

public class Reihen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Frage an Nutzer
        System.out.println("Wie viele Zahlen möchten Sie je Reihe ausgegeben bekommen?");
        int anzahl = input.nextInt();

        //Wenn input von Nutzer negativ ist, wird die Frage wiederholt und ein Fehler ausgegeben
        while(anzahl <= 0) {
            System.out.println("Die angegebene Zahl muss positiv sein.");
            System.out.println("Wie viele Zahlen möchten Sie je Reihe ausgegeben bekommen?");
            anzahl = input.nextInt();
        }

        //Variablen werden festgelegt
        int wiederholung = 0;
        int anzahl1 = 0;
        int anzahl2 = 0;
        int anzahl3_1 = 0;
        int anzahl4 = 1;

        // 1. Reihe
        System.out.println("Reihe 1:");
        while (wiederholung < anzahl) { //Zum Zählen der Wiederholungen und somit auch der angezeigten stellen
            wiederholung++; //Wiederholungszähler wird um eins erhöht
            anzahl1++; //Zahl wird um eins erhöht
            System.out.print(anzahl1 + " ");
        }
        wiederholung = 0; // Wiederholungen werden zurückgesetzt

        // 2. Reihe
        System.out.println("\n\nReihe 2:");
        while (wiederholung < anzahl) {
            wiederholung++;
            anzahl2 += 2; // Zahl wird hier um zwei erhöht
            System.out.print(anzahl2 + " ");
        }
        wiederholung = 0;

        System.out.println("\n\nReihe 3:");
        while (wiederholung < anzahl) {
            wiederholung++;
            anzahl3_1++; // Zahl wird um eins erhöht
            int anzahl3_2 = anzahl3_1 * anzahl3_1; // Neue variable wird angelegt, diese besteht aus der zuvor erhöhten Variable, welche mit sich selbst multipliziert wird
            System.out.print(anzahl3_2 + " ");
        }
        wiederholung = 0;

        System.out.println("\n\nReihe 4:");
        while (wiederholung < anzahl) {
            wiederholung++;
            System.out.print(anzahl4 + " "); // Zahl wird ausgegeben
            if (wiederholung >= anzahl) { // die wiederholung wird überprüft und wenn die wiederholung größer oder gleich zur Anzahl ist abgebrochen
                break;
            }
            wiederholung++;
            System.out.print(-anzahl4 + " "); // Zahl wird ausgegeben aber mit negativen vorzeichen
            anzahl4++;
        }
    }
}
