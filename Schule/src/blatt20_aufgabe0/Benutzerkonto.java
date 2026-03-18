package blatt20_aufgabe0;

public class Benutzerkonto {

    private String benutzername;
    private String mail;
    private String geburtsdatum;
    private String erstellungsdatum;
    private String passwort;
    private double gutscheinguthaben;
    String gutscheinCodeTest = "abcd"; //ToDO privat??

    public Benutzerkonto(String benutzername, String mail, String passwort, String geburtsdatum) {
        this.benutzername = benutzername;
        this.mail = mail;
        this.passwort = passwort;
        this.geburtsdatum = geburtsdatum;
        this.gutscheinguthaben = 0;
        this.erstellungsdatum = "1.1.1500"; //ToDO Autonom Datum wählen :)
    }

    public boolean anmelden (String benuternamen, String passwort) {
        if (this.passwort.equals(passwort) && this.benutzername.equals(benuternamen)) {
            return true;
        }
        return false;
    }

    public boolean passwortAendern (String benutzername, String passwortAlt, String passwortNeu) {
        if (anmelden(benutzername, passwortAlt)) {
            this.passwort = passwortNeu;
            return true;
        }//ToDO Fehlermeldungen ausgeben
        return false;
    }

    public void gutscheinEinloesen (String gutscheincode, double gutscheinBetrag) { //ToDO was wenn mehrere Gutscheine vorhanden sind? -> Extra Objekt für Gutscheine
        if (this.gutscheinCodeTest.equals(gutscheincode)) {
            this.gutscheinguthaben += gutscheinBetrag;
        }
    }

    public String getPasswort() { //ToDo Für alle sichtbar? & ggf. private + extra Method
        return passwort;
    }


    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername, String passwort) { //ToDo Ist eine Änderung des Benutzernames erlaubt? & ggf. extra Methode
        if (passwort.equals(this.passwort)) {
            this.benutzername = benutzername;
        } //ToDo Fehlermeldung
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail, String passwort) { //ToDo Ist eine Änderung der Email erlaubt?
        if (passwort.equals(this.passwort)) {
            this.mail = mail;
        } //ToDo Fehlermeldung
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }


    public String getErstellungsdatum() {
        return erstellungsdatum;
    }


    public double getGutscheinguthaben() {
        return gutscheinguthaben;
    }

    public String getGutscheinCodeTest() {
        return gutscheinCodeTest;
    }

    //ToDo Shopclass um mehrere Benutzer mit mehreren Gutscheinen zu verwalten und das System zu simulieren
}
