class Solution {
    public boolean isValidBST(TreeNode root) {

        return isValid(root, null, null);
        
    }
    public boolean isValid(TreeNode root, Integer minV, Integer maxV){
        
         if(root==null){
            return true;
        }

        if((maxV!=null && root.val>=maxV) || (minV!=null && root.val<=minV )){
            return false;
        }
        return isValid(root.left, minV, root.val) && isValid(root.right, root.val, maxV);

    }

}
