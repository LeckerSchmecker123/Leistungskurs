package blatt33;

import blatt32.aufgabe03.Graph;
import schgraphs.*;

import java.util.Arrays;
import java.util.Stack;

public class GraphSuche {

    static SchGraphs sg = new SchGraphs();

    public static int[]  strToIntArray(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - 'A';
        }
        return arr;
    }

    public static boolean isPath(int[][] graph, String pfad) {
        int[] intPath = strToIntArray(pfad);

        for (int i = 0; i < intPath.length - 1; i++) {
            if (graph[intPath[i]][intPath[i + 1]] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int pathLength (int[][] graph, String pfad) {
        int[] intPath = strToIntArray(pfad);
        int length = 0;

        for (int i = 0; i < intPath.length - 1; i++) {
            if (graph[intPath[i]][intPath[i + 1]] == 0) {
                return -1;
            }
            if (graph[intPath[i]][intPath[i + 1]] >= 1) {
                length += graph[intPath[i]][intPath[i + 1]];
            }
        }
        return length;
    }

    public static boolean zyklensuche(int[][] graph, int node) {

        boolean[] visited = new boolean[graph.length];

        Stack<Integer> stack = new Stack<>();

        int [] parent = new int[graph.length];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }

        stack.push(node);

        //boolean zylkus = false;

        while (!stack.isEmpty()) {
            int aktuell = stack.pop();

            if (!visited[aktuell]) {

                visited[aktuell] = true;

                sg.colorNode(aktuell,'r');
                sg.step(graph);

                System.out.println("visited: " + Arrays.toString(visited));
                System.out.println("Stack: " + stack);

                for (int i = graph.length - 1; i >= 0; i--) {
                    if (graph[aktuell][i] != 0) {

                        if (!visited[i]) {

                            parent[i] = aktuell;
                            stack.push(i);

                        } else if (parent[aktuell] != i) {
                            //zylkus = true;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] testgraph = new int[3][3];
        for (int i = 0; i < testgraph.length; i++) {
            for (int j = 0; j < testgraph[i].length; j++) {
                if (i == j) {
                    testgraph[i][j] = 1;
                } else {
                    testgraph[i][j] = (int)(1 + Math.random() * 10);
                }
            }
        }
        sg.step(testgraph);
        zyklensuche(testgraph,0);
        sg.step(testgraph);
        sg.start();
        //testgraph[1][2] = 0;

        /*
        blatt14.MultiArrays.print2DArray(testgraph);
        String pfadZumUeber = "ABC";
        blatt07.ArbeitMitArrays.printArray(strToIntArray(pfadZumUeber));
        System.out.println(isPath(testgraph, pfadZumUeber));
        System.out.println(pathLength(testgraph, pfadZumUeber));
        System.out.println(zyklensuche(testgraph, 0));

         */
    }
}
