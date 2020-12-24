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

    public static void deep(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Tree node = stack.pop();

            System.out.println(node.value);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public static void wide(Tree root) {
        Queue<Tree> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree node = queue.remove();

            System.out.println(node.value);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}

