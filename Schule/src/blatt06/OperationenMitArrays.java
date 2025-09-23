package blatt06;

public class OperationenMitArrays {
    public static void main(String[] args) {
        int [] auftrag = new int[]{9000, 23000, 41000, 6000, 13000, 22000, 38000, 16000, 7000, 14000, 12000, 5000, 17000};

        int summe = 0;

        /*
        int zwischenSpeicher = auftrag[1];
        auftrag[1] = auftrag[6];
        auftrag[6] = zwischenSpeicher;
         */

        System.out.println("\nDies sind alle Aufträge:");
        for (int i = 0; i < auftrag.length; i++) {
            System.out.println(auftrag[i] + " €");
            summe += auftrag[i];
        }

        System.out.println("\nDies ist die Gesamtsumme der Aufträge");
        System.out.println(summe + " €");

        System.out.println("\nDies sind alle Aufträge mti einem Wert über 15000€");
        for (int i = 0; i < auftrag.length; i++) {
            if (auftrag[i] >= 15000) {
                System.out.println((i + 1) + ": " + auftrag[i] + " €");
            }
        }
        /*
        int zwischenSpeicher2 = auftrag[0];
        for (int i = auftrag.length; i >= 0; i--) {
            auftrag[i] = auftrag[i];
        }
         */
    }
}
