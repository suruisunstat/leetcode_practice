# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sumNumbers(self, root: TreeNode) -> int:
        self.res = 0
        self.dfs(root,0)
        return self.res
    
    def dfs(self, root, value):
        if root:
            if not root.left and not root.right:
                self.res += value * 10 + root.val 
            self.dfs(root.left, value * 10 + root.val)
            self.dfs(root.right, value * 10 + root.val)
            
    # Time: O(n)
    # Space:O(n)
            
        
#         root_to_leaf = 0
#         if root is None:
#             return 0
        
#         stack = [(root,0)]
#         while stack:
#             root, curr = stack.pop()
#             curr = curr * 10 + root.val
#             if not root.left and not root.right:
#                 root_to_leaf += curr
#             if root.left:
#                 stack.append((root.left, curr))
#             if root.right:
#                 stack.append((root.right, curr))
                
#         return root_to_leaf
    
    # Time: O(n)
    # Space: O(n)
    
    
    
    
    
