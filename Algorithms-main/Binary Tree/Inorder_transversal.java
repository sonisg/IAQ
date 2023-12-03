class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer>res = new ArrayList();

        if(root==null){
            return res;
        }

        if(root.left!=null){
             res.addAll(inorderTraversal(root.left));
        }

        res.add(root.val);

        if(root.right!=null){
            res.addAll(inorderTraversal(root.right));
        } 

        return res;
        
    }
}

// left root right

// Input: root = [1,null,2,3]
// Output: [1,3,2]
