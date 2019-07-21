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
    
    // Recur: Time: O(n) Space: O(logn) average O(n) worst case
    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if ( p == null && q == null) return true;
    //     if (p == null || q == null) return false;
    //     return (p.val == q.val) && (isSameTree(p.left,q.left)) && (isSameTree(p.right,q.right));
    // }
    
    // Iteration: Time: O(n) Space: O(logn) average O(n) worst case
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            queue.add(t1.left);
            queue.add(t2.left);
            queue.add(t1.right);
            queue.add(t2.right);
        }
        return true;
    }
}
