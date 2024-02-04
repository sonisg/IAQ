class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val ==p.val || root.val==q.val){
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left,p,q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p,q);

        if(leftLCA!=null && rightLCA!=null){
            return root;
        }

        return (leftLCA != null)? leftLCA : rightLCA;
        
    }
}

Algorithm for finding LCA in a binary tree:

Start from the root of the tree.
If the current node is null or matches either of the given nodes (p or q), return the current node.
Recursively search for the LCA in the left and right subtrees.
If both left and right subtrees have a non-null result, it means the current node is the LCA.
If only one subtree has a non-null result, return that result as the LCA.
If both subtrees have null results, return null (indicating that LCA is not found in this subtree).

TC: O(n), where "n" is the number of nodes in the binary tree.
