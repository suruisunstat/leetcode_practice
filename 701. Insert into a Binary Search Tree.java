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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        
        TreeNode node = root;
        TreeNode prev = root;
        boolean left = true;
        while (node != null) {
            prev = node;
            if (node.val < val){
                node = node.right;
                left = false;
            }
            else {
                node = node.left;
                left = true;
            }   
        }
        if (left) 
            prev.left = new TreeNode(val);
        else
            prev.right = new TreeNode(val);
        return root;
    }
}
