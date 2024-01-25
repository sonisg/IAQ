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


Algo: 
Initialize an empty list of lists called answer to store the result.
Check if the given root is null. If it is, return the empty answer list.
Create a queue (queu) to perform a level-order traversal.
Enqueue the root node into the queue.
While the queue is not empty, perform the following steps:
a. Get the current size of the queue (representing the number of nodes at the current level).
b. Initialize an empty list called levelVal to store the values at the current level.
c. Iterate through the nodes at the current level:
Dequeue a node from the queue.
Add the value of the dequeued node to the levelVal list.
Enqueue the left and right children of the dequeued node if they exist.
d. Add the levelVal list to the answer list.
Return the final answer list

Time complexity: o(n) n=no of nodes.
