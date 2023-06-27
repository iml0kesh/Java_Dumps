package com.treeDumps;

import java.util.Scanner;

public class BinaryTree {
    class Node {
        int data;
        Node left;
        Node right;
        public Node (int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node root;

    public void insert(Scanner sc){
        System.out.println("Enter the root: ");
        int value = sc.nextInt();
        Node node = new Node(value);
        insert(sc,root);
    }

    public void insert(Scanner sc, Node node){
        System.out.println("enter left of : "+ node.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("data for left of: " + node.data);
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc,node.left);
        }

        System.out.println("enter right of : "+ node.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("data for right of: " + node.data);
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc,node.right);
        }
    }

    public void display(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
