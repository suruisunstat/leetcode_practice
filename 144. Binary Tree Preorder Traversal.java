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
    private List<Integer> res = new ArrayList<>();
    
    // recursive
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     if (root == null) return res;
    //     res.add(root.val);
    //     preorderTraversal(root.left);
    //     preorderTraversal(root.right);
    //     return res;
    // }
    
    
    //iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return res;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}
