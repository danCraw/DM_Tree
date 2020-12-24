package com.company;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private static int infinite = 9999999;
    int[][] wayDistance;
    int nodes;
    private Map<String, Integer> reachability = new HashMap<>();

    Graph(int[][] matrix) {
        int i, j;
        nodes = matrix.length;
        wayDistance = new int[nodes][nodes];
        for (i = 0; i < nodes; i++) {
            for (j = 0; j < nodes; j++) {
                wayDistance[i][j] = matrix[i][j];
                if (wayDistance[i][j] == 0)
                    wayDistance[i][j] = infinite;
            }
        }
        for (i = 0; i < nodes; i++) {
            for (j = 0; j < nodes; j++)
                if (wayDistance[i][j] < infinite)
                    System.out.print(" " + wayDistance[i][j] + " ");
                else
                    System.out.print(" * ");
            System.out.println();
        }
    }

    public void findOstTree() {
        int i, j, x, y;
        boolean[] reached = new boolean[nodes];
        int[] prewNode = new int[nodes];
        reached[0] = true;
        for (int k = 1; k < nodes; k++) {
            reached[k] = false;
        }
        prewNode[0] = 0;
        printReachSet(reached);
        for (int k = 1; k < nodes; k++) {
            x = y = 0;
            for (i = 0; i < nodes; i++)
                for (j = 0; j < nodes; j++) {
                    if (reached[i] && !reached[j] && wayDistance[i][j] < wayDistance[x][y]) {
                        x = i;
                        y = j;
                    }
                }

            System.out.println("кратчайший путь:(" + + (x + 1) + "," + (y + 1) + ")" + " стоимость = " + wayDistance[x][y]);

            prewNode[y] = x;
            reached[y] = true;
            printReachSet(reached);
            System.out.println();
        }
        int[] a = prewNode;
        System.out.println(reachability.toString());
    }

    void printReachSet(boolean[] Reached) {

        System.out.print("Достигнутые вершины : ");
        for (int i = 0; i < Reached.length; i++)
            if (Reached[i])
                System.out.print((i + 1) + " ");
        System.out.println();
    }
}