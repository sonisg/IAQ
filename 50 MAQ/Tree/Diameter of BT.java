class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) {
            return 0;
        }
     int l = height(root.left);
     int r = height(root.right);
     int curd = l+r;

     int ld = diameterOfBinaryTree(root.left);
     int rd = diameterOfBinaryTree(root.right);

     return Math.max(curd, Math.max(ld,rd));
        
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

Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3]

Time complexity: O(n) n=no of nodes
