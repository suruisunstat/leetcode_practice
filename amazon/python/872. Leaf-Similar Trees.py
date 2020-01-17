# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def leafSimilar(self, root1, root2):
        leaf1 = []
        leaf2 = []
        def dfs(node, leaf):
            if node:
                if (not node.left) and (not node.right):
                    leaf.append(node.val)
                dfs(node.left, leaf)
                dfs(node.right, leaf)
        
        dfs(root1, leaf1)
        dfs(root2, leaf2)
        return leaf1 == leaf2 
    # Time: O(t1 + t2)
    # Space: O(t1 + t2)
                
#     def leafSimilar(self, root1, root2):
#         """
#         :type root1: TreeNode
#         :type root2: TreeNode
#         :rtype: bool
#         """
#         stack1 = []
#         stack2 = []
#         leaf1 = []
#         leaf2 = []
#         # any dfs order is fine 
        
#         if (not root1) and (not root2):
#             return True
#         elif (not root1) or (not root2):
#             return False
        
#         stack1.append(root1)
#         stack2.append(root2)
        
#         while stack1 != []:
#             cur1 = stack1.pop()
#             if cur1.right:
#                 stack1.append(cur1.right)
#             if cur1.left:
#                 stack1.append(cur1.left)
#             if (not cur1.left) and (not cur1.right):
#                 leaf1.append(cur1.val)
                
#         while stack2 != []:
#             cur2 = stack2.pop()
#             if cur2.right:
#                 stack2.append(cur2.right)
#             if cur2.left:
#                 stack2.append(cur2.left)
#             if (not cur2.left) and (not cur2.right):
#                 leaf2.append(cur2.val)
#         return leaf1 == leaf2 
    
#     # Time: O(n+m)
#     # Space: O(n+m)
    
        
        
            
        
