package blatt03;

import java.util.Scanner;

public class MitOderOhneStrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Frage an Nutzer um zwischen 4 Fällen zu unterscheiden.
        System.out.println("Bitte wählen sie zwischen Folgenden vier Gattern: NOT, OR, AND, XOR");
        String antwortGatter = input.nextLine();

        if (antwortGatter.equals("NOT")) { // Fall 1: Nutzer hat sich für das NOT-Gatter entschieden.
            System.out.println("Das NOT-Gatter:");
            System.out.println("Das Gatter verfügt über einen Eingang und einen Ausgang.\n");

            // Frage, ob sich Strom auf Eingang befindet
            System.out.println("Befindet sich auf dem Eingang Strom? (true/false)");
            boolean eingang = input.nextBoolean();

            // Fallunterscheidung
            if (eingang == true) { // Fall 1.1: Es ist Strom auf dem Eingang, dadurch ist beim Ausgang kein Strom.
                System.out.println("NOT " + eingang + " = false");
            } else if (eingang == false) { // Fall 1.2: Es ist kein Strom auf dem Eingang, dadurch ist beim Ausgang Strom.
                System.out.println("NOT" + eingang + " = true");
            }

        } else if (antwortGatter.equals("OR")) { // Fall 2: Nutzer hat sich für das OR-Gatter entschieden.
            System.out.println("Das OR-Gatter:");
            System.out.println("Das Gatter verfügt über mindestens 2 Eingänge und einen Ausgang.\n");

            // Fragen, ob sich Strom auf den beiden Ausgängen befindet
            System.out.println("Befindet sich auf dem ersten Eingang Strom? (true/false)");
            boolean eingang1 = input.nextBoolean();
            System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false)");
            boolean eingang2 = input.nextBoolean();

            // Fallunterscheidung
            if (eingang1 == true && eingang2 == true) { // Fall 2.1: Auf beiden Eingängen befindet sich Strom, dadurch befindet sich auf dem Ausgang Strom.
                System.out.println(eingang1 + " OR " + eingang2 + " = true");
            } else if (eingang1 == true && eingang2 == false) { // Fall 2.2: Nur auf dem ersten Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang Strom.
                System.out.println(eingang1 + " OR " + eingang2 + " = true");
            } else if (eingang1 == false && eingang2 == true) { // Fall 2.3: Nur auf dem zweiten Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang Strom.
                System.out.println(eingang1 + " OR " + eingang2 + " = true");
            } else if (eingang1 == false && eingang2 == false) { // Fall 2.4: Auf keinen der beiden Eingänge befindet sich Strom, dadurch ist auf dem Ausgang kein Strom.
                System.out.println(eingang1 + " OR " + eingang2 + " = false");
            }

        } else if (antwortGatter.equals("AND")) { // Fall 3: Nutzer hat sich für das AND-Gatter entschieden.
            System.out.println("Das AND-Gatter:");
            System.out.println("Das Gatter verfügt über 2 Eingänge und einen Ausgang.\n");

            // Fragen, ob sich Strom auf den beiden Ausgängen befindet
            System.out.println("Befindet sich auf dem ersten Eingang Strom? (true/false)");
            boolean eingang1 = input.nextBoolean();
            System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false)");
            boolean eingang2 = input.nextBoolean();

            //Fall Unterscheidung
            if (eingang1 == true && eingang2 == true) { // Fall 3.1: Auf beiden Eingängen befindet sich Strom, dadurch befindet sich auf dem Ausgang Strom.
                System.out.println(eingang1 + " AND " + eingang2 + " = true");
            } else if (eingang1 == true && eingang2 == false) { // Fall 3.2: Nur auf dem ersten Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang kein Strom.
                System.out.println(eingang1 + " AND " + eingang2 + " = false");
            } else if (eingang1 == false && eingang2 == true) { // Fall 3.3: Nur auf dem zweiten Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang kein Strom.
                System.out.println(eingang1 + " AND " + eingang2 + " = false");
            } else if (eingang1 == false && eingang2 == false) { // Fall 3.4: Auf keinen Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang kein Strom.
                System.out.println(eingang1 + " AND " + eingang2 + " = false");
            }

        } else if (antwortGatter.equals("XOR")) { // Fall 4: Nutzer hat sich für das XOR-Gatter entschieden.
            System.out.println("Das XOR-Gatter:");
            System.out.println("Das Gatter verfügt über 2 Eingänge und einen Ausgang.\n");

            // Fragen, ob sich Strom auf den beiden Ausgängen befindet
            System.out.println("Befindet sich auf dem ersten Eingang Strom? (true/false)");
            boolean eingang1 = input.nextBoolean();
            System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false)");
            boolean eingang2 = input.nextBoolean();

            // Fallunterscheidung
            if (eingang1 == true && eingang2 == true) { // Fall 4.1: Auf beiden Eingängen befindet sich Strom, dadurch befindet sich auf dem Ausgang kein Strom.
                System.out.println(eingang1 + " XOR " + eingang2 + " = false");
            } else if (eingang1 == true && eingang2 == false) { // Fall 4.2: Nur auf dem ersten Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang Strom.
                System.out.println(eingang1 + " XOR " + eingang2 + " = true");
            } else if (eingang1 == false && eingang2 == true) { // Fall 4.3: Nur auf dem zweiten Eingang befindet sich Strom, dadurch befindet sich auf dem Ausgang Strom.
                System.out.println(eingang1 + " XOR " + eingang2 + " = true");
            }  else if (eingang1 == false && eingang2 == false) { // Fall 4.4: Auf keinen der beiden Eingängen befindet sich Strom, dadurch befindet sich auf dem Ausgang kein Strom.
                System.out.println(eingang1 + " XOR " + eingang2 + " = false");
            }

        } else { // Fehlerfall: Nutzer hat eine invalide Antwort gegeben.
            System.out.println("Dies ist eine falsche Eingabe");
            System.exit(0);
        }
    }
}