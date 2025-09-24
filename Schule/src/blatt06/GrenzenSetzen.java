package blatt06;

import java.util.Scanner;

public class GrenzenSetzen {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nennen Sie mir eine Untergrenze (Ganzzahl)");
        int u = input.nextInt();
        System.out.println("Nennen Sie mir eine Obergrenze (Ganzzahl)");
        int o = input.nextInt();

        if (u >= o) {
            System.out.println("Die Obergrenze muss größer als die Untergrenze sein!");
            System.exit(0);
        }

        int laenge = o - u + 1;
        int [] zahlen =  new int[laenge];

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = u + i;
        }

        System.out.println("Die Zahlen zwischen der angegebenen Untergrenze (" + u + ") und der angegebenen Obergrenze (" + o + ") sind :");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i]);
            if (i < zahlen.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
