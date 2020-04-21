# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        
        if len(nums) == 0:
            return None
        if len(nums) == 1:
            return TreeNode(nums[0])
        #print(3/2)
        
        l = 0
        r = len(nums) - 1
        mid = l + (r-l)/2 # this is python 2 right 
        root = TreeNode(nums[mid])
        root.left = self.sortedArrayToBST(nums[l:mid])
        root.right = self.sortedArrayToBST(nums[(mid+1):(r+1)])
            
        return root 
    
    ## Time: O(N)
    ## Space: O(N)
        
        
