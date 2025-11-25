package blatt13;

public class Umgebung {

    public static int findeExponent(double b, double e) {
        if (0 < b && b < 1) {
            int exponent = 1;
            double p = b;
            while (p > e) {
                exponent++;
                p = Math.pow(b, exponent);
            }
            return exponent;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findeExponent(0.5, 0.001));
    }
}
