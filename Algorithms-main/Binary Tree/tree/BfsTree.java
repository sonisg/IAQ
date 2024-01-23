package com.company.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTree {

    TreeNode root;

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left= this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null){
            return answer;
        }
        Queue<TreeNode> queu = new LinkedList<>();
        queu.add(root);

        while(!queu.isEmpty()){
            int lev = queu.size();
            List<Integer> levelVal = new ArrayList<>();
            for(int i =0;i<lev;i++){
                TreeNode current = queu.poll();
                levelVal.add(current.val);

                if(current.left!=null){
                    queu.add(current.left);
                }
                if(current.right!=null){
                    queu.add(current.right);
                }
            }
            answer.add(levelVal);
        }

        return answer;
    }


    public static void main (String args[]){
        BfsTree bfsTree = new BfsTree();
        bfsTree.root = new TreeNode(3);
        bfsTree.root.left = new TreeNode(9);
        bfsTree.root.right = new TreeNode(9);
        bfsTree.root.right.left = new TreeNode(15);
        bfsTree.root.right.right = new TreeNode(7);

        System.out.println(bfsTree.levelOrder(bfsTree.root));


    }
}
