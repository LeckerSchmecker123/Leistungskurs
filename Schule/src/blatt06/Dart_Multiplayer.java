package blatt06;

import java.util.Scanner;

public class Dart_Multiplayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int counter_punkte = 501;

        System.out.println("Bitte geben Sie die Anzahl der Spieler an:");
        int a = scanner.nextInt();
        int [] anzahlSpieler = new int [a];

        for (int i = 0; i <= anzahlSpieler.length - 1; i++) {
            anzahlSpieler[i] = 501;
        }

        outer: //Das lässt uns beide Schleifen mit einem break outer; Befehl stoppen
        while (true) {
            for (int i = 0; i < anzahlSpieler.length; i++) {
                int counter_temp = anzahlSpieler[i];
                int anzahl_wuerfe = 0;
                while (anzahl_wuerfe < 3) {
                    System.out.println("Gebe deine Punktzahl ein (0-60)");
                    int wurf = scanner.nextInt();
                    counter_temp = counter_temp - wurf;
                    if (counter_temp == 0) {
                        System.out.println("0 Punkte! Du hast gewonnen.");
                        break outer;
                    } else if (counter_temp < 0) {
                        System.out.println("Überworfen! Du hast noch " + anzahlSpieler[i] + " Punkte Rest.");
                        break;
                    }
                    if (anzahl_wuerfe == 2) {
                        anzahlSpieler[i] = counter_temp;
                    }
                    System.out.println("Die aktuelle Punktzahl ist: " + counter_temp);
                    anzahl_wuerfe++;
                }
                System.out.println("Runde beendet.");
            }
        }
    }
}