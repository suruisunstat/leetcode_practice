/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l1 = l1.next;
            }
            else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        
        if (l1 == null && l2 != null) l3.next = l2;
        if (l1 != null && l2 == null) l3.next = l1;
        
        return dummy.next;
        
//         ArrayList<Integer> items = new ArrayList<>();
        
//         while(l1 != null) {
//             items.add(l1.val);
//             l1 = l1.next;
//         }
        
//         while(l2 != null) {
//             items.add(l2.val);
//             l2 = l2.next;
//         }
        
//         Collections.sort(items);
        
        
//         ListNode first = new ListNode(0);
//         ListNode head = first;
        
//         for(int value : items) {
//             head.next = new ListNode(value);
//             head = head.next;
//         }
//         return first.next;
    }
}
