package com.treeDumps;

import java.util.Scanner;

public class TreeNode01 {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.data = x;
            left = null;
            right = null;
        }

    }
    TreeNode root = null;

    public TreeNode insertChild( int x){
        TreeNode nn = new TreeNode(x);
        if(root == null){
            root = nn;
        }
        if(x > root.data){
            root.right = insertChild(x);
        } else if (x < root.data) {
            root.left = nn;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
