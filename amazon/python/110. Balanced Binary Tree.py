# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
#     def getHeight(self, root):
#             if not root:
#                 return -1
#             return 1 + max(self.getHeight(root.left), self.getHeight(root.right))
    
#     def isBalanced(self, root):
#         """
#         :type root: TreeNode
#         :rtype: bool
#         """
        
        
#         if not root:
#             return True
#         return abs(self.getHeight(root.left) - self.getHeight(root.right)) < 2 and self.isBalanced(root.left) and self.isBalanced(root.right) 
    # Time: O(nlogn)
    # Space: O(n)
    
#     def isBalancedHelper(self,root):
#         if not root:
#             return True, -1
#         LeftBalanced, LeftHeight = self.isBalancedHelper(root.left)
#         if not LeftBalanced:
#             return False, 0 # 0 can be replaced by any number 
#         RightBalanced, RightHeight = self.isBalancedHelper(root.right)
#         if not RightBalanced:
#             return False, 0
#         return abs(LeftHeight - RightHeight) < 2, 1 + max(LeftHeight, RightHeight)
        
    
#     def isBalanced(self,root):
#         return self.isBalancedHelper(root)[0]
    
#     # Time: O(n)
#     # Space: O(n)
#     # Why it is faster? Because first method every recur step calculate the height, but the second method every recu deeper into the tree and calculate if a node is balanced from bottom to up. 

    def getHeight(self,root):
        if not root:
            return 0
        left = self.getHeight(root.left)
        right = self.getHeight(root.right)
        if left == -1 or right == -1 or abs(left - right) > 1:
            return -1
        return 1 + max(left,right)
        
    
    def isBalanced(self,root):
        return self.getHeight(root) != -1
    
    # Same as method 2 above 
        
        
