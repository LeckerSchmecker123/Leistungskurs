public class gatter {
    public static void main(String[] args) {

        // Ich bekomme nur eine ausgabe, wenn die abfrage Wahr ist
        // -> wenn ich eine ausgabe bekomme, kannst du dir das vorstellen als hätte ich die bedingung erfülle
        // um durch ein Tor (Gatter) zu gehen

        //Und-Gatter:

        int a = 1; // a bekommt den Wert 1
        int b = 2; // b bekommt den Wert 2

        if (a == 1 && b == 2) { // es wird abgefragt, ob a den Wert 1 hat und b den Wert 2 hat
            System.out.println("UND"); // wenn beide abfragen stimmen, dann bekomme ich als ausgabe "UND"
        }                              // wenn nicht, dann bekomme ich keine ausgabe

        //Oder-Gatter

        int c = 1; // c bekommt den Wert 1
        int d = 3; // d bekommt den Wert 3

        if (c == 1 || d == 7) { // es wird abgefragt, ob c den Wert 1 hat oder d den Wert 7
            System.out.println("ODER"); // wenn eine der beiden abfragen stimmen bekomme ich als ausgabe "ODER"
        }                               // wenn keine der beiden abfragen stimmen bekomme ich keine ausgabe

        //Nicht-Gatter

        int e = 5; // e bekommt den Wert 5

        if (e != 1) { // es wird abgefragt ob e nicht den Wert 1 hat
            System.out.println("NICHT"); // wenn e jede Zahl außer 1 ist, bekomme ich die ausgabe "NICHT"
        }                                // wenn e gleich 1 ist, bekomme ich keine ausgabe

    }
}
