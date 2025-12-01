package blatt06;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine Länge an (Ganzzahl)");
        int n =  input.nextInt();

        while (n <= 2) {
            System.out.println("Die angegebene Länge muss größer als 2 sein");
            System.out.println("Geben Sie eine Länge an (Ganzzahl)");
            n =  input.nextInt();
        }

        int [] arr = new int[n];

        //a)
        System.out.println("\nDas ist die Fibonacci Kette mit der Länge " + n + ":");
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(arr[0] + "\n" + arr[1]);

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }

        //b)
        System.out.println("\nQuotient");
        int quotient = arr[arr.length - 1] / arr[arr.length - 2];
        System.out.println(quotient);

        //c)
        System.out.println("\nc)");
        int element = 2;
        while (true) {
            double quotient2 = (double) arr[element] / arr[element - 1];
            System.out.println(quotient2);
            element++;
            if (element == n) {
                break;
            }
        }
    }
}
