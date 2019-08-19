/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// not necessarily non negative numbers, to the leaf 
class Solution {
    //private boolean res = false;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        //if (sum == 0) return false;
        return dfs(root,0,sum,root);
    }
    
    public boolean dfs(TreeNode root, int temp, int sum, TreeNode parent) {
        if (temp == sum && root == null && parent.left == null && parent.right == null) {
            return true;
        }
        if (root == null) return false; 
        //boolean isLeaf = root.left == null && root.right == null;
        
        boolean hasLeft = dfs(root.left, temp + root.val,sum, root);
        boolean hasRight = dfs(root.right,temp + root.val, sum, root);
        return hasLeft || hasRight;
    }
}
