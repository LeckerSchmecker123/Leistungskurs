package blatt16;

import java.io.File;
import java.io.FileWriter;

public class Systemsprenger {

    public static void sprengen (int anzahl) {
        try {
            for (int i = 1; i <= anzahl; i++) {
                File tx = new File("Schule/sprengtest/Textdatei" + i + ".txt");

                try {
                    FileWriter fw = new FileWriter(tx);
                    fw.write(i + "haus\n");
                    int auswahl = (int) (Math.random() * anzahl);
                    if (auswahl % 2 == 0) {
                        fw.write("Hurensohn\n");
                    }

                    //if (auswahl % 3 == 0) {
                    //    fw.write("Fotze\n");
                    //}

                    fw.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        File f = new File("Schule/sprengtest");
        if (f.exists() != true) {
            f.mkdir();
        }
        sprengen(1000);
    }
}
