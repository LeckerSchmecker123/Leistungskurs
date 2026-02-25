package blatt18;

public class Summe {

    public static int gaußscheSumme (int n) {
        if (n >= 0) {
            return gaußscheSumme(n - 1) + n;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(gaußscheSumme(6));
    }
}
