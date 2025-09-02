package blatt03;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nennen Sie mir eine (ganze) Zahl!");
        int ersteZahl = input.nextInt();

        System.out.println("Nennen Sie mir eine zweite (ganze) Zahl!");
        int zweiteZahl = input.nextInt();

        System.out.println("Nennen Sie mir eine dritte (ganze) Zahl!");
        int dritteZahl = input.nextInt();

        if  (ersteZahl > zweiteZahl && ersteZahl > dritteZahl) { // Fall 1: Die erste genannte Zahl ist größer als die zweite genannte Zahl und auch größer als die dritte genannte Zahl.
            System.out.println(ersteZahl + " ist die größte der drei genannten Zahlen.");
        } else if (zweiteZahl > ersteZahl && zweiteZahl > dritteZahl) { // Fall 2: Die zweite Zahl ist größer als die erste Zahl und ebenso größer als die dritte Zahl.
            System.out.println(zweiteZahl + " ist die größte der drei genannten Zahlen.");
        } else if (dritteZahl > ersteZahl && dritteZahl > zweiteZahl) { // Fall 3: Die dritte Zahl ist größer als die erste Zahl und zweite Zahl.
            System.out.println(dritteZahl + " ist die gröte der drei genannten Zahlen.");
        } else { // Fall 4: Alle genannten Zahlen sind gleich groß bzw. keiner der zuvor genannten Fälle tritt auf.
            System.out.println("Alle genannten Zahlen sind gleich groß.");
        }

    }
}