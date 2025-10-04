package blatt08;

public class Zahlensysteme {

    /**
     * Die Prozedur überprüft, ob die Eingabe (als String) eine Dezimalzahl ist und gibt dies danach aus
     * @param str Zahl (als String)
     * @return Ausgabe (true/false)
     */
    public static boolean istDezimal (String str) {
        char [] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] < '0' || c[i] > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * Die Prozedur überprüft, ob die Eingabe (als String) eine Binärzahl ist und gibt dies danach aus
     * @param str Zahl (als String)
     * @return Ausgabe (true/false)
     */
    public static boolean istBinär (String str) {
        char [] c = str.toCharArray();

        if (c[0] != '(' || c[c.length - 2] != ')' || c[c.length - 1] != '2') {
            return false;
        }

        for (int i = 1; i < c.length - 2; i++) {
            if (c[i] != '0' && c[i] != '1') {
                return false;
            }
        }
        return true;
    }

    public static boolean istHexadezimal (String str) {
        char [] c = str.toCharArray();

        if (c[0] != '(' || c[c.length - 1] != '6' || c[c.length - 2] != '1' || c[c.length - 3] != ')') {
            return false;
        }

        for (int i = 1; i < c.length - 3; i++) {
            if (c[i] >= '0' && c[i] <= '9') {

            } else if (c[i] >= 'A' && c[i] <= 'F') {

            } else if (c[i] >= 'a' && c[i] <= 'f') {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Ist das Dezimal:");
        System.out.println(istDezimal("295674"));

        System.out.println("\nIst das Binär");
        System.out.println(istBinär("(110000110101101011)2"));

        System.out.println("\nIst das Hexadezimal:");
        System.out.println(istHexadezimal("(B7C)16"));
    }
}
