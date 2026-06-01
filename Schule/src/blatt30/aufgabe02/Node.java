package blatt30.aufgabe02;

public class Node {

    private int wert;
    private Node left;
    private Node right;

    public Node(int wert) {
        this.wert = wert;
        this.left = null;
        this.right = null;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node findInOrderVor (Node n) {
        if (n != null) {
            n = n.getLeft();
            while (n.getRight() != null) {
                n = n.getRight();
            }
            return n;
        }
        return null;
    }

    public Node findInOrderNach (Node n) {
        if (n != null) {
            n = n.getRight();
            while (n.getLeft() != null) {
                n = n.getLeft();
            }
            return n;
        }
        return null;
    }

    public Node[] findInOrderNeighbour (Node n) { //Array [In Order Vorgänger/ In Order Nachgänger]
        Node vor = findInOrderVor(n);
        Node nach = findInOrderNach(n);
        Node[] nArray = new Node[2]; //0 -> vor; 1 -> nach
        nArray[0] = vor;
        nArray[1] = nach;
        return nArray;
    }
}
