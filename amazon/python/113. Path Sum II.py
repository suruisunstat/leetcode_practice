# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution(object):
    def pathSum(self, root, sum):
        if not root:
            return []
        if (not root.left) and (not root.right) and root.val == sum:
            return [[root.val]]
        tmp = self.pathSum(root.left, sum - root.val) + self.pathSum(root.right, sum - root.val)
        return [[root.val] + i for i in tmp]
        # Time: O(N) Space: O(n)
        
#     def pathSum(self, root, sum):
#         if not root:
#             return []
        
#         stack = [(root, sum - root.val, [root.val])]
#         res = []
        
#         while stack:
#             curr, val, ls = stack.pop()
#             if (not curr.left) and (not curr.right) and val == 0:
#                 res.append(ls)
#             if curr.right:
#                 stack.append((curr.right, val - curr.right.val, ls + [curr.right.val]))
#             if curr.left:
#                 stack.append((curr.left, val - curr.left.val, ls + [curr.left.val]))
        
#         return res
#     # DFS: time O(N) space: O(n)
        
    # def pathSum(self, root, sum):
    #     if not root:
    #         return []
    #     res = []
    #     queue = [(root, root.val, [root.val])]
    #     while queue:
    #         curr, val, ls = queue.pop(0)
    #         if (not curr.left) and (not curr.right) and val == sum:
    #             res.append(ls)
    #         if curr.left:
    #             queue.append((curr.left, val + curr.left.val, ls + [curr.left.val]))
    #         if curr.right:
    #             queue.append((curr.right, val + curr.right.val, ls + [curr.right.val]))
    #     return res
        
    # DFS: time: O(n) space O(n)
    
        
        
        
#     def pathSum(self, root, sum):
#         """
#         :type root: TreeNode
#         :type sum: int
#         :rtype: List[List[int]]
#         """
#         if not root:
#             return []
        
#         def dfs(root, sum, temp, res):
#             if (not root.left) and (not root.right) and root.val == sum:
#                 temp.append(root.val)
#                 res.append(temp)
#             if root.left:
#                 dfs(root.left, sum - root.val, temp + [root.val], res)
#             if root.right:
#                 dfs(root.right, sum - root.val, temp + [root.val], res)
#         res = []
#         dfs(root, sum, [], res)
#         return res
    # Time: O(n)
    # Space: O(n)
        
                
