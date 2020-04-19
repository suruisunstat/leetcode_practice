# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def distributeCoins(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.ans = 0
        
        def dfs(node): # number of excess coins in the subtree at or below node
            if not node:
                return 0
            L = dfs(node.left)
            R = dfs(node.right)
            self.ans += abs(L) + abs(R)
            return node.val + L + R - 1 
        
        dfs(root)
        return self.ans
    
    # Time: O(n)
    # Space: O(n)
