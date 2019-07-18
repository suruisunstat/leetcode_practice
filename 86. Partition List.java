/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return head;
        
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        ListNode dummy2 = new ListNode(0);
        ListNode l4 = dummy2;
        ListNode first = head;
        while(first != null) {
            if (first.val < x) {
                l3.next = first;
                l3 = l3.next;
            }
            else {
                l4.next = first;
                l4 = l4.next;
            }
            first = first.next;
        }
        l4.next = null; // this need to be added to avoid memory exception
        l3.next = dummy2.next;
        return dummy.next;
    }
}

// Time complexity: O(n)
// Space complexity: O(1) I should not use first as a representative for head... waste of space
