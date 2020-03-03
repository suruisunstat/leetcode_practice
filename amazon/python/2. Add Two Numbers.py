# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        cur_node = dummy
        
        carry = 0
        
        while l1 or l2: ## ??
            cur_count = 0
            if l1:
                cur_count += l1.val
                l1 = l1.next
            if l2:
                cur_count += l2.val
                l2 = l2.next 
            cur_count += carry
            carry = cur_count / 10
            cur_val = cur_count % 10
            cur_node.next = ListNode(cur_val)
            cur_node = cur_node.next
        
        if carry == 1:
            cur_node.next = ListNode(1)
        
        return dummy.next
    
    ## Time: O(n)
    ## Space: O(n)
    
            
                
                
