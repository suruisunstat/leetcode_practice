# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def constructMaximumBinaryTree(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        max_val = max(nums)
        split_index = nums.index(max_val)
        root = TreeNode(max_val)
        if len(nums[:split_index]):
            root.left = self.constructMaximumBinaryTree(nums[:split_index])
        if len(nums[split_index+1:]):
            root.right = self.constructMaximumBinaryTree(nums[split_index+1:])
        return root
