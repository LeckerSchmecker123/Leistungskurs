package blatt05;

import java.util.Scanner;

public class Struktogramm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximalPunkte = 270;
        int punkteTotal = 0;
        int wurf1Punkte = 0;
        int wurf2Punkte = 0;
        int runde = 1;
        int multiplyer = 1;
        int wurf = 0;

        while (true) {
            System.out.println("Runde: " + runde);
            System.out.println("Wie viele Pins hast du beim ersten Wurf getroffen?");
            wurf1Punkte = input.nextInt();
            if (wurf1Punkte < 0 || wurf1Punkte > 10) {
                continue;
            }
            wurf ++;
            if (wurf1Punkte == 10 && wurf == 1) {
                multiplyer ++;
                punkteTotal = (wurf1Punkte + wurf2Punkte) * multiplyer;
                System.out.println("Deine Punktzahl: " +  punkteTotal + "\n");
                runde++;
                continue;
            }
            System.out.println("Wie viele Punkte hast du beim zweiten Wurf getroffen?");
            wurf2Punkte = input.nextInt();
            while (wurf2Punkte < 0 || wurf2Punkte > 10 - wurf1Punkte) {
                System.out.println("Wie viele Punkte hast du beim zweiten Wurf?");
                wurf2Punkte = input.nextInt();
            }
            wurf ++;
            if (wurf1Punkte + wurf2Punkte == 10 && wurf == 2) {
                multiplyer ++;
                punkteTotal = (wurf1Punkte + wurf2Punkte) * multiplyer;
                System.out.println("Deine Punktzahl: " + punkteTotal + "\n");
                runde++ ;
                continue;
            }
            punkteTotal = wurf1Punkte + wurf2Punkte;
            System.out.println("Deine Punktzahl: " + punkteTotal + "\n");
            multiplyer = 1;
            wurf = 0;

            if (punkteTotal > maximalPunkte) {
                System.out.println("Du hast du maximal Punktzahl überschritten");
            } else if (punkteTotal == maximalPunkte) {
                System.out.println("Gewonnen!");
                break;
            }

            if (runde == 10) {
                System.out.println("Das Spiel ist vorbei");
                break;
            }
            runde++;
        }
    }
}
