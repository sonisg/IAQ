class Solution {
    int maxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calculateMaxPathSum(root);
        return maxPathSum;
    }

    private int calculateMaxPathSum(TreeNode node) {
        if (node == null) return 0;

        // Calculate the maximum sum of left and right subtrees
        int leftSum = calculateMaxPathSum(node.left);
        int rightSum = calculateMaxPathSum(node.right);

        // Calculate the maximum path sum through the current node
        int currentSum = Math.max(node.val, Math.max(node.val + leftSum, node.val + rightSum));

        // Update the global maximum path sum
        maxPathSum = Math.max(maxPathSum, Math.max(currentSum, node.val + leftSum + rightSum));

        // Return the maximum path sum achievable from the current node
        return currentSum;
    }
}
