# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:
    
    def __init__(self):
            self.res = ""
    

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        
        """
        
        def dfs(root):
            if root is None:
                self.res += 'None,'
                return
            self.res += str(root.val) + ","
            dfs(root.left)
            dfs(root.right)
        dfs(root)
        return self.res 
    
        # Time: O(n)
        # Space: O(n)

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        
        
        def backdfs(l):
            if l[0] == 'None':
                l.pop(0)
                return None
                
            root = TreeNode(l[0])
            l.pop(0)
            root.left = backdfs(l)
            root.right = backdfs(l)
            return root
            
        data_list = data.split(",")   
        root = backdfs(data_list)
        return root
    
        # Time: O(n)
        # Space: O(n)
            

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.deserialize(codec.serialize(root))
