package blatt20_aufgabe0;

public class Benutzerkonto {

    private String benutzername;
    private String mail;
    private String geburtsdatum;
    private String erstellungsdatum;
    private String passwort;
    private double gutscheinguthaben;
    String gutscheinCodeTest = "abcd";

    public Benutzerkonto(String benutzername, String mail, String passwort, String geburtsdatum) {
        this.benutzername = benutzername;
        this.mail = mail;
        this.passwort = passwort;
        this.geburtsdatum = geburtsdatum;
        this.gutscheinguthaben = 0;
        this.erstellungsdatum = "1.1.1500";
    }

    public boolean anmelden (String passwort) {
        if (this.passwort.equals(passwort)) {
            return true;
        }
        return false;
    }

    public void passwortAendern (String passwortAlt, String passwortNeu) {
        if (anmelden(passwortAlt)) {
            this.passwort = passwortNeu;
        }
    }

    public void gutscheinEinloesen (String gutscheincode, double gutscheinBetrag) {
        if (this.gutscheinCodeTest.equals(gutscheincode)) {
            this.gutscheinguthaben += gutscheinBetrag;
        }
    }


}
