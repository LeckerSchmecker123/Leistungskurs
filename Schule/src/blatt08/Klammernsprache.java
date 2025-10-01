package blatt08;

public class Klammernsprache {

    /**
     * Die Prozedur überprüft, ob das "Klammerwort" richtig ist
     * @param str Klammerwort
     * @return ausgabe als boolean0
     */
    public static boolean istKlammerwort (String str) {
        char [] charr = str.toCharArray();
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
        System.out.println(istKlammerwort(")("));
    }
}
