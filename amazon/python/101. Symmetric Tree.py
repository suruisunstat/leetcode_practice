# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
#     def isSymmetric(self, root):
#         """
#         :type root: TreeNode
#         :rtype: bool
#         """
        
#         def isSym(p, q):
#             """
#             type p: TreeNode
#             type q: TreeNode
#             """
#             if (not p) and (not q):
#                 return True
#             elif ((not p) and q) or ((not q) and p):
#                 return False
#             else:
#                 return p.val == q.val and isSym(p.left,q.right) and isSym(p.right,q.left)
            
#         if not root:
#             return True
#         else:
#             return isSym(root.left, root.right)
        
    # Time: O(n)
    # Space: O(n)
    
    # Iterative:
    def isSymmetric(self, root):
        def isSym(p, q):
            stack = []
            stack.append(p)
            stack.append(q)
            while stack != []: # len(stack) is always divided by 2 
                cur_p = stack.pop(0)
                cur_q = stack.pop(0)
                if (not cur_p) and (not cur_q):
                    continue
                elif (not cur_p) or (not cur_q):
                    return False
                ## below cur_p and cur_q both exists 
                elif cur_p.val != cur_q.val:
                    return False
                else:
                    stack.append(cur_p.left)
                    stack.append(cur_q.right)
                    stack.append(cur_p.right)
                    stack.append(cur_q.left)
            return True
        
        if not root:
            return True
        else:
            return isSym(root.left,root.right)
    # bfs
    # Time: O(n)
    # Space: O(n)
        
        
            
    
    
