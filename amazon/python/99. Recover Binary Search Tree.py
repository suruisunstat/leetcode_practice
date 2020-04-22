# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    
    def recoverTree(self, root):
        x = y = predecessor = pred = None 
        
        while root:
            if root.left:
                predecessor = root.left 
                while predecessor.right and predecessor.right != root:
                    predecessor = predecessor.right
                
                if predecessor.right is None:
                    predecessor.right = root
                    root = root.left 
                
                else:
                    if pred and root.val < pred.val:
                        y = root
                        if x is None:
                            x = pred 
                    pred = root
                    
                    predecessor.right = None
                    root = root.right
            else:
                if pred and root.val < pred.val:
                    y = root
                    if x is None:
                        x = pred
                pred = root
                root = root.right 
                
        x.val, y.val = y.val, x.val 
        
        ## Time: O(n)
        ## Space: O(1) MORRIS 
                
                
                
                
                
                        
        
#         stack = []
#         x = y = pred = None 
        
#         while stack or root:
#             while root:
#                 stack.append(root)
#                 root = root.left 
            
#             root = stack.pop()
#             if pred and root.val < pred.val:
#                 y = root
#                 if x is None:
#                     x = pred
#                 else:
#                     break
            
#             pred = root
#             root = root.right 
        
#         x.val, y.val = y.val, x.val 
    
#     def __init__(self):
#         self.x = None
#         self.y = None
#         self.pred = None 
    
#     def recoverTree(self, root):
#         """
#         :type root: TreeNode
#         :rtype: None Do not return anything, modify root in-place instead.
#         """
#         def find_two_swapped(root):
#             if root is None:
#                 return
#             find_two_swapped(root.left)
#             if self.pred and root.val < pred.val:
#                 self.y = root
#                 if self.x is None:
#                     self.x = pred
#                 else:
#                     return
#             pred = root
#             find_two_swapped(root.right)
        
#         find_two_swapped(root)
#         self.x.val, self.y.val = self.y.val, self.x.val 
        
        
#         def dfs(node):
#             return dfs(node.left) + [node.val] + dfs(node.right) if node else []
        
#         def swapIndex(lst):
#             x = y = float("-inf")
#             for i in range(len(lst)-1):
#                 if lst[i] > lst[i+1]:
#                     y = lst[i+1]
#                     if x == float("-inf"):
#                         x = lst[i]
#                     else:
#                         break
#             return x,y
        
#         def recover(r, count):
#             if r:
#                 if r.val == x or r.val == y:
#                     r.val = y if r.val == x else x
#                     count -= 1
#                     if count == 0:
#                         return
#                 recover(r.left, count)
#                 recover(r.right, count)
    
#         lst = dfs(root)
#         x, y = swapIndex(lst)
#         recover(root,2)
     
#     # Time: O(N)
#     # Space: O(N)
    
    
    
    
                
    
    
   
   
    
    
                
