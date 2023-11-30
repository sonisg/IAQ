class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null){
            return answer;
        }
        Queue<TreeNode> queu = new LinkedList<>();
        queu.add(root);

        while(!queu.isEmpty()){
            int lev = queu.size();
             List<Integer> levelVal = new ArrayList<>();
            for(int i =0;i<lev;i++){
                TreeNode current = queu.poll();
                levelVal.add(current.val);

                if(current.left!=null){
                    queu.add(current.left);
                }
                if(current.right!=null){
                    queu.add(current.right);
                }
            }
            answer.add(levelVal);
        }
        return answer;     
    }
}
