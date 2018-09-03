/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
        ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, cur = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int val1 = (p != null) ? p.val : 0;
			int val2 = (q != null) ? q.val : 0;
			int sum = val1 + val2 + carry;
			// carry = sum/10;
			carry = (sum >= 10) ? 1 : 0;
			cur.next = new ListNode(sum % 10);
			// cur.val = sum % 10;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
			cur = cur.next;
		}
		if (carry == 1) {
			cur.next = new ListNode(1);
		}
		return dummyHead.next;
    }
}
