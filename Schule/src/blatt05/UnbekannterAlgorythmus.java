package blatt05;

import java.util.Scanner;

public class UnbekannterAlgorythmus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nenne mir ein a.");
        int a = in.nextInt();
        System.out.println("Nenne mir eine b.");
        int b = in.nextInt();

        if (a==b) {
            System.out.println(a);
            System.exit(0);
        }
        while (a != b) {
            if (a > b) {
                a = a-b;
            } else {
                int h = a;
                a = b;
                b = h;
                a = a-b;
            }
        }
        System.out.println(a);
    }
}
