/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
       if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        return merge(sortList(head),sortList(slow));
        
    }
    
    // iteration
    
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return dummy.next;
    }
    
    
    // recursion 
    
    // public ListNode merge(ListNode l1, ListNode l2) {
    //     if (l1 == null) return l2;
    //     if (l2 == null) return l1;
    //     if (l1.val < l2.val) {
    //         l1.next = merge(l1.next,l2);
    //         return l1;
    //     }
    //     else {
    //         l2.next = merge(l1,l2.next);
    //         return l2;
    //     }
    // }
}


// Time: O(n^2logn)
// Space: O(n) still not O(1)
