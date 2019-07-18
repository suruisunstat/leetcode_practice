/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> items = new ArrayList<>();
        ListNode first = head;
        
        if (head == null) return head;
        if (k == 0) return head;
        
        while (first != null) {
            items.add(first.val);
            first = first.next;
        }
        // size of arraylist
        int size = items.size();
        int idx = k%size; // idx = 2 
        idx = size - idx;
        
        ListNode dummy = new ListNode(0);
        ListNode l1 = dummy;
        
        //ArrayList<Integer> ordered = new ArrayList<>();
        for(int i = idx; i < size; i++) {
            l1.next = new ListNode(items.get(i));
            l1 = l1.next;
        }
        for(int i = 0; i < idx; i++) {
            l1.next = new ListNode(items.get(i));
            l1 = l1.next;
        }
        return dummy.next;
        
    }
}
