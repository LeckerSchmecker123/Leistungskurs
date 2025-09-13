package blatt04;

import java.util.Scanner;
import java.util.Random;

public class Topfschlagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int topfX = random.nextInt(0, 6);
        int topfY = random.nextInt(0, 6);

        int startX = 3;
        int startY = 3;

        int playerX = startX;
        int playerY = startY;

        int altPlayerX = 3;
        int altPlayerY = 3;


        System.out.println(topfX + " " + topfY);
        while (true) {
            altPlayerX = playerX;
            altPlayerY = playerY;
            if (topfX == playerX && topfY == playerY) {
                System.out.println("Du hast gewonnen");
                break;
            }
            System.out.println("In welche richtung möchten Sie sich bewegen? (w, a, s, d,)");
            char steuerung = input.next().charAt(0);
            if (steuerung == 'w') {
                playerY += 1;
                if (topfY - altPlayerY > topfY - playerY) {
                    System.out.println("Kalt");
                }  else if (topfY - altPlayerY < topfY - playerY) {
                    System.out.println("Warm");
                }
            } else if (steuerung == 's') {
                playerY -= 1;
                if (topfY - altPlayerY > topfY - playerY) {
                    System.out.println("Kalt");
                }  else if (topfY - altPlayerY < topfY - playerY) {
                    System.out.println("Warm");
                }
            } else if (steuerung == 'a') {
                playerX += 1;
                if  (topfX - altPlayerX > topfX - playerX) {
                    System.out.println("Kalt");
                } else if (topfX - altPlayerX < topfX -  playerX) {
                    System.out.println("Warm");
                }
            }  else if (steuerung == 'd') {
                playerX -= 1;
                if  (topfX - altPlayerX > topfX - playerX) {
                    System.out.println("Kalt");
                } else if (topfX - altPlayerX < topfX -  playerX) {
                    System.out.println("Warm");
                }
            }
            if (playerX == -1) {
                System.out.println("Hier ist der Suchbereich zu ende!");
                playerX += 1;
            } else if (playerX == 6) {
                System.out.println("Hier ist der Suchbereich zu ende!");
                playerX -= 1;
            } else if (playerY == -1) {
                System.out.println("Hier ist der Suchbereich zu ende!");
                playerY += 1;
            } else if (playerY == 6) {
                System.out.println("Hier ist der Suchbereich zu ende!");
                playerY -= 1;
            }
        }
    }
}
