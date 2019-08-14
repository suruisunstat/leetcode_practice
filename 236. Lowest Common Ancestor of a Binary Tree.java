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
    private TreeNode ans = null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        rec(root,p,q);
        return ans;
    }
    
    public boolean rec(TreeNode currentNode, TreeNode p, TreeNode q) {
        if (currentNode != null) System.out.println(currentNode.val);
        if (currentNode == null) return false;
        int leftRes = rec(currentNode.left,p,q) ? 1 : 0;
        int rightRes = rec(currentNode.right,p,q) ? 1: 0;
        int mid = (currentNode == p || currentNode == q) ? 1: 0;
        if (leftRes + rightRes + mid >= 2) {
            ans = currentNode;
        }
        return (mid + rightRes + leftRes > 0);
    }
    
}
