# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pruneTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if not root:
            return None
        root.left = self.pruneTree(root.left)
        root.right = self.pruneTree(root.right)
        
        if root.val == 0 and (not root.left) and (not root.right):
            root = None
        return root 
    # Time: O(n)
    # Space; O(n)
        
        # def containsOne(node):
        #     if not node: return False
        #     a1 = containsOne(node.left)
        #     a2 = containsOne(node.right)
        #     if not a1: node.left = None
        #     if not a2: node.right = None
        #     return node.val == 1 or a1 or a2
        # return root if containsOne(root) else None 
            
    # Time: O(n)
    # space: O(h)
