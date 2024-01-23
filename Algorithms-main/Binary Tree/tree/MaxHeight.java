package com.company.tree;

class Node {
    int data;
    Node left;
    Node right;
    Node (int item){
        data = item;
        left = right = null;
    }
}

public class MaxHeight {
    Node root;

    public int maxHeight(Node root){
        if(root == null){
            return 0;
        } else {
            int l = maxHeight(root.left);
            int r = maxHeight(root.right);
            int h = Math.max(l,r )+1;
            return h;
        }
    }

    public static void main (String[] args){
        MaxHeight height = new MaxHeight();
        height.root = new Node(1);
        height.root.left = new Node(2);
        height.root.left.left = new Node(2);
        height.root.left.right= new Node(2);
        height.root.left.left.left = new Node(2);
        System.out.println(height.maxHeight(height.root));
    }
}
