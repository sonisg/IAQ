/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>a = new ArrayList<>();
        if(root==null){
            return 0;
        }
        a.add(root.val);
        adds(root,a);
        Collections.sort(a);
        int n = a.size();
        return a.get(k-1);

        
    }
    public void adds(TreeNode root, List<Integer> a){
        if(root==null){
            return;
        }
        if(root.left!=null){
            a.add(root.left.val);
            adds(root.left, a);
        }
        if(root.right!=null){
            a.add(root.right.val);
            adds(root.right, a);
        }
    }
}
