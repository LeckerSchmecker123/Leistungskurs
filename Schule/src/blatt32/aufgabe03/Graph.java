package blatt32.aufgabe03;

public class Graph {

    private int[][] Adjazenzmatrix;
    private int Knoten;
    private int[] arr;

    public Graph() {
        this.Adjazenzmatrix = null;
        this.Knoten = 0;
    }

    public Graph(int[][] Adjazenzmatrix,  int Knoten) {
        this.Adjazenzmatrix = Adjazenzmatrix;
        this.Knoten = Knoten;
        this.arr = new int[Knoten];
    }

    public void addVertex() {
        int[][] tempArr = new int[Knoten + 1][Knoten + 1];
        for (int i = 0; i <= Knoten; i++) {
            for (int j = 0; j <= Knoten; j++) {
                try {
                    tempArr[i][j] = this.Adjazenzmatrix[i][j];
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        this.Adjazenzmatrix = tempArr;
    }

}
