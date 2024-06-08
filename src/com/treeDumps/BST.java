package com.treeDumps;


import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class BST {
    public Node Insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.data){
            root.left = Insert(root.left,value);
        } else {
            root.right = Insert(root.right,value);
        }
        return root;
    }

    public void Display(Node root) {
        if(root == null) return ;

        Display(root.left);
        System.out.println(root.data);
        Display(root.right);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int n = sc.nextInt();

        Node root = null;

        while(n-- > 0){
            int value = sc.nextInt();
            root = tree.Insert(root,value);
        }
        tree.Display(root);
    }
}


