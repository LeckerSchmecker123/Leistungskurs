package blatt41.aufgabe01;

import java.net.Socket;

import static java.awt.SystemColor.text;

public class Nachricht {

    private String protokoll;
    private String nachricht;

    public Nachricht () {
        this.protokoll = null;
        this.nachricht = null;
    }

    public Nachricht (String protokoll, String nachricht) {
        this.protokoll = protokoll;
        this.nachricht = nachricht;
    }

    public String prepareMessage() {
        if (protokoll != null && !protokoll.isEmpty()
                && nachricht != null && !nachricht.isEmpty()) {
            return protokoll + "|" + nachricht;
        }
        return null;
    }

    public static boolean isValid(String text) {
        if (text == null) {
            return false;
        }

        int trennzeichen = text.indexOf("|");

        return trennzeichen > 0 && trennzeichen < text.length() - 1 && trennzeichen == text.lastIndexOf("|");
    }

    public String getProtokoll() {
        return protokoll;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setMessage (String text) {
        if (isValid(text)) {
            int trennzeichen = text.indexOf("|");

            protokoll = text.substring(0, trennzeichen);
            nachricht = text.substring(trennzeichen + 1);
        }
    }


}
