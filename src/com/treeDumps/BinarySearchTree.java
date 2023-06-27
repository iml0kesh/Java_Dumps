package com.treeDumps;

public class BinarySearchTree {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }

    }

    private Node root;

    public BinarySearchTree() {

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }


    public void insert(int value) {

    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        return node;
    }
    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String x){
        if(root == null){

        }
    }

}
