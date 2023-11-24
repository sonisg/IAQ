package com.company.tree;

public class InvertTree {

    TreeNode root;

    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return null;
        }
        if(root!=null){
            TreeNode t = root.right;
            root.right = root.left;
            root.left = t;
        }

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }

    public void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.val + " ");
            printTree(node.right);
        }
    }

    public static void main (String[] args){
        InvertTree tree1 = new InvertTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.left.left = new TreeNode(3);
        tree1.root.left.right= new TreeNode(4);
        tree1.root.left.left.left = new TreeNode(5);


        System.out.println("Original Tree:");
        tree1.printTree(tree1.root);

        // Invert the tree
        tree1.invertTree(tree1.root);

        System.out.println("\nInverted Tree:");
        tree1.printTree(tree1.root);
    }
}
