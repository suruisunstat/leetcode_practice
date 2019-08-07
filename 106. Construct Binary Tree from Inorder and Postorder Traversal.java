/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// similar to question 105 
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i],i);
        }
        return build(postorder,0,postorder.length-1,inorder,0,inorder.length-1, inMap);
    }
    
    public TreeNode build(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = build(postorder,postStart,postStart + numsLeft - 1,inorder, inStart, inRoot-1, inMap);
        root.right = build(postorder,postStart+numsLeft,postEnd-1, inorder, inRoot + 1, inEnd, inMap);
        return root;
    }
}
