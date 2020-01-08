# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    
    # def inorderTraversal(self, root):
    #     """
    #     :type root: TreeNode
    #     :rtype: List[int]
    #     """
    #     res = []
    #     def dfs(root):
    #         if root is None:
    #             return
    #         #if root.left is not None:
    #         dfs(root.left)
    #         res.append(root.val)
    #         #if root.right is not None:
    #         dfs(root.right)
    #     dfs(root)
    #     return res
    
#     def inorderTraversal(self, root):
#         stack = []
#         res = []
#         if root is None:
#             return stack
        
#         cur = root
#         #stack.append(cur.val)
#         while cur != None or len(stack) != 0:
#             while cur != None:
#                 stack.append(cur)
#                 cur = cur.left
#             cur = stack.pop()
#             res.append(cur.val)
#             cur = cur.right

#         return res             
#         # Time: O(n)
#         ## Space: O(n)
    
    def inorderTraversal(self, root):
        # Threaded Binary Tree
        cur = root
        res = []
        while cur != None:
            if cur.left is None:
                res.append(cur.val)
                cur = cur.right
            else:
                temp_left = cur.left
                temp = cur.left 
                while temp != None and temp.right != None:
                    temp = temp.right
                temp.right = cur
                cur.left = None
                cur = temp_left
        return res
            
            
    
