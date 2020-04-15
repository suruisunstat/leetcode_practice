# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        def postorder(root):
            return postorder(root.left) + postorder(root.right) + [root.val] if root else []
        return ' '.join(map(str, postorder(root)))

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        l = data.split(' ')
        l = [int(item) for item in l if item] # [4,3,2]
        
        def helper(lower = float('-inf'), upper = float('inf')):
            if not l or l[-1] < lower or l[-1] > upper:
                return None
            val = l.pop()
            root = TreeNode(val)
            root.right = helper(val,upper)
            root.left = helper(lower,val)
            return root
        
        root = helper()
        return root
        
        

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.deserialize(codec.serialize(root))
