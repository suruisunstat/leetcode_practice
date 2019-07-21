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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // find the max index
        return recur(nums, 0 ,nums.length - 1);
    }
    
    public TreeNode recur(int[] nums, int left, int right) {
        // find the maximum index
        if (left > right) return null;
        if (left == right) return new TreeNode(nums[left]); // ?
        int maxIndex = MaxIndex(nums, left, right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = recur(nums, left, maxIndex-1);
        root.right = recur(nums,maxIndex+1, right);
        return root;
    }
    
    public int MaxIndex(int[] nums, int left, int right) {
        int maxIndex = left;
        for(int i = left; i <= right; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

// Time: O(n^2) average case: O(nlogn)
// Space: O(n) average case: O(logn)
