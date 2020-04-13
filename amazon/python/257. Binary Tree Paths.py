# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        def dfs(root, path):
            if root:
                path += str(root.val)
                if not root.left and not root.right:
                    paths.append(path)
                
                path += "->"
                dfs(root.left, path)
                dfs(root.right, path)
                
        paths = []
        dfs(root, "")
        return paths 
        
    # Time: O(n)
    # Space: O(n)
                    
    
                
        
#         if not root:
#             return []
        
#         paths = []
#         stack = [(root, str(root.val))]
#         while stack:
#             node, path = stack.pop()
#             if not node.left and not node.right:
#                 paths.append(path)
#             if node.left:
#                 stack.append((node.left, path + '->' + str(node.left.val)))
#             if node.right:
#                 stack.append((node.right, path + '->' + str(node.right.val)))
#         return paths
        
#         def construct_paths(root, path):
#             if root:
#                 path += str(root.val)
#                 if not root.left and not root.right:  # if reach a leaf
#                     paths.append(path)  # update paths  
#                 else:
#                     path += '->'  # extend the current path
#                     construct_paths(root.left, path)
#                     construct_paths(root.right, path)

#         paths = []
#         construct_paths(root, '')
#         return paths
