# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        dummy.next = head
        
        prev_node = dummy
        
        while head and head.next:
            first_node = head
            second_node = head.next
            
            # swap
            prev_node.next = second_node
            first_node.next = second_node.next 
            second_node.next = first_node
            
            # update for next swap
            prev_node = first_node
            head = first_node.next
        
        return dummy.next 
    
    # The challenging part is the rule to swap 
