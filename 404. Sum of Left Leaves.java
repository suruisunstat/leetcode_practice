/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return sum;
    }
    
    public void dfs(TreeNode root, boolean isLeft) {
        if (root == null) return;
        if (root.left == null && root.right == null && isLeft) {sum += root.val;}
        dfs(root.left, true);
        dfs(root.right, false);
    }
}

// Time: O(V+E)
