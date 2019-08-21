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
    private int count = 0;
    
//     public int countNodes(TreeNode root) {
//         if (root == null) return count;
//         // find the last level number
//         count++;
//         countNodes(root.left);
//         countNodes(root.right);
//         return count;
//     }
    
    public int countNodes(TreeNode root) {
        if (root == null) return count;
        int lh = height(root.left);
        int rh = height(root.right);
        if (lh == rh) {
            return (int)Math.pow(2,lh) + countNodes(root.right);
        } else {
            return (int)Math.pow(2,rh) + countNodes(root.left);
        }
    }
    
    public int height(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }
}
