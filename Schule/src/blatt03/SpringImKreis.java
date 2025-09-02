package blatt03;

import java.util.Scanner;

public class SpringImKreis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nenne mir eine beliebige x-Koordinate");
        double x = input.nextDouble();
        System.out.println("Nenne mir eine beliebige y-Koordinate");
        double y = input.nextDouble();
        System.out.println("Gib einen beliebigen Radius an");
        double radius = input.nextDouble();


        if  (x*x + y*y < Math.sqrt(radius*radius)) {
            System.out.printf("Der Punkt (%.3f|%.3f) liegt innerhalb Einheitskreis", x, y);
        } else if (x*x + y*y == Math.sqrt(radius*radius)) {
            System.out.printf("Der Punkt (%.3f|%.3f) liegt auf Einheitskreis", x, y);
        } else {
            System.out.printf("Der Punkt (%.3f|%.3f) liegt nicht im Einheitskreis", x, y);
        }
    }
}
