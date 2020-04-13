class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def backtrack(first = 0):
            if first == n:
                output.append(nums[:])
            for i in range(first, n):
                nums[i], nums[first] = nums[first], nums[i]
                backtrack(first + 1)
                nums[i], nums[first] = nums[first], nums[i]
                
                
                
        n = len(nums)
        output = []
        backtrack()
        return output
        
#         def backtrack(first = 0):
#             # if all integers are used up
#             if first == n:  
#                 output.append(nums[:])
#             for i in range(first, n):
#                 # place i-th integer first 
#                 # in the current permutation
#                 nums[first], nums[i] = nums[i], nums[first] # this works in python, or we can write a swap function to implement
#                 # use next integers to complete the permutations
#                 backtrack(first + 1)
#                 # backtrack
#                 nums[first], nums[i] = nums[i], nums[first]
        
#         n = len(nums)
#         output = []
#         backtrack()
#         return output

# backtrack：if you use a variable/list, update it, and this is used in continuous loop/function, then backtrack to convert it back;
# non backtrack: 257. Binary Tree Paths.py: each path is independent from others, so will not be used by other recursive calls. 

    
    ## Time: O(N!)
    ## Space: O(N!)
