# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # def levelOrderBottom(self, root):
    #     """
    #     :type root: TreeNode
    #     :rtype: List[List[int]]
    #     """
    #     levels = []
    #     temp_level = []
    #     stack = []
    #     if not root:
    #         return levels
    #     stack.append(root)
    #     while stack != []:
    #         size = len(stack)
    #         for i in range(size):
    #             cur = stack.pop(0)
    #             temp_level.append(cur.val)
    #             if cur.left:
    #                 stack.append(cur.left)
    #             if cur.right:
    #                 stack.append(cur.right)
    #         levels.insert(0,temp_level)
    #         temp_level = []
    #     return levels 
        
    # time: O(n)
    # space: O(n)
    
    ## recursion
    
    def levelOrderBottom(self, root):
        levels = []
        if not root:
            return levels 
        def helper(node, level):
            if len(levels) == level:
                levels.append([])
            if node:
                levels[level].append(node.val)
            if node.left:
                helper(node.left, level + 1)
            if node.right:
                helper(node.right, level + 1)
            
        helper(root,0)
        return levels[::-1]
    
    ## Time: O(n)
    ## Space: O(n)
    
    
    
        
        
        
