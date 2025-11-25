package blatt08;

public class Klammernsprache2 {
    public static boolean istKlammerwort (String a) {
        char[] charr = a.toCharArray();
        int value = 0;
        for (int i = 0; i < charr.length; i++) {
            if (value < 0) {
                return false;
            }
            if (charr[i] == '(') {
                value++;
            } else if (charr[i] == ')') {
                value--;
            }
        }
        return value == 0;
    }
    public static void main(String[] args) {
        System.out.println(istKlammerwort("()"));
    }
}
