# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def rob(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
#         def subrob(node):
#             if node is None:
#                 return 0
#             val = 0
#             if node.left is not None:
#                 val += subrob(node.left.left) + subrob(node.left.right)
#             if node.right is not None:
#                 val += subrob(node.right.left) + subrob(node.right.right)
#             return max(val + node.val, subrob(node.right) + subrob(node.left))
        
#         res = subrob(root)
#         return res
        
#         def subrob(node, dic):
#             if node is None:
#                 return 0
#             if node in dic:
#                 return dic[node]
#             val = 0
#             if node.left is not None:
#                 val += subrob(node.left.left, dic) + subrob(node.left.right, dic)
#             if node.right is not None:
#                 val += subrob(node.right.left, dic) + subrob(node.right.right, dic)
                
#             res = max(val + node.val, subrob(node.right, dic) + subrob(node.left, dic))
#             dic[node] = res
#             return res
#         dic = {}
#         return subrob(root, dic)

        def subrob(node):  # [a,b]: a means root is not rob, b means root is robed
            if node is None:
                return [0,0]
            res = [0,0]
            res1 = subrob(node.left)
            res2 = subrob(node.right)
            res[0] = max(res1) + max(res2)
            res[1] = node.val + res1[0] + res2[0]
            return res 
        output = subrob(root)
        return max(output)
    # DP problem
    # TIME: O(N)
    # SPACE: O(N)
         
