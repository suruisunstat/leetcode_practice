# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        self.numOfPaths = 0
        self.dfs(root,sum)
        return self.numOfPaths
    
    def dfs(self, node, sum):
        if node:
            self.test(node, sum)
            self.dfs(node.left, sum)
            self.dfs(node.right, sum)
            
    def test(self, node, sum):
        if not node:
            return
        if node.val == sum:
            self.numOfPaths += 1
        
        self.test(node.left, sum - node.val)
        self.test(node.right, sum - node.val)
    
    ## Time: O(n^2)
    ## Space:O(n)
#     def pathSum(self, root, sum):
#         """
#         :type root: TreeNode
#         :type sum: int
#         :rtype: int
#         """
#         self.result = 0
#         cache = {0:1}
#         self.dfs(root, sum, 0, cache)
#         return self.result
        
    
#     def dfs(self, root, sum, currSum, cache):
#         if (not root):
#             return 
#         currSum += root.val
#         oldSum = currSum - sum
#         self.result += cache.get(oldSum,0)
#         cache[currSum] = cache.get(currSum,0) + 1
#         self.dfs(root.left, sum, currSum, cache)
#         self.dfs(root.right, sum, currSum, cache)
#         cache[currSum] -= 1
        
    # Time: O(n)
    # Space: O(n)
        
