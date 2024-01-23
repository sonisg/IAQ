package com.company.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    TreeNode root;

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList();

        if(root==null){
            return res;
        }

        if(root.left!=null){
            res.addAll(inorderTraversal(root.left));
        }

        res.add(root.val);

        if(root.right!=null){
            res.addAll(inorderTraversal(root.right));
        }

        return res;

    }

    public static void main (String[] args){
        InorderTraversal tree1 = new InorderTraversal();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.left.left = new TreeNode(3);
        tree1.root.left.right= new TreeNode(4);
        tree1.root.left.left.left = new TreeNode(5);


        System.out.println("Original Tree:");
        List<Integer> result = tree1.inorderTraversal(tree1.root);

        // Print the result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
