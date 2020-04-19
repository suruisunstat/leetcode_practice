# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.ans = None
        self.idx = 0
        
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        # iteration
        stack = []
        while True:
            while root:
                stack.append(root)
                root = root.left
            root = stack.pop()
            k -= 1
            if k == 0:
                return root.val
            root = root.right
            
        
        
#         def dfs(node):
#             if node:
#                 dfs(node.left)
#                 self.idx += 1
#                 if self.idx == k:
#                     self.ans = node.val
#                     return
#                     #sys.exit(0)
#                 dfs(node.right)
                
#         dfs(root)
#         return self.ans 
    
    ## Time: O(n)
    ## Space: O(n)
