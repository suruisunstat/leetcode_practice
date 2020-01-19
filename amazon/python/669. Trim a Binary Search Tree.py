# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def trimBST(self, root, L, R):
        def trim(node):
            if not node:
                return None
            elif node.val > R:
                return trim(node.left)
            elif node.val < L:
                return trim(node.right)
            else:
                node.left = trim(node.left)
                node.right = trim(node.right)
                return node
        return trim(root)
#     def trimBST(self, root, L, R):
#         def trim(node):
#             if not node:
#                 return None
#             elif node.val > R:
#                 return trim(node.left)
#             elif node.val < L:
#                 return trim(node.right)
#             else:
#                 node.left = trim(node.left)
#                 node.right = trim(node.right)
#                 return node
            
#         return trim(root)
    
    # Time: O(n)
    # Space: O(n)
    
    
    
    
        
#     def trimBST(self, root, L, R):
#         """
#         :type root: TreeNode
#         :type L: int
#         :type R: int
#         :rtype: TreeNode
#         """
#         #res = []
#         def inorder(node,res):
#             if node:
#                 inorder(node.left, res)
#                 res.append(node.val)
#                 inorder(node.right, res)
#             return res
        
#         #res1 = inorder(root, [])
#         #print(res1)
#         val_to_delete = []
#         stack = []
    
#         if not root:
#             return root
        
#         def minValue(node):
#             current = node
#             while current.left:
#                 current = current.left
#             return current

#         def delete(root, key):
#             if not root:
#                 return root
#             if key < root.val:
#                 root.left = delete(root.left, key)
#             elif key > root.val:
#                 root.right = delete(root.right, key)
#             else:
#                 if (not root.left):
#                     temp = root.right
#                     root = None
#                     return temp
#                 elif (not root.right):
#                     temp = root.left
#                     root = None
#                     return temp
                
#                 next_min = minValue(root.right)
#                 root.val = next_min.val
#                 print("root.val: " + str(root.val))
#                 root.right = delete(root.right, next_min.val)
#             return root
    
#         stack.append(root)
#         while stack != []:
#             cur = stack.pop()
#             if cur.val > R or cur.val < L:
#                 val_to_delete.append(cur.val)
#             if cur.right:
#                 stack.append(cur.right)
#             if cur.left:
#                 stack.append(cur.left)

#         print(val_to_delete)
#         print(root.val)
#         for key in val_to_delete:
#             root = delete(root, key)
#         #root = delete(root, 24)
#         print("inorder after:")
#         print(inorder(root,[]))
#         return root

        
    
    
    # delete is O(n)
                
            
                
        
        
