# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isValidBST(self, root):
        if not root:
            return True
        stack = [(root,float('-inf'),float('inf')),]
        
        while stack != []:
            root, lower, upper = stack.pop()
            if not root:
                continue
            val = root.val
            if val <= lower or val >= upper:
                return False
            stack.append((root.right,val,upper))
            stack.append((root.left,lower,val))
        return True
    
    # Time: O(n)
    # Space: O(n)
        
        
    # def isValidBST(self, root):
    #     stack, inorder = [], float('-inf')
    #     if not root:
    #         return True
    #     while stack or root:
    #         while root:
    #             stack.append(root)
    #             root = root.left 
    #         root = stack.pop()
    #         if root.val > inorder:
    #             inorder = root.val
    #         else:
    #             return False
    #         root = root.right
    #     return True
    
    # Time: O(n)
    # Space: O(n)
    
    
#     def isValidBST(self, root):
#         """
#         :type root: TreeNode
#         :rtype: bool
#         """
#         def helper(node, lower = float('-inf'), upper = float('inf')):
#             if not node:
#                 return True
            
#             val = node.val
#             if val <= lower or val >= upper:
#                 print(val, lower, upper)
#                 return False 
#             if not helper(node.right,val,upper):
#                 return False
#             if not helper(node.left, lower, val):
#                 return False
#             return True
#         return helper(root)
    # Time: O(n)
    # Space: O(n)
#     # understand now 
    
    
