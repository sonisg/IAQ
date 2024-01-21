class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
       else{
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return Math.max(l,r)+1;
        }  
    }
}

Algo:
1. If the root is None, return 0.
2. Otherwise:
   a. Recursively calculate the maximum depth of the left subtree by calling maxDepth with the left child of the root.
   b. Recursively calculate the maximum depth of the right subtree by calling maxDepth with the right child of the root.
   c. Return the maximum depth of the left and right subtrees, plus 1 (to account for the current level).
