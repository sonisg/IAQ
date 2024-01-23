package com.company.tree;

public class SymmetricTree {

    TreeNode root;

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;  // An empty tree is symmetric
        }

        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(TreeNode l, TreeNode r){

        if(l == null && r==null){
            return true;
        }

        if(l == null || r==null){
            return false;
        }

        return (l.val == r.val) && isMirror(l.left, r.right) && isMirror(l.right, r.left);
    }

    public static void main (String[] args){
        SymmetricTree tree1 = new SymmetricTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.left.left = new TreeNode(2);
        tree1.root.left.right= new TreeNode(2);
        tree1.root.left.left.left = new TreeNode(2);

        SameTree tree2 = new SameTree();
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.left.left = new TreeNode(2);
        tree2.root.left.right= new TreeNode(2);
        tree2.root.left.left.left = new TreeNode(2);
        System.out.println(isSymmetric(tree1.root));
    }
}
