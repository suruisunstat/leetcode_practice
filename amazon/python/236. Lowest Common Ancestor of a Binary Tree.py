# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.ans = None
    
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        
        def dfs(node):
            if not node:
                return False
            left = dfs(node.left)
            right = dfs(node.right)
            mid = node == p or node == q
            if mid + left + right >= 2:
                self.ans = node
            return left or right or mid 
        
        dfs(root) # return True or False 
        return self.ans 
    # Time: O(n)
    # Space: O(n)
        
        
#         parent_dict = {}
        
#         if not root:
#             return 
        
#         find_p = False
#         find_q = False
#         parent_dict[root] = None
#         stack = [root]
        
#         while stack:
#             cur = stack.pop()
#             if find_p and find_q:
#                 break
#             if cur == p:
#                 find_p = True
#             if cur == q:
#                 find_q = True 
#             if cur.left:
#                 stack.append(cur.left)
#                 parent_dict[cur.left] = cur
#             if cur.right:
#                 stack.append(cur.right)
#                 parent_dict[cur.right] = cur
        
#         p_parent_list = []
#         cur_p = p
#         cur_q = q
#         while cur_p:
#             p_parent_list.append(cur_p)
#             cur_p = parent_dict[cur_p]
#         while cur_q not in p_parent_list:
#             cur_q = parent_dict[cur_q]
            
#         return cur_q 
            
        ## Time: O(N)
        ## Space: O(N)
            
            
