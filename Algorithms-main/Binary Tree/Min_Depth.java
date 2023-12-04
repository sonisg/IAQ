class Solution {
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int minLeft = minDepth(root.left) + 1;
        int minRight = minDepth(root.right) + 1;

        if(root.left == null){
            return minRight;
        }
        if(root.right == null){
            return minLeft;
        }

        return Math.min(minLeft, minRight);
        
    }
}
