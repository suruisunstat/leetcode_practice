# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
#     def minDepth(self, root):
#         """
#         :type root: TreeNode
#         :rtype: int
#         """
#         if not root:
#             return 0
#         stack = []
#         stack.append(root)
#         min_depth = 1
        
#         while len(stack) != 0:
#             size = len(stack)
#             for i in range(size):
#                 cur = stack.pop(0)
#                 if not cur:
#                     continue
#                 if (not cur.left) and (not cur.right):
#                     return min_depth
#                 else:
#                     stack.append(cur.left)
#                     stack.append(cur.right)
#             min_depth = min_depth + 1
#         return min_depth 
    
#     # Time: O(n) # DFS
#     # Space:  O(n)
    
    # def minDepth(self,root):
    #    # DFS 
    #     if not root:
    #         return 0
    #     stack = []
    #     stack.append((1,root))
    #     min_depth = float('inf')
    #     while len(stack) != 0:
    #         depth, cur = stack.pop()
    #         if (not cur.left) and (not cur.right):
    #             if depth < min_depth:
    #                 min_depth = depth
    #             #return depth
    #         if cur.left:
    #             stack.append((depth+1, cur.left))
    #         if cur.right:
    #             stack.append((depth+1, cur.right))
    #     return min_depth
    #DFS 
    # Time: O(n)
    # Space: O(n)
            
            
    
        
    def minDepth(self,root):
        # recur 
        if not root:
            return 0
        elif (not root.left) and (not root.right):
            return 1
        elif not root.left:
            return 1 + self.minDepth(root.right)
        elif not root.right:
            return 1 + self.minDepth(root.left)
        else:
            return 1 + min(self.minDepth(root.left), self.minDepth(root.right))
        
        # Time: O(n)
        # Space: O(n)
        
        
        
        
            
