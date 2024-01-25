
class Solution {
    public boolean isBalanced(TreeNode root) {

        if(root==null){
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.abs(left - right)<=1 && isBalanced(root.left) && isBalanced(root.right);
        
    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l,r)+1;
    }
}


time complexity of this approach is O(N log N), where N is the number of nodes in the tree.
