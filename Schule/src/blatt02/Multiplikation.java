package blatt02;

import java.util.Scanner;

public class Multiplikation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nenne die erste (ganze) Zahl");
        int zahlEins = sc.nextInt();
        System.out.println("Nenne die zweite (ganze) Zahl");
        int zahlZwei = sc.nextInt();
        System.out.println(zahlEins + " * " + zahlZwei + " = " +  zahlEins * zahlZwei);
    }
}
