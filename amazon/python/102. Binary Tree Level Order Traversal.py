# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        levels = []
        if not root:
            return levels
        
        def helper(node, level):
            if len(levels) == level:
                levels.append([])
            
            levels[level].append(node.val)
            
            if node.left:
                helper(node.left, level + 1)
            if node.right:
                helper(node.right, level + 1)
        
        helper(root,0)
        return levels 
    
    ## Time:
    ## Space: 
    
    
#     def levelOrder(self, root):
#         """
#         :type root: TreeNode
#         :rtype: List[List[int]]
#         """
#         res = []
#         queue = []
#         temp_queue = []
        
#         if not root:
#             return res 
#         queue.append(root)
        
#         while queue != []:
#             size = len(queue)
#             for i in range(size):
#                 cur = queue.pop(0)
#                 temp_queue.append(cur.val)
#                 if cur.left:
#                     queue.append(cur.left)
#                 if cur.right:
#                     queue.append(cur.right)
#             res.append(temp_queue)
#             temp_queue = []
        
#         return res 
    # Time: O(n)
    # Space: O(n)
                
            
