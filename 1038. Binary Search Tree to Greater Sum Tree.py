# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def bstToGst(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        def inorder(root,s=[0]):
            if root:
                inorder(root.right)
                s[0] += root.val
                root.val = s[0]
                inorder(root.left)
        inorder(root)
        return root
