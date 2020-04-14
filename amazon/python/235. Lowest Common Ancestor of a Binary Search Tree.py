# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
#         if not root:
#             return 
        
#         if p.val == root.val or q.val == root.val:
#             return root
#         elif (p.val > root.val and q.val < root.val) or (p.val < root.val and q.val > root.val):
#             return root
#         elif p.val < root.val and q.val < root.val:
#             return self.lowestCommonAncestor(root.left, p, q)
#         else: 
#             return self.lowestCommonAncestor(root.right, p, q)
        
        # Time: O(n)
        # Space: O(n)
        
        ## iterative
        if not root:
            return
        cur = root
        while cur:
            if p.val == cur.val or q.val == cur.val or (p.val < cur.val and q.val > cur.val) or (p.val > cur.val and q.val < cur.val):
                return cur 
            elif p.val > cur.val and q.val > cur.val:
                cur = cur.right
            else:
                cur = cur.left 
        
        ## Time: O(n)
        ## Space: O(n)
        #return None
        
        
        
        
        
        
