# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def searchBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        # if not root:
        #     return None
        # if val == root.val:
        #     return root
        # if val < root.val:
        #     return self.searchBST(root.left, val)
        # else:
        #     return self.searchBST(root.right, val)
        
        # Time: O(logn) O(H)
        # Space: O(logn)
        
        while root is not None and root.val != val:
            root = root.left if val < root.val else root.right 
        return root 
    
        # O(1) space 
        
        
