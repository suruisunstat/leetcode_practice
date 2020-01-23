# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def hasPathSum(self, root, sum):
        if not root:
            return False
        sum -= root.val # important to remember 
        if (not root.left) and (not root.right):
            return sum == 0
        return self.hasPathSum(root.left, sum) or self.hasPathSum(root.right, sum)
        
    # Time: O(n)
    # Space: O(n)
    
#     def hasPathSum(self, root, sum):
#         """
#         :type root: TreeNode
#         :type sum: int
#         :rtype: bool
#         """
#         # return all root to leaf combinations 
#         # store all node and parent information 
#         if not root:
#             return False
#         stack = [(root,sum-root.val)]
        
#         while stack:
#             cur, remain = stack.pop()
#             if remain == 0 and (not cur.left) and (not cur.right):
#                 return True
#             else:
#                 if cur.left:
#                     stack.append((cur.left, remain - cur.left.val))
#                 if cur.right:
#                     stack.append((cur.right,remain - cur.right.val))
#         return False 
#     # Time: O(n)
#     # Space: O(n)
    
            
