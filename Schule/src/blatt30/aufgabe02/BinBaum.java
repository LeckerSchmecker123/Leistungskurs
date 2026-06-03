package blatt30.aufgabe02;

public class BinBaum {

    private Node root;

    public BinBaum() {
        this.root = null;
    }

    public BinBaum(Node root) {
        this.root = root;
    }


    public Node search(int value) {
        Node n = this.root;

        if (n == null) {
            System.out.println("FEHLERRRRRR: Der Baum ist leer");
            return null;
        }
        while (true) {
            if (n.getWert() == value) {
                return n;
            } else if (value < n.getWert()) {
                n = n.getLeft();
            }  else {
                n = n.getRight();
            }
        }
    }

    public void add(int value) {
        Node n = this.root;

        if (search(value) != null) {
            System.out.println("FEHLERRRRR: Wert bereits vorhanden");
        }
        while (true) {
            if (value < n.getWert()) {
                if (n.getLeft() == null) {
                    n.setLeft(new Node(value)); //bin mir hier unsicher ob ich das richtige node mache
                    break;
                }
                n = n.getLeft();
            } else {
                if (n.getRight() == null) {
                    n.setRight(new Node(value)); //bin mir hier unsicher ob ich das richtige node mache
                    break;
                }
                n = n.getRight();
            }
        }
    }

    public Node remove(int value) {
        Node n = search(value);
        //TODO: weiter fälle beachten
        if (n.getLeft() == null || n.getRight() == null) {
            n =  null;
        } else if (n.getLeft() != null || n.getRight() == null) {

        }
        return n;//TODO:
    }

    public int depth (BinBaum baum) {
        int depth = 0;
        Node n = baum.root;
        return -1;
    }
}