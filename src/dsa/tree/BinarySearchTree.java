package dsa.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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

    // Inorder Traversal
    // Left -> Root -> Right
    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value + "_");
            traverseInOrder(node.right);
        }
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    // Preorder Traversal
    // Root -> Left -> Right
    private void traversePreOrder(Node node){
        if(node != null) {
            System.out.print(node.value + "_");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    // Postorder Traversal
    // Left -> Right -> Root
    private void traversePostOrder(Node node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value + "_");
        }
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void BFS(Node root) {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            currentNode = queue.remove();
//            list.add(currentNode.value);
            System.out.print(currentNode.value+" ");
            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public void BFS() {
        BFS(root);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(47);
        bst.add(21);
        bst.add(76);
        bst.add(18);
        bst.add(27);
        bst.add(52);
        bst.add(82);

        bst.traverseInOrder();
        System.out.println();

        bst.traversePreOrder();
        System.out.println();

        bst.traversePostOrder();
        System.out.println();

        bst.BFS();
    }
}
