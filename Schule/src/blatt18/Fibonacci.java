package blatt18;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }  else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fibonacci(100));
        long end = System.currentTimeMillis();
        long dur = end - start;
        System.out.println(dur + " Millisekunden");
        System.out.println(dur / 1000 + " Sekunden");

    }
}
