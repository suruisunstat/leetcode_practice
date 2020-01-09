"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""
class Solution(object):
#     def postorder(self, root):
#         """
#         :type root: Node
#         :rtype: List[int]
#         """
#         answer = []
#         def dfs(root):
#             if root is None:
#                 return None
#             for child in root.children:
#                 dfs(child)
#             answer.append(root.val)
        
#         dfs(root)
#         return answer 
    
#     # Time: O(n)
#     # Space: O(n)
    
    ## iterative 
    def postorder(self, root):
        res = []
        if root is None:
            return res 
        
        stack = [root]
        while len(stack) != 0:
            cur = stack.pop()
            res.append(cur.val)
            for child in cur.children:
                stack.append(child)
                
        res = res[::-1]
        return res
    
    ## Time: O(n)
    ## Space: O(n)
        
        
        
        
