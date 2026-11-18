package A2_Flaggenmuster;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;

/**
 * @author B.Sauerstein
 * Gymnasium Ricarda-Huch-Schule Braunschweig 2025
 */

public class A2_klassisch
{
    public static void main(String[] args) {
        //alternativ mit Dateipfad
        //SimpleInput input = new SimpleInput();
        //String datei = input.getString("Bitte Dateipfad fuer Loesung eingeben!");

        //die ZIP-Datei einfach im Projektordner speichern, dann reicht das hier:
        String datei = "/Users/lmuth/IdeaProjects/Leistungskurs/Schule/src/A2_Flaggenmuster/Flaggen_neu.zip";
        dateiEinlesen(datei);
    }

    public static void dateiEinlesen(String datei){
        File file = new File(datei);
        if (!file.canRead() || !file.isFile()){
            System.exit(0);
        }

        final int ANZAHL_FLAGGEN = 199;
        String namen[] = new String[ANZAHL_FLAGGEN];
        String laender[] = new String[ANZAHL_FLAGGEN];
        BufferedImage flaggen[] = new BufferedImage[ANZAHL_FLAGGEN];

        try {
            ZipFile zip = new ZipFile(datei);
            Enumeration<? extends ZipEntry> eintraege = zip.entries();
            int i = 0;
            while (eintraege.hasMoreElements()){
                ZipEntry eintrag = eintraege.nextElement();
                if (eintrag.getName().contains("MACOSX")){
                    //System.out.println(i + " ");
                    continue;
                }
                //System.out.println(eintrag.getName());
                //System.out.println(i);
                if (!eintrag.isDirectory() && eintrag.getName().toLowerCase().endsWith(".png")){
                    namen[i] = eintrag.getName();//eintrag.getName().substring(eintrag.getName().lastIndexOf("/") + 1, eintrag.getName().lastIndexOf("."));
                    System.out.println(namen[i]);
                    i++;
                }
            }
            Arrays.sort(namen);

            for (i=0; i<ANZAHL_FLAGGEN; i++){
                ZipEntry eintrag = zip.getEntry(namen[i]);
                InputStream bildIn = zip.getInputStream(eintrag);
                flaggen[i] = ImageIO.read(bildIn);
                bildIn.close();
                laender[i] = namen[i].substring(namen[i].lastIndexOf("/")+1, namen[i].length()-4);
            }
            zip.close();

            System.out.println("Es wurden " + flaggen.length + " Flaggen eingelesen.");
            if (flaggen.length > 0){
                System.out.println("Die erste Flagge gehoert zu " + laender[0] + " und ist " + flaggen[0].getWidth() + " x " + flaggen[0].getHeight() + " Pixel gross.");
                Color farbe = new Color(flaggen[0].getRGB(0, 0));
                System.out.println("RGB-Wert des Pixels [0][0]: (" + farbe.getRed() + ", " + farbe.getGreen() + ", " + farbe.getBlue() + ")");
            }
            //for (int j = 0; j < flaggen.length - 1; j++){
            //    System.out.println("und ist " + flaggen[j].getWidth() + " x " + flaggen[j].getHeight() + " Pixel gross.");
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
