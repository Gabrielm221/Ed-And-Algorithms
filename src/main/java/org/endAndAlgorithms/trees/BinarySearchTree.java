package org.endAndAlgorithms.trees;

import org.endAndAlgorithms.trees.node.Node;

import java.util.Scanner;

public class BinarySearchTree {

    // First node of the tree Reference.
    private Node root;

    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Binary Search Tree implementation in Java.");
        System.out.println("Enter the number of elements:");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Enter element: " + (i + 1));

            Long value = Long.parseLong(scanner.nextLine());

            insert(value);
        }
        System.out.println("Elements inserted into the Binary Search Tree. Now, let's display them in-order:");
        inOrder();
        System.out.println("And here's the tree structure:");
        showTree();
    }

    // Inserts a new node into the tree.
    public void insert(Long value) {

        root = insertNode(root, value);

    }

    // Private method: traverses the tree and finds the correct position.
    private Node insertNode(Node current, Long value) {

        // If we reach a null node, we've found the correct position.
        // We create a new node and return its reference.
        if (current == null) {
            return new Node(value);
        }

        // If the value is less than the current node's value, we traverse the left side.
        if (value < current.getValue()) {

            current.setLeft(
                    insertNode(current.getLeft(), value)
            );

        }

        // If the value is greater than the current node's value, we traverse the right side.
        else if (value > current.getValue()) {

            current.setRight(
                    insertNode(current.getRight(), value)
            );

        }

        // Return the current node to preserve its reference.
        return current;
    }

    // SHOW the tree in-order.
    public void inOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node current) {

        if (current == null) {
            return;
        }

        inOrderTraversal(current.getLeft());

        System.out.println(current.getValue());

        inOrderTraversal(current.getRight());
    }

    public void showTree() {
        showTreeComplete(root, "", true);
    }

    private void showTreeComplete(Node current, String prefix, boolean isLast) {

        if (current == null) {
            return;
        }

        System.out.println(
                prefix + (isLast ? "└── " : "├── ") + current.getValue()
        );

        boolean hasLeft = current.getLeft() != null;
        boolean hasRight = current.getRight() != null;

        if (hasLeft) {
            showTreeComplete(
                    current.getLeft(),
                    prefix + (isLast ? "    " : "│   "),
                    !hasRight
            );
        }

        if (hasRight) {
            showTreeComplete(
                    current.getRight(),
                    prefix + (isLast ? "    " : "│   "),
                    true
            );
        }
    }
}