/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return head;
        
        if (m == n) {
            return head;
        }
        ListNode first = null;
        ListNode after = null;
        ListNode p1 = head;
        ListNode before = null;
        int count = 0;
        while (p1 != null) {
            count++;
            if (count == m - 1) {
                before  = p1; // 1
            }
            if (count == n) {
                //ListNode end = p1; // 4 reverse from 2 to 4
                after = p1.next;
                p1.next = null;
                break;
            }
            p1 = p1.next;
        }
        
        if (before == null) {
            ListNode revstart = reverse(head);
            ListNode newHead = revstart;
            while (newHead.next != null) {
                newHead = newHead.next;
            }
            newHead.next = after;
            return revstart;
        }
        else { // before != null
            ListNode revstart = reverse(before.next);
            before.next = revstart;
            ListNode newHead = revstart;
            while (newHead.next != null) {
                newHead = newHead.next;
            }
            newHead.next = after;
            return head;
        }
        
    }
    
    public ListNode reverse(ListNode root) {
        ListNode prev = null;
        ListNode cur = root;
        while (cur != null) {
            ListNode nextPt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextPt;
        }
        return prev;
    }
}

// Time: O(n) though the code is ugly...
