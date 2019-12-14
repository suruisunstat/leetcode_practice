# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        head = ListNode(0)
        dummy = head
        
        if (not l1) and (not l2):
            return None
        
        while l1 or l2:
            if l1 and l2:
                val1 = l1.val 
                val2 = l2.val
                if val1 < val2:
                    dummy.next = l1
                    l1 = l1.next
                else:
                    dummy.next = l2
                    l2 = l2.next
            elif l1: # l2 is None
                dummy.next = l1
                break
            elif l2: # l1 is None
                dummy.next = l2
                break
            dummy = dummy.next
        
        return head.next
            
