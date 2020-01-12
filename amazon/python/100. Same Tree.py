# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # def isSameTree(self, p, q):
    #     """
    #     :type p: TreeNode
    #     :type q: TreeNode
    #     :rtype: bool
    #     """
    #     if (not p) and (not q):
    #         return True
    #     elif (p and (not q)) or (q and (not p)):
    #         return False
    #     else:
    #         return p.val == q.val and self.isSameTree(p.left,q.left) and self.isSameTree(p.right, q.right) 
    # # Time: O(n)
    # # Space: O(n)
    
    # iteration 
    def isSameTree(self, p, q):
        # if (not p) and (not q):
        #     return True
        # elif ((not p) and q) or ((not q) and p):
        #     return False
        # else:
        stack_p = []
        stack_q = []

        stack_p.append(p)
        stack_q.append(q)
        #print(len(stack_p),len(stack_q))
        while len(stack_p) != 0 and len(stack_q) != 0:
            cur_p = stack_p.pop(0)
            cur_q = stack_q.pop(0)
            #print(len(stack_p),len(stack_q))
            if (not cur_p) and (not cur_q):
                continue
            elif ((not cur_p) and cur_q) or ((not cur_q) and cur_p) or (cur_p.val != cur_q.val):
                return False
            else:
                #print("add")
                stack_p.append(cur_p.left)
                stack_q.append(cur_q.left)
                stack_p.append(cur_p.right)
                stack_q.append(cur_q.right)
        return True 
    ## BFS 
    ## Time:O(n)
    # Space: O(n)
            
             
            
