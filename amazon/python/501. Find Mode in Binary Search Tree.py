# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.cur_count = 0
        self.maxCount = 0
        self.res = []
        self.prev = None 
        
    def findMode(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        
        def dfs(node):
            if node:
                dfs(node.left)
                self.cur_count = 1 if node.val != self.prev else self.cur_count + 1
                if self.cur_count == self.maxCount:
                    self.res.append(node.val)
                elif self.cur_count > self.maxCount:
                    self.maxCount = self.cur_count
                    self.res = []
                    self.res.append(node.val)
                self.prev = node.val 
                dfs(node.right)
                
        dfs(root)
        
        # O(1) space if only using the comparison between current and previous node 
        
        # res = []
        # for key,val in self.count.iteritems():
        #     if val == self.maxCount:
        #         res.append(key)
                
        return self.res 
    
    ## Time: O(n)
    ## Space: O(n)
                
