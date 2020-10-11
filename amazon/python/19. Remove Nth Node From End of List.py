# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # TWO PASS
        
        dummy = ListNode(0)
        dummy.next = head
        first = head
        length = 0
        while first:
            length = length + 1
            first = first.next
            
        target = length - n # index
        
        
        first = dummy
        while target > 0:
            first = first.next
            target = target - 1
        
        first.next = first.next.next
        
        return dummy.next
        # two pass 
        # Time: O(n)
        # Space: O(1)
        
#         dummy = ListNode(0)
#         dummy.next = head
#         first = dummy
#         second = dummy
        
        
#         while n >= 0: # not necessarliy first.next is not None
#             first = first.next
#             n = n - 1
        
#         # if first.next is None:
#         #     return first.next
        
#         while first:
#             first = first.next
#             second = second.next
        
#         second.next = second.next.next # okay? 
        
#         return dummy.next
    
    # Time: O(L)
    # space: O(1)
    
