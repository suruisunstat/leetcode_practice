# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution(object):
#     def findFrequentTreeSum(self, root):
#         """
#         :type root: TreeNode
#         :rtype: List[int]
#         """
#         def sumOfTree(node):
#             res = 0
#             if not node:
#                 return 0
#             stack = [node]
#             while stack:
#                 cur = stack.pop()
#                 res += cur.val
#                 if cur.left:
#                     stack.append(cur.left)
#                 if cur.right:
#                     stack.append(cur.right)
#             return res
        
        
#         if not root:
#             return None
#         stack = [root]
#         mostFrequentSum = -1
#         sum_count_dict = {}
#         while stack:
#             cur = stack.pop()
#             temp = sumOfTree(cur)
#             print("temp: " + str(temp))
#             if temp not in sum_count_dict:
#                 sum_count_dict[temp] = 1
#             else:
#                 sum_count_dict[temp] += 1
            
#             if sum_count_dict[temp] > mostFrequentSum:
#                 mostFrequentSum = sum_count_dict[temp]
            
#             if cur.left:
#                 stack.append(cur.left)
#             if cur.right:
#                 stack.append(cur.right)
          
#         res_list = []
#         print(sum_count_dict)
#         for key, val in sum_count_dict.items():
#             if val == mostFrequentSum:
#                 res_list.append(key)
#         return res_list
        
        
#         # very time consuming: O(N^2)
        
        def findFrequentTreeSum(self, root):
            if root is None: return []

            def dfs(node):
                if node is None: return 0
                s = node.val + dfs(node.left) + dfs(node.right)
                count[s] += 1
                return s

            count = collections.Counter()
            dfs(root)
            maxCount = max(count.values())
            return [s for s in count if count[s] == maxCount]
    
    # Time: O(n)
    # Space: O(n)
    
