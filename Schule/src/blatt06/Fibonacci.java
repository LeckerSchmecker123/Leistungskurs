package blatt06;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine Länge an (Ganzzahl)");
        int n =  input.nextInt();


        while (n <= 2) {
            System.out.println("Die angegebene Länge muss größer als 2 sein");
            System.out.println("Geben Sie eine Länge an (Ganzzahl)");
            n =  input.nextInt();
        }

        int [] fibonacci = new int[n];

        //a)
        System.out.println("\nDas ist die Fibonacci Kette mit der Länge " + n +" :");
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        System.out.println(fibonacci[0] + "\n" + fibonacci[1]);


        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println(fibonacci[i]);
        }

        //b)
        System.out.println("\nDas ist der Quotient der letzten beiden Zahlen der Kette:");
        int quotient = fibonacci[fibonacci.length - 1] / fibonacci[fibonacci.length - 2];
        System.out.println(quotient);

        //c)
        System.out.println("\nDas ist eine sehr lange Kette mit allen Quotienten:");
        int element = 2;
        while (true) {
            double quotient2 = (double) fibonacci[element] / fibonacci[element - 1];
            System.out.println(quotient2);
            element++;
            if (element == n) {
                System.out.println("\nSchleife ist fertig!!!");
                break;
            }
        }
        //Der Quotient nähert sich einen Grenzwert, welcher gegen 1,61803 liegt. Dieser Grenzwert könnte zu einer Folge gehören
    }
}
