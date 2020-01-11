# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # def maxDepth(self, root):
    #     """
    #     :type root: TreeNode
    #     :rtype: int
    #     """
    #     if root is None:
    #         return 0
    #     # if root.left is None and root.right is None:
    #     #     return 1
    #     return max(self.maxDepth(root.right),self.maxDepth(root.left)) + 1
    
    ## Time: O(n)
    ## Space: O(n) average O(logn)
    
    ## iteration
    def maxDepth(self, root):
        if not root:
            return 0
        stack = []
        depth = 0
        next_num = 0
        stack.append(root)
        
        while stack != []:
            depth = depth + 1
            next_num = len(stack)
            for i in range(next_num):
                cur = stack.pop(0) # poll the first element from a queue  
                if cur.left: 
                    stack.append(cur.left)
                if cur.right:
                    stack.append(cur.right)
                    
        return depth 
     ## use queue for BFS, POP(0) the first element   
     # Time: O(n)
     # Space: O(n) n/2 
            
        
        
