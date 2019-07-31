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
    private List<Integer> nums = new ArrayList<>();
    
    public boolean isValidBST(TreeNode root) {
       // dfs
        dfs(root);
        for(int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) >= nums.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    
    public void dfs(TreeNode root){
        if (root == null)
            return;
        dfs(root.left);
        nums.add(root.val);
        dfs(root.right);
    }
}

// O(V+E) O(n)
