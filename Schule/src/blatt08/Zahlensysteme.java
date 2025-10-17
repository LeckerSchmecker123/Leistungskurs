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

    /**
     * Die Prozedur überprüft, ob die Eingabe (als String) eine Hexadezimalzahl ist und gibt dies danach aus
     * @param str Zahl (als String)
     * @return Ausgabe (true/false)
     */
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

    /**
     * Die Prozedur, erkennt, ob es sich um eine Dezimalzahl, Binärzahl oder Hexadezimalzahl handelt und wandelt es in eine Dezimalzahl um
     * @param str Zahl (als String)
     * @return Ausgabe (Als Dezimalzahl)
     */
    public static int zuDezimal (String str) {
        if (istBinär(str)) {
            char [] c = str.toCharArray();
            int ergebnis = 0;
            int basis = 1;
            for (int i = c.length - 3; i >= 1; i--) {
                if (c[i] == '1') {
                    ergebnis += basis;
                }
                basis *= 2;
            }
            return ergebnis;
        }

        else if (istHexadezimal(str)) {
            char [] c = str.toCharArray();
            int ergebnis = 0;
            int basis = 1;

            for (int i = c.length - 4; i >= 1; i--) {
                char chars = c[i];
                int wert = 0;

                if (chars >= '0' && chars <= '9') {
                    wert = chars - '0';
                } else if (chars >= 'A' && chars <= 'F') {
                    wert = 10 + (chars - 'A');
                } else if (chars >= 'a' && chars <= 'f') {
                    wert = 10 + (chars - 'a');
                } else {
                    return -1;
                }
                ergebnis += wert * basis;
                basis *= 16;
            }
            return ergebnis;
        }

        else if (istDezimal(str)) {
            char [] c = str.toCharArray();
            int ergebnis = 0;

            for (int i = 0;  i < c.length; i++) {
                if (c[i] < '0' || c[i] > '9') {
                    return -1;
                }
                ergebnis = ergebnis * 10 + (c[i] - '0');
            }
            return ergebnis;
        }
        else  {
            System.out.println("Ungültiges Format!");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Ist das Dezimal:");
        System.out.println(istDezimal("295674"));

        System.out.println("\nIst das Binär");
        System.out.println(istBinär("(110000110101101011)2"));

        System.out.println("\nIst das Hexadezimal:");
        System.out.println(istHexadezimal("(B7C)16"));

        System.out.println("\nZu Dezimal:");
        System.out.println(zuDezimal("2940"));
        System.out.println(zuDezimal("(101110111100)2"));
        System.out.println(zuDezimal("(B7C)16"));
    }
}
