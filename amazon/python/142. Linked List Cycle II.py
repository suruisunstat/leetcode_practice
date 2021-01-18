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
        fast = head
        slow = head
        hasCycle = False
        while fast is not None and fast.next is not None:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                hasCycle = True
                break
        
        if not hasCycle:
            return None
        
        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
        return fast 
    
    # O(n)
    # O(1)
        
#         seen_nodes = set()
#         if head is None:
#             return None
        
#         # prev = ListNode(0)
#         # prev.next = head
        
#         while head is not None:
#             if head in seen_nodes:
#                 return head
#             else:
#                 seen_nodes.add(head)
#                 #prev = head
#                 head = head.next
#         return None 
    
    # Time: O(n)
    # Space: O(1)
                
