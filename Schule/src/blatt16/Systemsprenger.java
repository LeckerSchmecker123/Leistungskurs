package blatt16;

import java.io.File;
import java.io.FileWriter;

public class Systemsprenger {

    public static void sprengen (int anzahl) {
        try {
            File a =  new File("Schule/sprengtest/Textdatei00.txt");
            FileWriter fw = new FileWriter(a);
            //TODO: in for schleife namen ändern und inhalt hinzufügen
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        File f = new File("Schule/sprengtest");
        if (f.exists() != true) {
            f.mkdir();
        }
        sprengen(10);
    }
}
