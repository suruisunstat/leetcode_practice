"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""
class Solution(object):
#     def preorder(self, root):
#         """
#         :type root: Node
#         :rtype: List[int]
#         """
#         answer = []
#         def dfs(root):
#             if root is None:
#                 return None
#             answer.append(root.val)
#             for child in root.children:
#                 dfs(child)
            
        
#         dfs(root)
#         return answer
    ## Time: o(n)
    ## Space: O(n)
    
    
    ## iterative
    def preorder(self, root):
        res = []
        if root is None:
            return res
        
        stack = [root]
        
        while len(stack) != 0:
            elem = stack.pop()
            res.append(elem.val)
            stack.extend(elem.children[::-1])   
        return res
    
    ## Time: O(n)
    ## Space: O(n)
    
    
