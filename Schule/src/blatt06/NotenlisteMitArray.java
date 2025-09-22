package blatt06;

import java.util.Scanner;

public class NotenlisteMitArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] noten = new int[10];
        /*
        noten[0] = 2;
        noten[1] = 2;
        noten[2] = 3;
        noten[3] = 1;
        noten[4] = 1;
        noten[5] = 4;
        noten[6] = 1;
        noten[7] = 2;
        noten[8] = 3;
        noten[9] = 5;
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Geben sie eine Note ein");
            noten[i] = input.nextInt();
        }

        for (int i = 0; i <= noten.length - 1; i++) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
        }
    }
}
