package com.company;

import java.util.*;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }

    public static void sumDeep(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        int sum = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();

            System.out.println(node.value);

            sum = sum + node.value;

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public static void sumWide(Tree root) {
        Queue<Tree> stack = new ArrayDeque<>();
        stack.add(root);
        int sum = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.remove();

            System.out.println(node.value);

            sum = sum + node.value;

            if (node.left != null) {
                stack.add(node.left);
            }

            if (node.right != null) {
                stack.add(node.right);
            }
        }
    }
}

