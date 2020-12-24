package com.company;

public class Main {

    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));
        System.out.println("в ширину");
        Tree.wide(root);
        System.out.println();
        System.out.println("в глубину");
        Tree.deep(root);

        int[][] arr = {{0,3,0,2,0,0,0,0,4},  // 1
                       {3,0,0,0,0,0,0,4,0},  // 2
                       {0,0,0,6,0,1,0,2,0},  // 3
                       {2,0,6,0,1,0,0,0,0},  // 4
                       {0,0,0,1,0,0,0,0,8},  // 5
                       {0,0,1,0,0,0,8,0,0},  // 6
                       {0,0,0,0,0,8,0,0,0},  // 7
                       {0,4,2,0,0,0,0,0,0},  // 8
                       {4,0,0,0,8,0,0,0,0}   // 9
        };
        Graph g = new Graph(arr);
        g.findOstTree();
    }
}
