package pc;

import java.util.HashSet;
import java.util.Set;

// Definition for a binary tree node.

public class DistinctIslandsTree {

    // Function to perform DFS traversal
    private static void dfs(TreeNode node, StringBuilder path) {
        if (node == null)
            return;

        // Append the current node's value to the path
        path.append(node.val);

        // Traverse left and right subtrees
        dfs(node.left, path);
        dfs(node.right, path);
    }

    // Function to count distinct islands of different sizes in the tree
    public static int countDistinctIslands(TreeNode root) {
        if (root == null)
            return 0;

        Set<String> islands = new HashSet<>();
        StringBuilder path = new StringBuilder();

        // Perform DFS traversal starting from the root
        dfs(root, path);

        // Add the generated path to the set
        islands.add(path.toString());

        // Return the number of distinct islands
        return islands.size();
    }

    public static void main(String[] args) {
        // Constructing the tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.right.right = new TreeNode(1);

        // Counting distinct islands
        System.out.println("Number of distinct islands of different sizes: " + countDistinctIslands(root));
    }
}
