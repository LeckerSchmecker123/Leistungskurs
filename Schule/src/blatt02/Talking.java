package blatt02;

import java.util.Scanner; // Ein Scanner wird Hinzugefügt

public class Talking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner wird benannt und "eingeschaltet"
        System.out.println("Guten Tag, wie heißen Sie?"); // Es wird eine Frage an den Nutzer gestellt
        String name = input.nextLine(); // Eingabe für die zuvor gestellte Frage wird erstellt (Input vom Nutzer wird erwartet)
        System.out.println("Hallo " + name + "!"); //Das Programm nutzt den Input des Nutzers, um ihn zu grüßen
    }
}
