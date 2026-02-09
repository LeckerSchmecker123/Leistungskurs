package blatt16;

import java.io.File;
import java.io.FileWriter;

public class Suchkommando {

    public static void suchen (String dateiname, String dateiendung) {
        try {
            File f = new File("Schule/io/forSearch/" + dateiname + "." + dateiendung);
            if  (f.exists()) {
                System.out.println(f.getAbsolutePath());
            }
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        suchen("test2", "txt");
    }
}
