# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

from collections import Counter

class Solution(object):
#     def isUnivalTree(self, root):
#         """
#         :type root: TreeNode
#         :rtype: bool
#         """
        
#         if not root:
#             return True 
#         stack = [root]
#         val_list = []
#         while len(stack) != 0:
#             cur = stack.pop()
#             val_list.append(cur.val)
#             if cur.left:
#                 stack.append(cur.left)
#             if cur.right:
#                 stack.append(cur.right)
#         # O(n) for traversal
#         # O(n) for finding unique elements
#         return len(set(val_list)) == 1 
    
    # Space: O(n)
    
    ## recursion:
        def isUnivalTree(self, root):
            left = (not root.left or root.val == root.left.val and self.isUnivalTree(root.left))
            if not left:
                return False
            right = (not root.right or root.val == root.right.val and  self.isUnivalTree(root.right))
            if not right:
                return False
            return left and right
        
    # Time: O(n)
    # Space: O(n)
        
    
    
