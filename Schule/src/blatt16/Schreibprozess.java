package blatt16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Schreibprozess {
    public static void main(String[] args) {

        File f = new File("Schule/io");
        if (f.exists() != true) {
            f.mkdir();
        }
        System.out.println(f.exists());
        System.out.println(f.isDirectory());


        try {
            File t1 = new File("Schule/io/Test01.txt");
            FileWriter fw = new FileWriter(t1);
            fw.write("Das ist ein Test\n");
            fw.write("Der testet\n");
            fw.write("Und ein Test ist\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try {
            File t2 = new File("Schule/io/Test02.html");
            FileWriter fw = new FileWriter(t2);
            fw.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>HTML aus Java</title>\n" +
                    "</head>\n" +
                    "<body>\n" +

                    "<h1>HTML aus Java?</h1>\n" +
                    "<p>Es geht. Wirklich.</p>\n" +

                    "</body>\n" +
                    "</html>\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
