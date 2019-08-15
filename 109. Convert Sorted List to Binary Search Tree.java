/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    // convert linkedlist to an array
    // create the balanced binary search tree
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        int[] nums = ConvertToArr(head);
        TreeNode res = Rec(nums,0,nums.length-1);
        return res;
    }
    
    public int[] ConvertToArr(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            arr.add(node.val);
            node = node.next;
        }
        
        int[] arrInt = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arrInt[i] = arr.get(i);
        }
        //Object[] arrInt = arr.toArray();
        return arrInt;
    }
    
    public TreeNode Rec(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = Rec(nums,left,mid-1);
            root.right = Rec(nums,mid+1,right);
            return root;
        }
        return null;
    }
}
