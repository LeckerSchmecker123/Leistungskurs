package blatt32.aufgabe04;

import blatt32.aufgabe03.Graph;
import schgraphs.*;

public class Graphen {

    static SchGraphs sg = new SchGraphs();

    public static void graph1 () {
        Graph graph = new blatt32.aufgabe03.Graph(5);
        //A
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);

        //B
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        //C
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        //D
        graph.addEdge(3, 4);
        sg.step(graph.getAdjacencyMatrix());
    }

    public static void graph2 () {
        Graph graph = new blatt32.aufgabe03.Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        sg.step(graph.getAdjacencyMatrix());
    }

    public static void graph3 () {
        Graph graph = new blatt32.aufgabe03.Graph(5);

        graph.addEdge(0, 1, 3);
        graph.addEdge(1, 2, 27);
        graph.addEdge(2, 3, 175);
        graph.addEdge(3, 4, 5);

        sg.step(graph.getAdjacencyMatrix());
    }

    public static void graph4 () {
        Graph graph = new blatt32.aufgabe03.Graph(3);

        graph.addEdge(0, 1, 5 ,true);
        graph.addEdge(1, 0, 4 ,true);
        graph.addEdge(0, 2, 17 ,true);
        graph.addEdge(2, 0, 100 ,true);

        graph.addEdge(1, 2, 6, true);
        graph.addEdge(2, 1, 7, true);

        sg.step(graph.getAdjacencyMatrix());
    }

    public static void main(String[] args) {
        graph4();
        sg.start();
    }
}
