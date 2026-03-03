package blatt16;

import blatt07.ArbeitMitArrays;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Suchkommando {

    public static String[] suchen (String dateiname, String dateiendung) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> found = new ArrayList<String>();
        File root = new File(dateiendung);
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Das Startverzeichnis ist nicht auffindbar");
            return null;
        }
        ArrayList<File> liste = new ArrayList<>();
        File[] files = root.listFiles();
        for (int i = 0; i < files.length; i++) {
            liste.add(files[i]);
        }

        while (!liste.isEmpty()) {
            File f = liste.get(0);

            if (f.getName().equals(dateiname)) {
                System.out.println(f.getAbsolutePath());
                found.add(f.getAbsolutePath());

                System.out.println("Soll weiter gesucht werden? (Ja/Nein): ");
                if (input.next().toUpperCase() == "N") {
                    return found.toArray(new String[0]);
                }
            } else if (f.isDirectory()) {
                File[] newFiles = f.listFiles();
                if (newFiles != null) {
                    for (int j = 0; j < newFiles.length; j++) {
                        liste.add(newFiles[j]);
                        //System.out.println(newFiles[j].getAbsolutePath());
                    }
                }
            }
            liste.remove(0);
        }
        return found.toArray(new String[0]);
    }


    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (File f : roots) {
            System.out.println(f.getAbsolutePath());
        }
        String[] found = suchen("bittiFindiMichi.txt", roots[0].getAbsolutePath());
        ArbeitMitArrays.printArray(found);
    }
}
