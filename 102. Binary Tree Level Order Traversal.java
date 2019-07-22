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
    private List<List<Integer>> res;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int ht = height(root);
        for (int i = 0; i < ht; i++) {
            List<Integer> temp = rec(root,i, new ArrayList<Integer>());
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
    
    public List<Integer> rec(TreeNode root, int level, List<Integer> temp) {
        //List<Integer> temp = new ArrayList<>();
        if (root == null) return temp;
        if (level == 0) {
            temp.add(root.val);
            return temp;
        };
        rec(root.left, level - 1, temp);
        rec(root.right, level - 1, temp);
        return temp;
    }
    
    public int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}

// Just use the idea of BFS
