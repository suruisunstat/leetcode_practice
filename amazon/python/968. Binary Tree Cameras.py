# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minCameraCover(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # If a node has children that are not covered by a camera, then we must place a camera here. Additionally, if a node has no parent and it is not covered, we must place a camera here.
        # dp is difficult to think of, let's do greedy
        
        self.ans = 0
        covered = {None}
        def dfs(node, par= None):
            if node:
                dfs(node.left, node)
                dfs(node.right, node)
                
                if par is None and node not in covered or node.left not in covered or node.right not in covered:
                    self.ans += 1
                    covered.update({node,node.left,node.right,par})
        dfs(root)
        return self.ans
        
        ## Time: O(n)
        ## Space: O(n)
        ## dfs always goes to the leaf node first, and None is covered, 
        
        

            
            
            
