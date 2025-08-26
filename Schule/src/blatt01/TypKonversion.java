package blatt01;

public class TypKonversion {

    public static void main(String[] args) {

        //Abgeschriebener Code:
        int a = 14;
        double b = -21.25;

        int c = (int) b;
        double d = (double) a;

        System.out.println(c);
        System.out.println(d);

        char e = 'a';
        int f = 65;

        int g = (int) e;
        char h = (char) f;

        // e: Hinzugefügte Zeilen
        //boolean t = true;
        //h = (char) t;
        // ende aufgabe e

        System.out.println(g);
        System.out.println(h);


        // a: Die Ausgabe gibt einen negativen Integer (-21), einen Double (14.0), einen Integer (97) und einen Character (A) aus.
        // b: Die neuen Konstrukte wandeln einen Datentyp in einen anderen Datentyp um, z.B. wandelt das Konstrukt in Zeile 9 b von einem Double in einen Integer um.
        // c: Der Zusammenhang besteht darin, dass beide Datentypen Zahlen darstellen und bei einer Konvertierung von Integer zu Double wird ein höherer Wertebereich und genauigkeit ermöglicht.
        // d: Der Zusammenhang besteht darin, dass ein Character einen als eine ganz Zahl in einem bestimmten Wertebereich ist. Dadurch wird jedes Symbol mit einem Unicode gespeichert und ist so in einen Integer konvertierbar.
        // e: Der Code hat zur Folge, dass das Programm eine Fehlermeldung in der Ausgabe anzeigt, wodurch der Compiler das Programm nicht mit der Durchführung anfangen lässt.
        //    Diese Fehlermeldung entsteht dadurch das der Boolean keinen Wert hat der einem Symbol zugeordnet werden kann.

    }
}
