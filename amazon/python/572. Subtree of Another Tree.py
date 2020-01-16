# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
#     def isSubtree(self,s,t):
#         tree1 = self.preOrder(s,True)
#         tree2 = self.preOrder(t,True)
#         return tree2 in tree1
        
        
        
#     def preOrder(self,s,left):
#         if not s:
#             if left:
#                 return 'lnull'
#             else:
#                 return 'rnull'
#         return '#' + str(s.val) + self.preOrder(s.left, True) + self.preOrder(s.right, False)
    
#     def isSameTree(self,t1,t2):
#         if (not t1) and (not t2):
#             return True
#         elif (not t1) or (not t2):
#             return False
#         else:
#             return t1.val == t2.val and self.isSameTree(t1.left,t2.left) and self.isSameTree(t1.right,t2.right)
    
#     def traverse(self, s, t):
#         return s and (self.isSameTree(s,t) or self.traverse(s.left,t) or self.traverse(s.right,t))
    
#     def isSubtree(self, s, t):
#         """
#         :type s: TreeNode
#         :type t: TreeNode
#         :rtype: bool
#         """
#         return self.traverse(s,t)
        
        # stack = [s]
        # while len(stack) != 0:
        #     cur = stack.pop()
        #     if cur.val == t.val and self.isSameTree(cur,t):
        #         return True
        #     if cur.left:
        #         stack.append(cur.left)
        #     if cur.right:
        #         stack.append(cur.right)
        # return False
    
    # Time: O(m*n)
    # Space: O(n)
    
    
    
    def isSubtree(self, s, t):
        #res = ""
        def preOrder(root,left,res):
            if not root:
                if left:
                    res = res + 'lnull'
                    return res
                else:
                    res = res + 'rnull'
                    return res
            res = res + "#"
            res = res + str(root.val)
            res = preOrder(root.left,True, res) # you have to return something to earn something 
            res = preOrder(root.right,False, res)
            return res 
        
        res_s = preOrder(s,True,"")
        res_t = preOrder(t,True,"")
        print(res_s)
        print(res_t)
        return res_t in res_s 
    
#     # Time:O(m + n + m*n) o(m*n) for: string is a substring 
#     # Space: 0(max(m,n))
        
        
        
        
        
        
