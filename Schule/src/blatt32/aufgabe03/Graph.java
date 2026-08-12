package blatt32.aufgabe03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Graph {

    private int[][] adjazenxmatrix;

    public Graph() {
        adjazenxmatrix = new int[0][0];
    }

    public  Graph (int size) {
        adjazenxmatrix = new int[size][size];
    }

    public void addVertex() {
        int[][] adj = new int[this.adjazenxmatrix.length + 1][this.adjazenxmatrix[0].length + 1];

        for (int i = 0; i < this.adjazenxmatrix.length; i++) {
            for (int j = 0; j < this.adjazenxmatrix[0].length; j++) {
                adj[i][j] = this.adjazenxmatrix[i][j];
            }
        }

        this.adjazenxmatrix = adj;
    }

    public void addEdge(int from, int to, int weight, boolean isDirected) {
        if (from == to || from < 0 || to < 0 || to >= adjazenxmatrix.length || from >= adjazenxmatrix.length) {
            throw new IllegalArgumentException();
        }
        if (isDirected) {
            this.adjazenxmatrix[from][to] = weight;
        } else  {
            this.adjazenxmatrix[from][to] = weight;
            this.adjazenxmatrix[to][from] = weight;
        }
    }

    public void addEdge(int from, int to, int weight) {
        addEdge(from, to, weight, false);
    }

    public void addEdge(int from, int to) {
        addEdge(from, to, 1, false);
    }

    public void addEdge(int from, int to, boolean isDirected) {
        addEdge(from, to, 1, isDirected);
    }

    public int size() {
        return this.adjazenxmatrix.length;
    }

    public boolean isWeighted() {
        for (int i = 0; i < this.adjazenxmatrix.length; i++) {
            for (int j = 0; j < this.adjazenxmatrix[0].length; j++) {
                if (this.adjazenxmatrix[i][j] > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDirected() {
        for (int i = 0; i < this.adjazenxmatrix.length; i++) {
            for (int j = i + 1; j < this.adjazenxmatrix[0].length; j++) {
                if (this.adjazenxmatrix[i][j] != this.adjazenxmatrix[j][i]) {
                        return false;
                }
            }
        }
        return true;
    }

    public int[][] getAdjacencyMatrix() {
        int[][] copiedMatrix = new int[this.adjazenxmatrix.length][this.adjazenxmatrix[0].length];
        for (int i = 0; i < this.adjazenxmatrix.length; i++) {
            for (int j = 0; j < this.adjazenxmatrix[0].length; j++) {
                copiedMatrix[i][j] = this.adjazenxmatrix[i][j];
            }
        }
        return copiedMatrix;
    }

    public int[] getNeighbours(int knoten) {
        int[] neighbours = new int[this.adjazenxmatrix.length];
        for (int i = 0; i < this.adjazenxmatrix.length; i++) {
            if (this.adjazenxmatrix[i][knoten] != 0) {
                neighbours[i] = this.adjazenxmatrix[i][knoten];
            }
        }
        return neighbours;
    }

    public void exportHTML(String filename) {
        try {
            File f = new File("Schule/io/export/" + filename + ".html");
            FileWriter fw = new FileWriter(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
