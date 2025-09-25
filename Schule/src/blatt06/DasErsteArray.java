package blatt06;

public class DasErsteArray {
    public static void main(String[] args) {
        int [] index = new int[990];
        int a = 10;

        //Ausgabe des Index mit jeweiligem Wert
        for (int i = 0; i <= index.length - 1; i++) {
            index[i] = a + i;
            System.out.println("Index " + i + "hat den Wert: " + index[i]);
        }

        System.out.println("\n");

        //Ausgabe des Index mit jeweiligem Wert (rückwärts)
        for (int i = index.length - 1; i >= 0; i--) {
            index[i] = a + i;
            System.out.println("Index " + i + "hat den Wert: " + index[i]);
        }
    }
}
