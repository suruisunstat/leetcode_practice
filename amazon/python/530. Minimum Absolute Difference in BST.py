# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.ans = float("Inf")
        self.prev = None
    
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return float("Inf")
        
        self.getMinimumDifference(root.left)
        if self.prev != None:
            self.ans = min(self.ans, root.val - self.prev)
        self.prev = root.val 
        self.getMinimumDifference(root.right)
        return self.ans 
    
    # Space: O(1)
        
#         self.ans = float('Inf')
#         self.node_val_list = []
        
#         if root is None:
#             return None 
#         if root.left is None and root.right is None:
#             return root.val 
        
#         def dfs(node): # in order traversal 
#             if node:
#                 dfs(node.left)
#                 self.node_val_list.append(node.val)
#                 dfs(node.right)
#         dfs(root)
        
#         for i in range(1, len(self.node_val_list)):
#             temp_diff = self.node_val_list[i] - self.node_val_list[i-1]
#             if temp_diff < self.ans:
#                 self.ans = temp_diff
                
#         return self.ans 
    
    # Time: o(N)
    # SpaceL o(N)
        
                
