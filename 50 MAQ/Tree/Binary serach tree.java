class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBst(root, null,null); 
    }

    public boolean isBst(TreeNode root, Integer min, Integer max){
    if(root==null){     
        return true;
        }
    if(max!=null && root.val >=max || min!=null && root.val<=min){
        return false;
    }
    return isBst(root.left, min, root.val) && isBst(root.right,root.val,max) ;
    }
}
