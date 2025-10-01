package blatt08;

import  java.util.Scanner;

public class Palindrom {

    /**
     * Die Prozedur dreht einen angegebenen String um
     * @param str Wort
     * @return ausgabe des Strings
     */
    public static String umdrehen (String str) {
        str = str.toLowerCase();
        char[] charr = str.toCharArray();
        for (int i = 0; i < charr.length / 2; i++) {
            char temp = charr[i];
            charr[i] = charr[charr.length - i - 1];
            charr[charr.length - i - 1] = temp;
        }
        String s = new String(charr);
        return s;
    }

    /**
     * Die Prozedur überprüft, ob sich der String um ein Palindrom handelt
     * @param str Wort
     * @return ausgabe als boolean
     */
    public static boolean istPalindrom(String str) {
        str = str.toLowerCase();
        char [] charr = str.toCharArray();
        for (int i = 0; i < charr.length / 2; i++) {
            if (charr[i] != charr[charr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ist Palindrom?");
        System.out.println("Bitte geben Sie ein Wort ein");
        String str = input.nextLine();
        System.out.println(istPalindrom(str));

        System.out.println("Umdrehen:");
        System.out.println("Bitte geben Sie ein Wort ein");
        String str2 = input.nextLine();
        System.out.println(umdrehen(str2));
    }
}