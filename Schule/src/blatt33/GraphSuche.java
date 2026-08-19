package blatt33;

import blatt32.aufgabe03.Graph;

public class GraphSuche {

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

    public static void main(String[] args) {
        int[][] testgraph = new int[5][3];
        for (int i = 0; i < testgraph.length; i++) {
            for (int j = 0; j < testgraph[i].length; j++) {
                if (i == j) {
                    testgraph[i][j] = 0;
                } else {
                    testgraph[i][j] = 25;
                }
            }
        }
        //testgraph[1][2] = 0;


        String pfadZumUeber = "ABC";
        blatt07.ArbeitMitArrays.printArray(strToIntArray(pfadZumUeber));
        System.out.println(isPath(testgraph, pfadZumUeber));
        System.out.println(pathLength(testgraph, pfadZumUeber));
    }
}
