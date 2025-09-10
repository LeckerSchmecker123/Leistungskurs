package blatt04;

import java.util.Scanner;
import java.util.Random;

public class Topfschlagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int topfx = random.nextInt(0, 5);
        int topfy = random.nextInt(0, 5);

        int startx = 3;
        int starty = 3;

        int playerx = startx;
        int playery = starty;

        while (true) {
            if (topfx == playerx && topfy == playery) {
                System.out.println("Du hast gewonnen");
                break;
            }
            System.out.println("In welche richtung möchten Sie sich bewegen? (w, a, s, d,)");
            char steuerung = input.next().charAt(0);
            if (steuerung == 'w') {
                playery += 1;
            } else if (steuerung == 's') {
                playery -= 1;
            } else if (steuerung == 'a') {
                playerx += 1;
            }  else if (steuerung == 'd') {
                playery -= 1;
            }
            /*
            int abstandAlt = 0;
            int abstandNeu = Math.abs(topfx - playerx) + Math.abs(topfy - playery);
            if (abstandAlt > abstandNeu) {
                System.out.println("kalt");
            } else if (abstandAlt < abstandNeu) {
                System.out.println("warm");
            }
            abstandAlt = abstandNeu;
             */
        }
    }
}
