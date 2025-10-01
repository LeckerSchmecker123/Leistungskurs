package blatt08;

public class SuchenUndErsetzen {

    // ersetzt alle a mit d TODO: allgemein machen und groß und klein schreibung beachten
    public static String ersetzen (String str) {
        char [] charr = str.toCharArray();
        for  (int i = 0; i < charr.length; i++) {
            if (charr[i] == 'a') {
                charr[i] = 'd';
            }
        }
        String s = new String(charr);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(ersetzen("Alles was er an hat ist an"));
    }
}
