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
            System.out.println("Das Gatter verfügt über einen Eingang und einen Ausgang.");

        } else if (antwortGatter.equals("OR")) { // Fall 2: Nutzer hat sich für das OR-Gatter entschieden.
            System.out.println("Das OR-Gatter:");
            System.out.println("Das Gatter verfügt über mindestens 2 Eingänge und einen Ausgang.");

        } else if (antwortGatter.equals("AND")) { // Fall 3: Nutzer hat sich für das AND-Gatter entschieden.
            System.out.println("Das AND-Gatter:");
            System.out.println("Das Gatter verfügt über 2 Eingänge und einen Ausgang.");

        } else if (antwortGatter.equals("XOR")) { // Fall 4: Nutzer hat sich für das XOR-Gatter entschieden.
            System.out.println("Das XOR-Gatter:");
            System.out.println("Das Gatter verfügt über 2 Eingänge und einen Ausgang.");

        } else { // Ausnahme Fall: Nutzer hat eine invalide Antwort gegeben.
            System.out.println("Dies ist eine falsche Eingabe");
            System.exit(0);
        }
    }
}