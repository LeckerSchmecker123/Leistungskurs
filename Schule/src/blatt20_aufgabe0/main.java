package blatt20_aufgabe0;

public class main {
    public static void main(String[] args) {

        Smartphone a1 = new Smartphone(128, 2500, "Iphone 11", "apple", 8, 100, 100, "IOS 26");
        Smartphone a2 = new Smartphone(128, 2500, "Iphone 11", "apple", 8, 100, 100, "IOS 26");
        Smartphone a3 = new Smartphone(256, 3000, "Iphone 11", "apple", 8, 100, 100, "IOS 26");

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }
}
