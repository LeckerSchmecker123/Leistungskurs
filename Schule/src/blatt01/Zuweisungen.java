package blatt01;

public class Zuweisungen {

    public static void main(String[] args) {

        int a = 2; // a wird ein Wert zugewiesen
        int b = a; // b wird Wert von a zugewiesen
        a += 3; // es werden 3 auf a draufgerechnet
        a = a * 4; // a wird mit 4 multipliziert
        a -= 8; // es werden 8 von a gesenkt
        a = a / 2; // a wird durch 2 geteilt
        a = a - b * 2; // das Doppelte von b wird von a abgezogen
        System.out.println(a); // a wird ausgegeben

        // Zusatzfrage 1: Ich habe 6 Rechenoperatoren genutzt
        // Zusatzfrage 2: der Wert von b mit 2 multipliziert ist um 2 kleiner als der Wert von a nach den Rechnungen zuvor

    }
}
