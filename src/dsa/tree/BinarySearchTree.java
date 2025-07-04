package dsa.tree;


import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    // insertion
    private Node addRecursive(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if(value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            System.out.println("Already Inserted");
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(1);
        bst.add(4);
        bst.add(0);
        bst.add(7);
        bst.add(6);
        bst.add(7);

        bst.traverseInOrder();
    }
}
