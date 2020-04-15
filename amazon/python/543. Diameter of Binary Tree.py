# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # if a path goes through a specific root, then the result is depth left + depth right 
    def __init__(self):
        self.ans = 0
    
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def depth(root):
            if not root:
                return 0
            left = depth(root.left)
            right = depth(root.right)
            self.ans = max(self.ans, left + right)
            return max(left, right) + 1
        
        depth(root)
        return self.ans 
    
    # Time: O(N)
    # Space: O(N)
