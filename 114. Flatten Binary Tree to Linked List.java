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
    
    private List<TreeNode> res = new ArrayList<>();
    
    
    public void flatten(TreeNode root) {
        dfs(root);
        if (root == null) return;
        root.left = null;
        for (int i = 1; i < res.size(); i++) {
            root.right = res.get(i);
            root = root.right;
            root.left = null;
        }
    }
    
    public void dfs(TreeNode root) {
        if (root == null) return;
        res.add(root);
        dfs(root.left);
        dfs(root.right);
    }
}
