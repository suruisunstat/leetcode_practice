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
        if (head == null || head.next == null || k == 0) return head;
        ListNode h = head;
        ListNode h1 = head;
        ListNode h2 = head.next;
        
        int l = 0;
        while(h != null) {
            h = h.next;
            l++;
        }
        
        int n = k % l;
        if (n == 0) return head;
        int rem = l - n - 1; // rem is the number of steps that h2 move to the target first Node 
        // 2 + rem = l - n + 1 => rem = l - n - 1
        
        while (rem > 0) {
            h1 = h1.next;
            h2 = h2.next;
            rem--;
        }
        
        ListNode ans = h2;
        while (h2.next != null) {
            h2 = h2.next;
        }
        
        h2.next = head;
        h1.next = null;
        return ans;
//         ArrayList<Integer> items = new ArrayList<>();
//         ListNode first = head;
        
//         if (head == null) return head;
//         if (k == 0) return head;
        
//         while (first != null) {
//             items.add(first.val);
//             first = first.next;
//         }
//         // size of arraylist
//         int size = items.size();
//         int idx = k%size; // idx = 2 
//         idx = size - idx;
        
//         ListNode dummy = new ListNode(0);
//         ListNode l1 = dummy;
        
//         //ArrayList<Integer> ordered = new ArrayList<>();
//         for(int i = idx; i < size; i++) {
//             l1.next = new ListNode(items.get(i));
//             l1 = l1.next;
//         }
//         for(int i = 0; i < idx; i++) {
//             l1.next = new ListNode(items.get(i));
//             l1 = l1.next;
//         }
//         return dummy.next;
        
    }
}

// Time: O(n)
// Space: O(1)
