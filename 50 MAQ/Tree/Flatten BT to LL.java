class Solution {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left=null;
        while(root.right!=null){
            root = root.right;
        } 
        root.right = tmp;
    }
}
