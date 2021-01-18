# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # bubble sort
        if head is None or head.next is None:
            return head
        tempNode = resultNode = head
        while head:
            tempNode = head.next
            while tempNode:
                if tempNode.val < head.val:
                    head.val, tempNode.val = tempNode.val, head.val 
                tempNode = tempNode.next
            head = head.next 
                
                
        
        return resultNode
            
        
#         dummy = ListNode(0)
#         curr = head
#         while curr:
#             prev = dummy
#             next = curr.next
#             while prev.next and prev.next.val < curr.val:
#                 prev = prev.next 
#             curr.next = prev.next 
#             prev.next = curr 
#             curr = next 
            
            
        
#         return dummy.next

    
    
            
     # Time: O(n^2)
     # space: O(1)
        
    # def bubbleSort(arr):
    #     for i in range(1, len(arr)):
    #         for j in range(0, len(arr)-i):
    #             if arr[j] > arr[j+1]:
    #                 arr[j], arr[j + 1] = arr[j + 1], arr[j]
    #     return arr
    
    # private static void sort(int[] arr) {
    #     for (int j = 1; j < arr.length; j++) {
    #         int key = arr[j];
    #         int i = j - 1;
    #         while (i >= 0 && key < arr[i]) {
    #             arr[i + 1] = arr[i];
    #             i--;
    #         }
    #         arr[i + 1] = key;
    #     }
    # }
