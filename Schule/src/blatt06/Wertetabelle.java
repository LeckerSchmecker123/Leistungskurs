package blatt06;

import java.util.Scanner;

public class Wertetabelle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welche Basis soll das Polynom haben?");
        int x = input.nextInt();

        System.out.println("Welchen Grad soll das Polynom haben?");
        int n = input.nextInt();

        double[] koeff = new double[n+1];

        for (int i = 0; i < koeff.length; i++) {
            System.out.println("Nenne den Koeffizient " + i + ":");
            koeff[i] = input.nextDouble();
        }

        System.out.println("Gib die Grenzen der Wertetabelle ein.");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        double f =0;

        for (int i = 0; i < koeff.length; i++) {
            f = koeff[i] * Math.pow(x, i);
            System.out.println(f);
        }

    }
}