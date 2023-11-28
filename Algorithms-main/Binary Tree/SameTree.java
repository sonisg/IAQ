package com.company.tree;
class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }
public class SameTree {

    TreeNode root;

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main (String[] args){
        SameTree tree1 = new SameTree();
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
        System.out.println(isSameTree(tree1.root, tree2.root));
    }
}
