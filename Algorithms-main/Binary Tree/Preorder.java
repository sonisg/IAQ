class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>res = new ArrayList();

        if(root==null){
            return res;
        }

        res.add(root.val);

        if(root.left!=null){
             res.addAll(preorderTraversal(root.left));
        }

        if(root.right!=null){
            res.addAll(preorderTraversal(root.right));
        } 

        return res;
    }
}

// root left right
