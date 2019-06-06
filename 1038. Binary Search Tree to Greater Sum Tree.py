# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

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

root = TreeNode(4)
root.left = TreeNode(1)
root.left.left = TreeNode(0)
root.left.right = TreeNode(2)
root.left.right.right = TreeNode(3)

root.right = TreeNode(6)
root.right.left = TreeNode(5)
root.right.right = TreeNode(7)
root.right.right.right = TreeNode(8)



sol = Solution()
res = sol.bstToGst(root)

def dfs(root):
    if root:
        print(root.val)
        dfs(root.left)
        dfs(root.right)

dfs(root)
# 30
# 36
# 36
# 35
# 33
# 21
# 26
# 15
# 8
