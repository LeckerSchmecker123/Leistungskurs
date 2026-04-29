package blatt27.aufgabe01;

public class Main {
    public static void main(String[] args) {
        DynArray d = new DynArray(10);

        d.fillArr();

        System.out.println(d.size());

        System.out.println(d.isEmpty());

        System.out.println(d.get(7));

        System.out.println(d.contains(4));

        System.out.println(d.indexOf(11));

        d.printArr();
        d.add(1);
        d.printArr();
    }
}
