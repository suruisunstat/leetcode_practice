# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        ptr1 = head
        ptr2 = head
        while ptr2 and ptr2.next:
            ptr1 = ptr1.next
            ptr2 = ptr2.next.next
            if ptr1 == ptr2:
                ptr3 = head
                ptr4 = ptr1
                while ptr3 != ptr4:
                    ptr3 = ptr3.next
                    ptr4 = ptr4.next
                return ptr3
                
        return None
        
# java
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2) {
                ListNode ptr3 = head;
                while (ptr3 != ptr1) {
                    ptr1 = ptr1.next;
                    ptr3 = ptr3.next;
                }
                return ptr1;
            }
        }
        return null;
    }
}
